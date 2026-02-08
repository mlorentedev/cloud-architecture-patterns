ALTER TABLE book ADD preface VARCHAR(5000);

UPDATE book SET book.preface = book.description;