ALTER TABLE book DROP price;

UPDATE book SET detailed_price=0.0 WHERE detailed_price IS NULL;
