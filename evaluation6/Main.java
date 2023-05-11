package evaluation6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Operations operations = new Operations();
    public static void main(String[] args) throws IOException, SQLException {
        /*
        1 Teacher many students
         */
        while(true) {
            System.out.println("-------------------------------------------------");
            System.out.println("enter 1 for RETRIEVE");
            System.out.println("enter 2 for UPDATE");
            System.out.println("enter 3 for DELETE");
            System.out.println("enter 4 for INSERT");
            System.out.println("enter 5 for student name 'Z'");
            System.out.println("enter 6 for teacher Exp >=5 ");
            System.out.println("enter 7 for teachercity = pune/mumbai & name ends with 'A'");
            System.out.println("enter 0 for exit");
            System.out.println("-------------------------------------------------");
            System.out.println("Enter choice");
            int choice = Integer.parseInt(br.readLine());

            switch(choice){
                case 1:
                    System.out.println("-- RETRIEVE");
                    operations.retrieve();
                    break;
                case 2:
                    System.out.println("-- UPDATE");
                    operations.update();

                    break;
                case 3:
                    System.out.println("--  DELETE");
                    operations.delete();
                    break;
                case 4:
                    System.out.println("-- INSERT");
                   //operations.insert();
                    boolean b = operations.insert();
                    break;
                case 5:
                    System.out.println("-- student name 'z'");
                    operations.query1();
                    break;
                case 6:
                    System.out.println("-- teacher Exp >=5");
                    operations.query2();
                    break;
                case 7:
                    System.out.println("-- teachercity = pune/mumbai & name ends with 'A'");
                    operations.query3();
                    break;
                case 0:
                    System.out.println("-- EXIT");
                    System.exit(0);
                default:
                    System.out.println("-- Enter valid choice");
            }

        }
    }
}

/*
OUTPUT---------
-------------------------------------------------
enter 1 for RETRIEVE
enter 2 for UPDATE
enter 3 for DELETE
enter 4 for INSERT
enter 5 for student name 'Z'
enter 6 for teacher Exp >=5
enter 7 for teachercity = pune/mumbai & name ends with 'A'
enter 0 for exit
-------------------------------------------------
Enter choice
1
-- RETRIEVE
ch: 1  for student, 2 for teacher, 0 to EXIT --
1
Id: 1
Name: harini
sub: java
City: mumbai
marks: 90
tid: 1
----------------------------------
Id: 2
Name: zeenath
sub: java
City: pune
marks: 89
tid: 1
----------------------------------
Id: 3
Name: hari
sub: python
City: pune
marks: 69
tid: 2
----------------------------------
Id: 4
Name: zeenathi
sub: java
City: pune
marks: 79
tid: 1
----------------------------------
Id: 5
Name: zeenath
sub: java
City: pune
marks: 89
tid: 2
----------------------------------
Id: 6
Name: aniket
sub: java
City: pune
marks: 89
tid: 2
----------------------------------
Id: 11
Name: tanmay
sub: java
City: pune
marks: 90
tid: 1
----------------------------------
Id: 15
Name: krati
sub: python
City: indore
marks: 90
tid: 5
----------------------------------
ch: 1  for student, 2 for teacher, 0 to EXIT --
2
tId: 1
tName: Gita
tsub: java
tCity: hyd
texp: 7
-------------------------------------
tId: 2
tName: sita
tsub: python
tCity: mumbai
texp: 5
-------------------------------------
tId: 5
tName: aarti
tsub: java
tCity: pune
texp: 7
-------------------------------------
tId: 6
tName: mahi
tsub: cpp
tCity: mumbai
texp: 3
-------------------------------------
ch: 1  for student, 2 for teacher, 0 to EXIT --
0
-------------------------------------------------
enter 1 for RETRIEVE
enter 2 for UPDATE
enter 3 for DELETE
enter 4 for INSERT
enter 5 for student name 'Z'
enter 6 for teacher Exp >=5
enter 7 for teachercity = pune/mumbai & name ends with 'A'
enter 0 for exit
-------------------------------------------------
Enter choice
2
-- UPDATE
ch: 1  for student, 2 for teacher, 0 to EXIT --
1
enter student id
5
enter student marks
75
ch: 1  for student, 2 for teacher, 0 to EXIT --
1
enter student id
4
enter student marks
83
ch: 1  for student, 2 for teacher, 0 to EXIT --
2
enter teacher id
2
enter teacher city
hyd
ch: 1  for student, 2 for teacher, 0 to EXIT --
0
-------------------------------------------------
enter 1 for RETRIEVE
enter 2 for UPDATE
enter 3 for DELETE
enter 4 for INSERT
enter 5 for student name 'Z'
enter 6 for teacher Exp >=5
enter 7 for teachercity = pune/mumbai & name ends with 'A'
enter 0 for exit
-------------------------------------------------
Enter choice
3
--  DELETE
ch: 1  for student, 2 for teacher, 0 to EXIT --
1
enter student id
4
ch: 1  for student, 2 for teacher, 0 to EXIT --
2
enter teacher id
6
ch: 1  for student, 2 for teacher, 0 to EXIT --
0
-------------------------------------------------
enter 1 for RETRIEVE
enter 2 for UPDATE
enter 3 for DELETE
enter 4 for INSERT
enter 5 for student name 'Z'
enter 6 for teacher Exp >=5
enter 7 for teachercity = pune/mumbai & name ends with 'A'
enter 0 for exit
-------------------------------------------------
Enter choice
4
-- INSERT
ch: 1  for student, 2 for teacher, 0 to EXIT --
1
enter student id
16
enter student name
tara
enter student sub
java
enter student city
hyd
enter student marks
80
enter student tid
2
ch: 1  for student, 2 for teacher, 0 to EXIT --
2
enter teacher id
3
enter teacher name
shraddha
enter teacher sub
mysql
enter teacher city
pune
enter teacher exp
8
ch: 1  for student, 2 for teacher, 0 to EXIT --
0
-------------------------------------------------
enter 1 for RETRIEVE
enter 2 for UPDATE
enter 3 for DELETE
enter 4 for INSERT
enter 5 for student name 'Z'
enter 6 for teacher Exp >=5
enter 7 for teachercity = pune/mumbai & name ends with 'A'
enter 0 for exit
-------------------------------------------------
Enter choice
5
-- student name 'z'
Id: 2
Name: zeenath
sub: java
City: pune
marks: 89
tid: 1
-------------------------------------
Id: 5
Name: zeenath
sub: java
City: pune
marks: 75
tid: 2
-------------------------------------
-------------------------------------------------
enter 1 for RETRIEVE
enter 2 for UPDATE
enter 3 for DELETE
enter 4 for INSERT
enter 5 for student name 'Z'
enter 6 for teacher Exp >=5
enter 7 for teachercity = pune/mumbai & name ends with 'A'
enter 0 for exit
-------------------------------------------------
Enter choice
6
-- teacher Exp >=5
tId: 1
tName: Gita
tsub: java
tcity: hyd
texp: 7
--------------------------------------
tId: 2
tName: sita
tsub: python
tcity: hyd
texp: 5
--------------------------------------
tId: 3
tName: shraddha
tsub: mysql
tcity: pune
texp: 8
--------------------------------------
tId: 5
tName: aarti
tsub: java
tcity: pune
texp: 7
--------------------------------------
-------------------------------------------------
enter 1 for RETRIEVE
enter 2 for UPDATE
enter 3 for DELETE
enter 4 for INSERT
enter 5 for student name 'Z'
enter 6 for teacher Exp >=5
enter 7 for teachercity = pune/mumbai & name ends with 'A'
enter 0 for exit
-------------------------------------------------
Enter choice
2
-- UPDATE
ch: 1  for student, 2 for teacher, 0 to EXIT --
2
enter teacher id
1
enter teacher city
pune
ch: 1  for student, 2 for teacher, 0 to EXIT --
2
enter teacher id
2
enter teacher city
mumbai
ch: 1  for student, 2 for teacher, 0 to EXIT --
0
-------------------------------------------------
enter 1 for RETRIEVE
enter 2 for UPDATE
enter 3 for DELETE
enter 4 for INSERT
enter 5 for student name 'Z'
enter 6 for teacher Exp >=5
enter 7 for teachercity = pune/mumbai & name ends with 'A'
enter 0 for exit
-------------------------------------------------
Enter choice
7
-- teachercity = pune/mumbai & name ends with 'A'
-------------------------------------------------
enter 1 for RETRIEVE
enter 2 for UPDATE
enter 3 for DELETE
enter 4 for INSERT
enter 5 for student name 'Z'
enter 6 for teacher Exp >=5
enter 7 for teachercity = pune/mumbai & name ends with 'A'
enter 0 for exit
-------------------------------------------------
Enter choice
2
-- UPDATE
ch: 1  for student, 2 for teacher, 0 to EXIT --
2
enter teacher id
1
enter teacher city
pune
ch: 1  for student, 2 for teacher, 0 to EXIT --
2
enter teacher id
2
enter teacher city
mumbai
ch: 1  for student, 2 for teacher, 0 to EXIT --
0
-------------------------------------------------
enter 1 for RETRIEVE
enter 2 for UPDATE
enter 3 for DELETE
enter 4 for INSERT
enter 5 for student name 'Z'
enter 6 for teacher Exp >=5
enter 7 for teachercity = pune/mumbai & name ends with 'A'
enter 0 for exit
-------------------------------------------------
Enter choice
7
-- teachercity = pune/mumbai & name ends with 'A'
Id: 1
Name: harini
sub: java
city: mumbai
marks: 90
stId: 1
--------------
tId: 1
tName: Gita
tsub: java
tcity: pune
texp: 7
--------------------------------------
Id: 2
Name: zeenath
sub: java
city: pune
marks: 89
stId: 1
--------------
tId: 1
tName: Gita
tsub: java
tcity: pune
texp: 7
--------------------------------------
Id: 11
Name: tanmay
sub: java
city: pune
marks: 90
stId: 1
--------------
tId: 1
tName: Gita
tsub: java
tcity: pune
texp: 7
--------------------------------------
Id: 3
Name: hari
sub: python
city: pune
marks: 69
stId: 2
--------------
tId: 2
tName: sita
tsub: python
tcity: mumbai
texp: 5
--------------------------------------
Id: 5
Name: zeenath
sub: java
city: pune
marks: 75
stId: 2
--------------
tId: 2
tName: sita
tsub: python
tcity: mumbai
texp: 5
--------------------------------------
Id: 6
Name: aniket
sub: java
city: pune
marks: 89
stId: 2
--------------
tId: 2
tName: sita
tsub: python
tcity: mumbai
texp: 5
--------------------------------------
Id: 16
Name: tara
sub: java
city: hyd
marks: 80
stId: 2
--------------
tId: 2
tName: sita
tsub: python
tcity: mumbai
texp: 5
--------------------------------------
 */