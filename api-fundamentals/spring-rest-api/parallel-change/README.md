# Parallel Change strategy

## Setup  

Need to run MySQL on Docker container first.

``` sh
docker run --name mysql -d -e MYSQL_ROOT_PASSWORD=pass -e MYSQL_DATABASE=test -p 3306:3306 mysql:8
```

## Change log

### **v1 - 1.0.0**

Initial version.

*<http://localhost:8881/api/books/>*  

### **v2 - 2.0.0**

Add new column `preface` to `book` table as string. Need to copy `description` value to `preface` to guarantee the value is not null.

This version deals with `description` and `preface` fields.

*<http://localhost:8882/api/books/>*  

### **v3 - 3.0.0**

Migrates all `description` fields to `preface` renaming all references.

All `description` references are no longer available.

*<http://localhost:8883/api/books/>*  

### **v4 - 4.0.0**

Remove `description` column from the database schema.

*<http://localhost:8884/api/books/>*  

### **v5 - 5.0.0**

Add `price` field to `book` table as integer data type that can be null.

*<http://localhost:8885/api/books/>*  

### **v6 - 6.0.0**

Add `detailedPrice` field to `book` table as float value which can be null. Need to copy `price` value to `detailedPrice` to guarantee consistency.

This version deals with `price` and `detailedPrice` fields.

*<http://localhost:8886/api/books/>*  

### **v7 - 7.0.0**

Delete `price` implementation. No change since database values for `price` and `detailedPrice` can be null.

*<http://localhost:8887/api/books/>*  

### **v8 - 8.0.0**

Remove `price` column from the database schema.

*<http://localhost:8888/api/books/>*  
