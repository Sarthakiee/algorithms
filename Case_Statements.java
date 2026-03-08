import java.util.Scanner;
public class Case_Statements {
    public static void main(String[] args) {
        // CASE STATEMENTS 
/* 

      DECLARE x : INTEGER
      READ x
      CASES OF x:
      1 : PRINT "One"
      2 : PRINT "Two"
      3 : PRINT "Three"
        
    OTHERWISE 
        PRINT "Invalid input"
    ENDCASE
*/
// Code snippet for CASE STATEMENTS

        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        x = sc.nextInt();
        switch (x) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }

// -------------------------------------------------------------------------------------
//        Example 2 
/*
          DECLARE x : INTEGER
          DECLARE a : INTEGER
          DECLARE b : INTEGER

          READ  a,b,x
          CASE OF x:
          1 : PRINT a+b 
          2 : PRINT a-b
          3 : PRINT a*b
          4 : PRINT a/b
           
        OTHERWISE
            PRINT "WRONG SELECTION"   
        ENDCASE
*/
// Code snippet for Example 2

        int a, b;
        System.out.println("Enter two integers:");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter an operation (1 for addition, 2 for subtraction, 3 for multiplication, 4 for division):");
        x = sc.nextInt();
        switch (x) {
            case 1:
                System.out.println("Result: " + (a + b));
                break;
            case 2:
                System.out.println("Result: " + (a - b));
                break;
            case 3:
                System.out.println("Result: " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("WRONG SELECTION");
                break;
        }
    }
}
