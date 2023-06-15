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







