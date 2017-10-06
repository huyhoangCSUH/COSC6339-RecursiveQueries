This is the code to generate SQL Recursive Queries for HP Vertica database.
It has been simplified to serve the purpose of the class, so there are many hard-coded pa$

Make any modification needed in the main function (RQ_CALL.java) then compile them:
```
javac *.java
```
If you have Java 8 on your machine, do this instead:
```
javac -source 1.7 -target 1.7 *.java
```
To make it run with your table, modify the hard-coded parameters in RQ_CALL.java's main f$
The txt filename should be changed accordingly, with the format: tableName and recursive_$

