SET SQL_SAFE_UPDATES = 0;

UPDATE test.book SET book.preface = book.description;

ALTER TABLE test.book MODIFY COLUMN description varchar(5000) NULL DEFAULT NULL;
