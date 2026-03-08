import java.util.Scanner;
public class control_statements {
    public static void main(String[] args) {
        // UID - pass matching code
        /*
        DECLARE uid : STRING
        DECLARE pass : STRING
        READ uid
        READ pass
        IF uid == "admin" AND pass == "admin123" THEN
            PRINT "Login successful"
        ELSE
            PRINT "Login failed"
        END IF 
         */

//code snippet for UID - pass matching code--------------

        String uid;
        String pass;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter UID:");
        uid = sc.nextLine();
        System.out.println("Enter Password:");
        pass = sc.nextLine();
        if (uid.equals("admin") && pass.equals("admin123")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
// -------------------------------------------------------------------------------------

// Marks grading System 
/*    
     DECLARE CN : INTEGER
     DECLARE CD : INTEGER
     DECLARE CP : INTEGER
     DECALRE DBMS : INTEGER
     DECLARE ML : INTEGER

     READ CN,CD,CP,DBMS,ML
     DECLARE per : REAL
     per = (CN + CD + CP + DBMS + ML) / 5
        IF per >= 90 THEN
            PRINT "Grade A+"
        ELSE IF per >= 80 THEN
            PRINT "Grade A"
        ELSE IF per >= 70 THEN
            PRINT "Grade B+"
        ELSE IF per >= 60 THEN
            PRINT "Grade B"
        Else IF per >= 50 THEN
            PRINT "Grade C"
        ELSE 
            PRINT "Grade F"
        END IF
*/
// Code snippet for Marks grading System

        int CN, CD, CP, DBMS, ML;
        System.out.println("Enter marks for CN:");
        CN = sc.nextInt();
        System.out.println("Enter marks for CD:");
        CD = sc.nextInt();
        System.out.println("Enter marks for CP:");
        CP = sc.nextInt();
        System.out.println("Enter marks for DBMS:");
        DBMS = sc.nextInt();
        System.out.println("Enter marks for ML:");
        ML = sc.nextInt();

        double per = (CN + CD + CP + DBMS + ML) / 5.0;

        if (per >= 90) {
            System.out.println("Grade A+");
        } else if (per >= 80) {
            System.out.println("Grade A");
        } else if (per >= 70) {
            System.out.println("Grade B+");
        } else if (per >= 60) {
            System.out.println("Grade B");
        } else if (per >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade F");
        }
    }
}
