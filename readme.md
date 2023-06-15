[toc]

# Интструкция для работы с Git и удаленным репозиторием

## Что такео Git?

Git - это одна из реализаций распределенных систем контроля версий, имеющая как локальниые, так и удлаенные репозитории.
Является самой популярной реализацией систем контроля версий в мире.

## Подготовка репозитория 

Для создания репозитория необходимо выполнить команду 'git init' в папке с репозиторием:

```
git init
```

После чего у вас создастся репозиторий (появится скртая папка `.git`):

```
git/
├── branches
├── config
├── description
├── HEAD
├── hooks
│   ├── applypatch-msg.sample
│   ├── commit-msg.sample
│   ├── fsmonitor-watchman.sample
│   ├── post-update.sample
│   ├── pre-applypatch.sample
│   ├── pre-commit.sample
│   ├── pre-merge-commit.sample
│   ├── prepare-commit-msg.sample
│   ├── pre-push.sample
│   ├── pre-rebase.sample
│   ├── pre-receive.sample
│   ├── push-to-checkout.sample
│   └── update.sample
├── info
│   └── exclude
├── objects
│   ├── info
│   └── pack
└── refs
    ├── heads
    └── tags
```
## Создание коммитов

### Git add

Для добавления изменнений  в коммит используется команда `git add`.

Для того что бы использовать команду `git add` напишите:

```
git add <имя файла>
```

### Просмотр состояния репозитория

Для того что бы проверить стсояние репозитория используется команда `git status`.
Для этого необходимо в папке с репозиторием  написать:

```
git status
```

и вы увидите былили изменения в файлах или их не было.

### Создание коммитов

Для того что бы создать коммит (сохранение) необходимо выполнить команду `git commit`.

Выполняется она так:

```
git commit -am"Создание коммитов"

[main 774354c] Просмотр состояния репозитория
 1 file changed, 10 insertions(+), 2 deletions(-)
```

## Состояния файлов

**Untracked** - файл не под версионным контролем

```bash
touch file
```

```bash
git status

On branch master
No commits yet
Untracked files:
  (use "git add <file>..." to include in what will be committed)

    file
```

**Staged** - отслеживаемый файл 

```bash
git add file
```

```bash
git status
On branch master
Changes to be committed:
  (use "git reset HEAD <file>..." to unstage)

    new file:   file
```

**Unstage** - файл удален из трекинга

```bash
git reset HEAD file        # или выташить из репозитория в index конкретный файл
```

```bash
git status 

On branch master
Untracked files:
  (use "git add <file>..." to include in what will be committed)

    file
```

**Modified** - внесенные изменения в working directory

>  Внесём изменения в файл

```bash
git status

On branch master
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

    modified:   file
```

## Ветвление

### Просмотр веток

```bash
git branch      # Просмотр всех существующих веток.
* master
```

```bash
git branch -a		# all все скрытые ветки тоже
* master
```

```bash
git branch -v		# Подробно с hash-code и коментариями.
* master 795dda0 initialization commit
```

### Новая ветка

```bash
git branch fork_first           # Create branch
git branch -v
 feature 795dda0 commit A       # новая ветка будет указывать на тот же коммит что и мастер
* master 795dda0 commit A       # *сейчас мы в мастере
```

### Переключение весток

Коммиты - не принадлежат веткам. Структура коммитов существует сама по себе безотносительно них. Ветки накладываются поверх коммитов как указатели. Это, например, означает, что изменение коммита общего для нескольких веток отражается на всех ветках, в которые попал этот коммит.

### `checkout`

`git checkout <branch>`    -     переключаться между **branch** (ветками)​

```bash
git checkout feature
git branch -v
* feature 795dda0 commit A          # *теперь мы в feature
  master  795dda0 commit A
```

`-b` - создать ветку и сразу перейти в нее

```bash
git checkout -b fix                # Create and Switched to a new branch 'fix'
git branch -v
  feature 795dda0 commit A
* fix     795dda0 commit A         # *Ветка создана и мы сразу в нее перешли.
  master  795dda0 commit A
```

На этой стадии  если в index'е есть каикето неакомиченные изменения то они все попадут в нову ветку. Чтобы эти изменения стали раздельными нужно сделать хотя бы 1 коммит в новой веткке.

`-f` `--force` - принудительно переключиться а другую ветку.

Если при переключении веток есть какието <u>не проиндексированные изменения в working directory</u>, то git выдаст ошибку.

```bash
error: Your local changes to the following files would be overwritten by checkout:
    file
Please commit your changes or stash them before you switch branches.
Aborting
```

т.к. при переключении веток, git из индекса <u>**перезаписывает файлы** в **working directory**</u> (Перезаписывает содержимым на которое указывает HEAD). Так гит предупреждает что бы случайно не затереть не проиндексированные изменения.

Параметр `--force` - позволяет принудительно переключиться на другую ветку, перезаписав working directory.

```bash
git checkout -f master     # все файлы перезапишутся версиями из master
```

​    Если мы находимся в ветке и еще не делали commit и хотим удалить все изменения и вернутся к последнему коммиту:

```bash
git checkout -f HEAD    
```

Если файлы еще не готовы для коммита, но нужно переключиться на другую ветку, то текущие изменения можно сохранить в специаотном стеке `git stash`  и позже востановить их.
## Удаление ветки

```bash
git branch -d fork_first  # удалить если ветка смержина
git branch -D fork_two    # принудительно удалить в любом случае   
```

Если коммиты были в ветках то при удаление сами коммиты останутся в проекте. Удаляются только (ссылки)

Поэтому можно отменить удаление создав новую ссылку на ветку

```bash
git branch new_name hash   # hash коммта головы удаленной ветки
```

## Переименование ветки

```bash
git branch -m novoje-imia
```

## Слияние

### Fast-forward

Fast-forward - Происходит тогда когда изменения в новой ветке (созданной от master ветки), не конфликтуют с мастер-веткой (те в мастере не должно быть изменений). Получается что новая ветка, фактически, просто продолжает мастер-ветку. ( т.е. сливаемая ветка прямой потомок)

```mermaid
graph LR;
subgraph master
    init(b3d4)---A(2ec0)---B(4bcb):::HEAD
end
subgraph fix
    B-.->D(6c9e)---E(f091)
end
classDef HEAD fill:#686E00;
```

В этом случае git просто перенесет указатель **(master)** на голову новой ветки и сделает ее частью master.

```mermaid
graph LR;
subgraph HEAD -> master, fix
    init(b3d4)---A(2ec0)---B(4bcb)---D(6c9e)---E(f091):::HEAD
end
classDef HEAD fill:#686E00;
```

**merge**

```bash
git merge feature 
Updating 795443f..725eea8
Fast-forward
 file | 5 ++++-
 1 file changed, 4 insertions(+), 1 deletion(-)
```

Так как тут нет никаких других наследников, то нет смысла делать слияние и гит просто переносит указатель сливая мастер  с feature в одну ветку.

```bash
git log --all --graph --oneline
* 725eea8 (HEAD -> master, feature) commit AC
* 98d6d2b commit AB
* 8109537 commit AA
    .    .    .
```

### Истинностное слияни

Перед слиянием желательно что бы статус был чиситый

```bash
git status
On branch feature
nothing to commit, working tree clean
```

После запуска `merge` буедт искать коммит на котором ветки разделились (общий коммит предок - **base**)

```bash
git merge-base master feature # показать hesh общего предка(комита разделения) этих 2х веток
f02a15e2370aff744c9f00c734a4fe3da5037126
```

При автоматическом мердже git сливает ветки следущим способом:

**base** + (**our** changes) + (**their** changes) -> merge

        **base** - общая ветка предок
        **our** - наша ветка на кторой находимя (master)
        **their** - сливаемая ветка

```bash
git checkout master                 # переходим в мастер
Switched to branch 'master'
```

```bash
git merge feature                 # указываем ветку откуда сливать изменения
```

На этом этапе мы попадаем в состояние прерванного слияния:

```bash
Auto-merging file
CONFLICT (content): Merge conflict in file
Automatic merge failed; fix conflicts and then commit the result.
```

а сливаемый коммит из (feature) гитзапоминает в файле `.git/MERGE_HEAD`:

```bash
cat .git/MERGE_HEAD 
78ff95d17e22d7f5c6ce4a7b71b1dcf18b4f7f0e
```

На этом этапе в конфликном фале нужно принять решения какие изменения оставляем и сделать коммит.

```bash
first line
<<<<<<< HEAD
second line
three line
=======
2-nd line
3-d line
>>>>>>> feature
```

### `--ours`, `--theirs`, `--merge`

Это можно сделать вручную оректировав конфликтный файл или  с помощью кооманд:

```bash
git checkput --ours file_two   # вытащить версию ту что в мастере(HEAD)
```

```bash
git checkput --theirs file_two # вытащить версию ту что в (feature)
```

```bash
git checkout --merge file_two  # оставить как есть (версия с маркерами конфликта)
```

