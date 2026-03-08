import java.util.Scanner;

class search {
    public static void main(String[]args){
        //Enter a number and a digit and find digit is present or not in the number
        /* 
        DECLARE n : INTEGER
        DECLARE a : INTEGER
        DECLARE d : INTEGER
        DECLARE found : BOOLEAN
        SET found := FALSE
        READ n
        READ d
        WHILE n > 0
            SET a := n MOD 10
            n := n / 10
            IF a = d THEN
                SET found := TRUE
                BREAK
            ENDIF
        ENDWHILE
        IF found THEN
            PRINT "Digit is present in the number"
        ELSE
            PRINT "Digit is not present in the number"
        ENDIF
        */

// Code snippet for searching a digit in a number
        Scanner sc = new Scanner(System.in);
        int n, a, d;
        boolean found = false;
        System.out.println("Enter a number:");
        n = sc.nextInt();
        System.out.println("Enter a digit to search:");
        d = sc.nextInt();
        while (n > 0) {
            a = n % 10;
            n /= 10;
            if (a == d) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Digit is present in the number.");
        } else {
            System.out.println("Digit is not present in the number.");
        }



        // Enter a number and a digit and count the frequency of the digit in the number
        /* 
        DECLARE n : INTEGER
        DECLARE d : INTEGER
        DECLARE count : INTEGER
        SET count := 0
        READ n
        READ d
        WHILE n > 0
            IF n MOD 10 = d THEN
                SET count := count + 1
            ENDIF
            n := n / 10
        ENDWHILE
        PRINT "Frequency of digit ", d, " in the number ", n, " is ", count
        */

        // code snippet for counting frequency of a digit in a number
        int n2, d2, count = 0;
        System.out.println("Enter a number:");
        n2 = sc.nextInt();
        System.out.println("Enter a digit to count frequency:");
        d2 = sc.nextInt();
        while (n2 > 0) {
            if (n2 % 10 == d2) {
                count++;
            }
            n2 /= 10;
        }
        System.out.println("Frequency of digit " + d2 + " in the number is " + count);
        
    }
}