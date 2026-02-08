SET SQL_SAFE_UPDATES = 0;

ALTER TABLE book ADD detailed_price FLOAT(24);

UPDATE book SET book.detailed_price = book.price;