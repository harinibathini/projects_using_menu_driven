package exambooking;
import java.util.Scanner;
public class ExaminationPortal implements Runnable{
    @Override
    public void run() {
        System.out.println(">>>>>>>>   Welcome to the Examination Portal   <<<<<<<<");
        System.out.println(">>>>>>>>   Please follow the below cases to check your EXAM SCHEDULE and ELIGIBILITY   <<<<<<<<");
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            ViewAttendance viewAttendance = new ViewAttendance();
            CheckEligibility checkEligibility = new CheckEligibility();
            ViewExamSchedule viewExamSchedule = new ViewExamSchedule();
            System.out.println("------------------------------------------------");
            System.out.println("Please enter your choice as: ");
            System.out.println("***  '1' to check your Attendance  ***");
            System.out.println("***  '2' to check Eligibility for Exam  ***");
            System.out.println("***  '3' to check Exam Schedule  ***");
            System.out.println("***  '4' to check Regularization  ***");
            System.out.println("***  '0' to Exit  ***");
            System.out.println("------------------------------------------------");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("---  View Attendance  ---");
                    viewAttendance.displayDetails();
                    viewAttendance.displayAttendance();
                    break;
                case 2:
                    System.out.println("---  Check Eligibility  ---");
                    checkEligibility.eligibleOrNot();
                    break;
                case 3:
                    if(!checkEligibility.isEligible){
                      try{
                            throw new NoMinimumAttendanceException();
                        }catch(NoMinimumAttendanceException e){

                      }
                    }else {
                        System.out.println("---  View Exam Schedule  ---");
                        viewExamSchedule.displaySchedule();
                    }
                    break;
                case 4:
                    System.out.println("---  View Regularization  ---");
                    Regularization regularization = new Regularization();
                    regularization.updateAttendance();
                    break;
                case 0:
                    flag = false;
                    System.out.println("---  EXIT  ---");
                    System.exit(0);
                    break;
                default:
                    System.out.println("---  Please enter a valid choice  ---");
            }
        }

    }

    public static void main(String[] args) {
        ExaminationPortal examinationPortal = new ExaminationPortal();
        Thread thread = new Thread(examinationPortal);
        thread.start();
    }
}

/*
>>>>>>>>   Welcome to the Examination Portal   <<<<<<<<
>>>>>>>>   Please follow the below cases to check your EXAM SCHEDULE and ELIGIBILITY   <<<<<<<<
------------------------------------------------
Please enter your choice as:
***  '1' to check your Attendance  ***
***  '2' to check Eligibility for Exam  ***
***  '3' to check Exam Schedule  ***
***  '4' to check Regularization  ***
***  '0' to Exit  ***
        ------------------------------------------------
        1
        ---  View Attendance  ---
        --  Enter your Name
        Harini
        --  Enter your ID
        3
        --  Enter your Attendance for this semester
        80
        --  Your Attendance is: 80.0
        ------------------------------------------------
        Please enter your choice as:
        ***  '1' to check your Attendance  ***
        ***  '2' to check Eligibility for Exam  ***
        ***  '3' to check Exam Schedule  ***
        ***  '4' to check Regularization  ***
        ***  '0' to Exit  ***
        ------------------------------------------------
        2
        ---  Check Eligibility  ---
        You are Eligible for attending Exams
        ------------------------------------------------
        Please enter your choice as:
        ***  '1' to check your Attendance  ***
        ***  '2' to check Eligibility for Exam  ***
        ***  '3' to check Exam Schedule  ***
        ***  '4' to check Regularization  ***
        ***  '0' to Exit  ***
        ------------------------------------------------
        3
        ---  View Exam Schedule  ---
        The Exam Schedule of this semester :
        -----------------------------------------------
        |   S.no   |     Subject     |  Date Of Exam  |
        - - - - - - - - - - - - - - - - - - - - - - - -
        |     1    |     JAVA        |   16-03-2023   |
        |     2    |     PYTHON      |   18-03-2023   |
        |     3    |     C++         |   20-03-2023   |
        |     4    |     MYSQL       |   23-03-2023   |
        -----------------------------------------------
        ------------------------------------------------
        Please enter your choice as:
        ***  '1' to check your Attendance  ***
        ***  '2' to check Eligibility for Exam  ***
        ***  '3' to check Exam Schedule  ***
        ***  '4' to check Regularization  ***
        ***  '0' to Exit  ***
        ------------------------------------------------
        4
        ---  View Regularization  ---
        ------------------------------------------------------------
        -- Enter your reason for Absence as:
        '1' for updating attendance for event leaves
        '2' for updating attendance for emergency leaves
        '3' for updating attendance for homeVisit leaves
        '0' to exit and to view your Updated Attendance
        ------------------------------------------------------------
        1
        your attendance will be: 3 % + current attendance % for each eventLeave
        Enter the no. of events attended
        1
        ------------------------------------------------------------
        -- Enter your reason for Absence as:
        '1' for updating attendance for event leaves
        '2' for updating attendance for emergency leaves
        '3' for updating attendance for homeVisit leaves
        '0' to exit and to view your Updated Attendance
        ------------------------------------------------------------
        3
        your attendance will be: 2 % + current attendance % for each homeVisitLeave
        Enter the no. of homeVisit leaves
        1
        ------------------------------------------------------------
        -- Enter your reason for Absence as:
        '1' for updating attendance for event leaves
        '2' for updating attendance for emergency leaves
        '3' for updating attendance for homeVisit leaves
        '0' to exit and to view your Updated Attendance
        ------------------------------------------------------------
        2
        your attendance will be: 2 % + current attendance % for each emergencyLeave
        Enter the no. of emergency leaves
        1
        ------------------------------------------------------------
        -- Enter your reason for Absence as:
        '1' for updating attendance for event leaves
        '2' for updating attendance for emergency leaves
        '3' for updating attendance for homeVisit leaves
        '0' to exit and to view your Updated Attendance
        ------------------------------------------------------------
        0
        Exit
        Your Updated attendance is: 86.0
        ------------------------------------------------
        Please enter your choice as:
        ***  '1' to check your Attendance  ***
        ***  '2' to check Eligibility for Exam  ***
        ***  '3' to check Exam Schedule  ***
        ***  '4' to check Regularization  ***
        ***  '0' to Exit  ***
        ------------------------------------------------
        0
        ---  EXIT  ---

        Process finished with exit code 0

 */

/*
>>>>>>>>   Welcome to the Examination Portal   <<<<<<<<
>>>>>>>>   Please follow the below cases to check your EXAM SCHEDULE and ELIGIBILITY   <<<<<<<<
------------------------------------------------
Please enter your choice as:
***  '1' to check your Attendance  ***
***  '2' to check Eligibility for Exam  ***
***  '3' to check Exam Schedule  ***
***  '4' to check Regularization  ***
***  '0' to Exit  ***
------------------------------------------------
1
---  View Attendance  ---
--  Enter your Name
Harni
--  Enter your ID
1
--  Enter your Attendance for this semester
56
--  Your Attendance is: 56.0
------------------------------------------------
Please enter your choice as:
***  '1' to check your Attendance  ***
***  '2' to check Eligibility for Exam  ***
***  '3' to check Exam Schedule  ***
***  '4' to check Regularization  ***
***  '0' to Exit  ***
------------------------------------------------
2
---  Check Eligibility  ---
NoMinimumAttendanceException...You need to have minimum attendance of 75 % for writing exams
Check if you can increase your attendance percentage to the minimum per. required by regularizing(if applicable)
else, you are not Eligible for attending Exams
------------------------------------------------
Please enter your choice as:
***  '1' to check your Attendance  ***
***  '2' to check Eligibility for Exam  ***
***  '3' to check Exam Schedule  ***
***  '4' to check Regularization  ***
***  '0' to Exit  ***
------------------------------------------------
4
---  View Regularization  ---
------------------------------------------------------------
-- Enter your reason for Absence as:
'1' for updating attendance for event leaves
'2' for updating attendance for emergency leaves
'3' for updating attendance for homeVisit leaves
'0' to exit and to view your Updated Attendance
------------------------------------------------------------
1
your attendance will be: 3 % + current attendance % for each eventLeave
Enter the no. of events attended
5
------------------------------------------------------------
-- Enter your reason for Absence as:
'1' for updating attendance for event leaves
'2' for updating attendance for emergency leaves
'3' for updating attendance for homeVisit leaves
'0' to exit and to view your Updated Attendance
------------------------------------------------------------
2
your attendance will be: 2 % + current attendance % for each emergencyLeave
Enter the no. of emergency leaves
5
------------------------------------------------------------
-- Enter your reason for Absence as:
'1' for updating attendance for event leaves
'2' for updating attendance for emergency leaves
'3' for updating attendance for homeVisit leaves
'0' to exit and to view your Updated Attendance
------------------------------------------------------------
0
Exit
Your Updated attendance is: 81.0
------------------------------------------------
Please enter your choice as:
***  '1' to check your Attendance  ***
***  '2' to check Eligibility for Exam  ***
***  '3' to check Exam Schedule  ***
***  '4' to check Regularization  ***
***  '0' to Exit  ***
------------------------------------------------
2
---  Check Eligibility  ---
You are Eligible for attending Exams
------------------------------------------------
Please enter your choice as:
***  '1' to check your Attendance  ***
***  '2' to check Eligibility for Exam  ***
***  '3' to check Exam Schedule  ***
***  '4' to check Regularization  ***
***  '0' to Exit  ***
------------------------------------------------
0
---  EXIT  ---

Process finished with exit code 0

 */

/*
>>>>>>>>   Welcome to the Examination Portal   <<<<<<<<
>>>>>>>>   Please follow the below cases to check your EXAM SCHEDULE and ELIGIBILITY   <<<<<<<<
------------------------------------------------
Please enter your choice as:
***  '1' to check your Attendance  ***
***  '2' to check Eligibility for Exam  ***
***  '3' to check Exam Schedule  ***
***  '4' to check Regularization  ***
***  '0' to Exit  ***
------------------------------------------------
1
---  View Attendance  ---
--  Enter your Name
Krati
--  Enter your ID
4
--  Enter your Attendance for this semester
60
--  Your Attendance is: 60.0
------------------------------------------------
Please enter your choice as:
***  '1' to check your Attendance  ***
***  '2' to check Eligibility for Exam  ***
***  '3' to check Exam Schedule  ***
***  '4' to check Regularization  ***
***  '0' to Exit  ***
------------------------------------------------
2
---  Check Eligibility  ---
NoMinimumAttendanceException...You need to have minimum attendance of 75 % for writing exams
Check if you can increase your attendance percentage to the minimum per. required by regularizing(if applicable)
else, you are not Eligible for attending Exams
------------------------------------------------
Please enter your choice as:
***  '1' to check your Attendance  ***
***  '2' to check Eligibility for Exam  ***
***  '3' to check Exam Schedule  ***
***  '4' to check Regularization  ***
***  '0' to Exit  ***
------------------------------------------------
3
NoMinimumAttendanceException...You need to have minimum attendance of 75 % for writing exams
------------------------------------------------
Please enter your choice as:
***  '1' to check your Attendance  ***
***  '2' to check Eligibility for Exam  ***
***  '3' to check Exam Schedule  ***
***  '4' to check Regularization  ***
***  '0' to Exit  ***
------------------------------------------------
4
---  View Regularization  ---
------------------------------------------------------------
-- Enter your reason for Absence as:
'1' for updating attendance for event leaves
'2' for updating attendance for emergency leaves
'3' for updating attendance for homeVisit leaves
'0' to exit and to view your Updated Attendance
------------------------------------------------------------
1
your attendance will be: 3 % + current attendance % for each eventLeave
Enter the no. of events attended
5
------------------------------------------------------------
-- Enter your reason for Absence as:
'1' for updating attendance for event leaves
'2' for updating attendance for emergency leaves
'3' for updating attendance for homeVisit leaves
'0' to exit and to view your Updated Attendance
------------------------------------------------------------
2
your attendance will be: 2 % + current attendance % for each emergencyLeave
Enter the no. of emergency leaves
2
------------------------------------------------------------
-- Enter your reason for Absence as:
'1' for updating attendance for event leaves
'2' for updating attendance for emergency leaves
'3' for updating attendance for homeVisit leaves
'0' to exit and to view your Updated Attendance
------------------------------------------------------------
1
your attendance will be: 3 % + current attendance % for each eventLeave
Enter the no. of events attended
1
------------------------------------------------------------
-- Enter your reason for Absence as:
'1' for updating attendance for event leaves
'2' for updating attendance for emergency leaves
'3' for updating attendance for homeVisit leaves
'0' to exit and to view your Updated Attendance
------------------------------------------------------------
0
Exit
Your Updated attendance is: 82.0
------------------------------------------------
Please enter your choice as:
***  '1' to check your Attendance  ***
***  '2' to check Eligibility for Exam  ***
***  '3' to check Exam Schedule  ***
***  '4' to check Regularization  ***
***  '0' to Exit  ***
------------------------------------------------
3
---  View Exam Schedule  ---
The Exam Schedule of this semester :
 -----------------------------------------------
 |   S.no   |     Subject     |  Date Of Exam  |
 - - - - - - - - - - - - - - - - - - - - - - - -
 |     1    |     JAVA        |   16-03-2023   |
 |     2    |     PYTHON      |   18-03-2023   |
 |     3    |     C++         |   20-03-2023   |
 |     4    |     MYSQL       |   23-03-2023   |
 -----------------------------------------------
------------------------------------------------
Please enter your choice as:
***  '1' to check your Attendance  ***
***  '2' to check Eligibility for Exam  ***
***  '3' to check Exam Schedule  ***
***  '4' to check Regularization  ***
***  '0' to Exit  ***
------------------------------------------------
0
---  EXIT  ---

Process finished with exit code 0

 */