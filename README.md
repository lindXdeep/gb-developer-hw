# База данных в музее

Задача "Сформировать структуру базы данных для музея"

1. Посетить любой музей в вашем городе. Сделать фотоотчет (фото музея, себя на фоне музея/внутри музея)
2. Составить в экселе базу данных со следующей структурой: название таблиц, название полей, название параметров, описание полей, описание параметров. База данных должна включать не менее 30 таблиц!
3. Нарисовать взаимосвязи таблиц (miro/draw.io/excel).

4. Написать сценарий использования созданной базы данных.

****

```mermaid
erDiagram

position ||--|| employee : contains
salary ||--|| employee : contains

artist }|--|{ artist_style : contains
style  }|--|{ artist_style : contains

art_object ||--|| art_type : contains
art_object ||--|| material : contains
art_object ||--|| artist : contains

exhibition ||--|{ reviews : contains
exhibition ||--|{ art_object : contains
exhibition ||--|| hall : contains

storage ||--|| art_object : contains
storage ||--|| employee : contains

visit ||--|| visitor : contains
visit ||--|{ exhibition : contains

ticket }|--|| visitor : contains
ticket ||--|| exhibition : contains
sales }|--|| visitor : contains
sales ||--|{ ticket : contains

art_department ||--|| manager : contains
restorers ||--|| employee : contains
restorers ||--|| art_department : contains

guides ||--|| employee : contains
guides ||--|{ language  : contains
administration ||--|| employee : contains

position {
	INT id
	VARCHAR title
}

employee {
	PRIMARY_KEY id
	VARCHAR first_name
	VARCHAR last_name
	VARCHAR surname
	FOREIGN_KEY id_position_fk
}

salary {
	PRIMARY_KEY id
	FOREIGN_KEY id_employee_fk
	DECIMAL amount
}

visitor {
	PRIMARY_KEY id
	VARCHAR name
	VARCHAR address
	BIGINT tel
}

visit {
	PRIMARY_KEY id
	TIMESTAMP time
	FOREIGN_KEY id_visitors_fk
	FOREIGN_KEY id_exhibition_fk
}

ticket {
	PRIMARY_KEY id
	FOREIGN_KEY id_visitor_fk
	FOREIGN_KEY id_exhibition_fk
	DATE date
	DECIMAl price
}

sales {
	PRIMARY_KEY id
	DATE date
	TIMESTAMP time
	FOREIGN_KEY id_visitor_fk
	FOREIGN_KEY id_ticket_fk
}


artist_style {
  FOREIGN_KEY id_style_fk
  FOREIGN_KEY id_artist_fk
}

style{
    PRIMARY_KEY id
    VARCHAR title
}

artist {
    PRIMARY_KEY id
    VARCHAR name
    DATE born 
    DATE dead
    FOREIGN_KEY id_style_fk
}

material {
    PRIMARY_KEY id
    VARCHAR title
}

art_type {
    PRIMARY_KEY id
    VARCHAR name
}

art_object {
    PRIMARY_KEY id
    FOREIGN_KEY id_art_type_fk
    FOREIGN_KEY id_material_fk
    FOREIGN_KEY id_artist_fk
}

hall {
	 PRIMARY_KEY id
	 VARCHAR title
	 int flour
	 TIMESTAMP open
	 TIMESTAMP close
}

reviews {
  PRIMARY_KEY id
  VARCHAR message
}

exhibition {
    PRIMARY_KEY id
    VARCHAR name
    TIMESTAMP start
    TIMESTAMP close
    FOREIGN_KEY id_hall_fk
    FOREIGN_KEY id_art_object_fk
}

storage {
 	PRIMARY_KEY id
 	INT row
 	INT shelf
	FOREIGN_KEY id_art_object_fk
	FOREIGN_KEY id_employee_fk
}

language {
	PRIMARY_KEY id
	VARCHAR title
}

manager {
	PRIMARY_KEY id
	FOREIGN_KEY id_employee_fk
	BIGINT tel
}

art_department {
	PRIMARY_KEY id
	VARCHAR department_name
	FOREIGN_KEY id_manager_fk
}

restorers {
	PRIMARY_KEY id
	FOREIGN_KEY id_employee_fk
	FOREIGN_KEY id_art_department_fk
	BIGINT tel
}

guides {
	PRIMARY_KEY id
	FOREIGN_KEY id_employee_fk
	FOREIGN_KEY id_language_fk
	BIGINT tel
}

administration {
	PRIMARY_KEY id
	FOREIGN_KEY id_employee_fk
	BIGINT tel
}


```

Сценарий

1. **employee** - сотрудник музея
2. **position** - его должность
3. **salary** - зарплата сотрудникам музея
4. **art_type** - тип искусства картина, гравюра, скульптура и тп 
5. **material** - материал, ксилогра́фия, метал, акварель, масло, карандаш итп
6. **artist** - художник,  его имя, время жзни. стиль рисования
7. **style** - сталь художника (классицизм, абстракционизм, реализм, символизм)
8. **exhibition** - выставка,  в ней номер зала, тип арт объекта, название выставки, 
9. **hall** - зал,  название зала , время когда он открыт
10. **storage** - склад,  что лежит на складе, ряд,  полка, ответственный сотрудник.
11. **visit** - таблица посещения
12. **visitor** - посетители
13. **ticket** билеты
14. **sales** - проданные билеты
15. **reviews** - отзыв
16. **restorers** реставраторы
17. **guides** - гиды
18. **administration** - административный персонал
19. **manager** - менеджеры музея
20. **art_departnment** - художественный отдел









