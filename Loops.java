import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Iteration statements - loops
        /*
         * 
         * INTEGER x
         * SET x:= 1
         * REPEAT
         * PRINT x
         * INCREMENT x
         * UNTIL x <= 10
         * 
         * 
         * // Do-While Loop
         * 
         * INTEGER y
         * SET y:= 1
         * DO
         * PRINT y
         * INCREMENT y
         * WHILE y <= 10
         * 
         * // TABLE PROGRAM
         * 
         * DECLARE n : INTEGER
         * READ n
         * DECLARE i : INTEGER
         * SET i:= 1
         * REPEAT
         * PRINT i * n
         * INCREMENT i
         * UNTIL i <= 10
         */
        // Code snippet for REPEAT-UNTIL loop

        int x = 1;
        do {
            System.out.println(x);
            x++;
        } while (x <= 10);

        // Code snippet for TABLE PROGRAM

        int n, i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        n = sc.nextInt();
        do {
            System.out.println(i * n);
            i++;
        } while (i <= 10);

        // WHILE LOOP
        /*
         * WHILE CONDITION LOOP
         * STS
         * ENDWHILE
         * 
         * DECLARE n : INTEGER
         * SET n:= 1
         * WHILE n <= 10
         * PRINT n
         * INCREMENT n
         * ENDWHILE
         */
        // CODE snippet for WHILE loop

        int n1 = 1;
        while (n1 <= 10) {
            System.out.println(n1);
            n1++;
        }

        // FOR LOOP
        /*
         * FOR variable := START TO END Loop
         * STS
         * ENDFOR
         * 
         * // Sum of first n natural numbers using for loop
         * 
         * DECLARE n : INTEGER
         * DECLARE sum : INTEGER
         * INTEGER i,sum
         * READ n
         * SET sum:= 0
         * FOR i := 1 TO n LOOP
         * sum = sum + i
         * ENDFOR
         * PRINT sum
         */
        // Code snippet for FOR loop

        int n2, sum = 0;
        System.out.println("Enter a positive integer:");
        n2 = sc.nextInt();
        for (int i1 = 1; i1 <= n2; i1++) {
            sum += i1;
        }
        System.out.println("The sum of the first " + n2 + " natural numbers is: " + sum);

        // SQUARING A NUMBER USING FOR LOOP
        /*
         * DECLARE n : INTEGER
         * INTEGER i,sum
         * SET sum = 0
         * READ n
         * FOR i := 1 TO n LOOP
         * sum = sum + i*i
         * ENDFOR
         * PRINT sum
         */

        // Code snippet for squaring a number using for loop

        int n3, sum1 = 0;
        System.out.println("Enter a positive integer:");
        n3 = sc.nextInt();
        for (int i2 = 1; i2 <= n3; i2++) {
            sum1 += i2 * i2;
        }
        System.out.println("The sum of the squares of the first " + n3 + " natural numbers is: " + sum1);

        // FACTORIAL OF A NUMBER USING FOR LOOP
        /*
         * DECLARE n : INTEGER
         * DECLARE fact : INTEGER
         * INTEGER i,fact
         * READ n
         * SET fact = 1
         * FOR i := n TO 1 LOOP STEP -1
         * fact = fact * i
         * ENDFOR
         * PRINT fact
         */

        // code snippet for factorial of a number using for loop

        int n4, fact = 1;
        System.out.println("Enter a positive integer:");
        n4 = sc.nextInt();
        for (int i3 = n4; i3 >= 1; i3--) {
            fact *= i3;
        }
        System.out.println("The factorial of " + n4 + " is: " + fact);

        // Artmstrong number using while loop
        /*
         * DCLARE n : INTEGER
         * DECLARE num : INTEGER
         * DECLARE b : INETGER
         * DECLARE a = INTEGER
         * SET b = 0
         * READ num
         * n := num
         * WHILE n > 0
         * a = n % 10
         * n = n / 10
         * b = b + a*a*a
         * ENDWHILE
         * IF num == b THEN
         * PRINT "Armstrong number"
         * ELSE
         * PRINT "Not an Armstrong number
         * ENDIF
         */

        // Code snippet for Armstrong number using while loop

        int n5, num, b = 0, a;
        System.out.println("Enter an integer:");
        num = sc.nextInt();
        n5 = num;
        while (n5 > 0) {
            a = n5 % 10;
            n5 /= 10;
            b += a * a * a;
        }
        if (num == b) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

        // Palindrome number using while loop
        /*
         * 
         * DECLARE n : INTEGER
         * DECLARE num : INTEGER
         * DECLARE rev : INTEGER
         * DECLARE rem : INTEGER
         * SET rev = 0
         * READ num
         * n := num
         * WHILE n > 0
         * rem = n % 10
         * rev = rev * 10 + rem
         * n = n / 10
         * ENDWHILE
         * IF num == rev THEN
         * PRINT "Palindrome number"
         * ELSE
         * PRINT "Not a Palindrome number"
         * ENDIF
         */

        // code snippet for Palindrome number using while loop

        int n6, num1, rev = 0, rem1;
        System.out.println("Enter an integer:");
        num1 = sc.nextInt();
        n6 = num1;
        while (n6 > 0) {
            rem1 = n6 % 10;
            rev = rev * 10 + rem1;
            n6 /= 10;
        }
        if (num1 == rev) {
            System.out.println(num1 + " is a palindrome number.");
        } else {
            System.out.println(num1 + " is not a palindrome number.");
        }

        // PRIME NO.
        /*
         * DECLARE n : INTEGER
         * READ n
         * FOR fOR i := 2 TO n-1 LOOP
         * IF n MOD i == 0 THEN
         * PRINT "Not a prime number"
         * BREAK
         * ENDIF
         * ENDFOR
         * IF i == n THEN
         * PRINT "Prime number"
         * ENDIF
         */
        // code snippet for prime number

        int n7;
        System.out.println("Enter an integer:");
        n7 = sc.nextInt();
        boolean isPrime = true;
        if (n7 <= 1) {
            isPrime = false;
        } else {
            for (int i4 = 2; i4 < n7; i4++) {
                if (n7 % i4 == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(n7 + " is a prime number.");
        } else {
            System.out.println(n7 + " is not a prime number.");
        }
        // FIBONACCI SERIES
        /*
         * 
         * DECLARE n : INTEGER
         * DECLARE prev : INTEGER
         * DECLARE NEXT : INTEGER
         * DECLARE sum : INTEGER
         * SET prev = 0
         * SET next = 1
         * READ n
         * PRINT prev
         * PRINT next
         * WHILE sum <=n
         * sum := prev + next
         * PRINT sum
         * prev := next
         * next := sum
         * ENDWHILE
         */

        // Code snippet for Fibonacci series

        int n8, prev = 0, next = 1, sum2 = 0;
        System.out.println("Enter an integer:");
        n8 = sc.nextInt();

        System.out.print(prev + " " + next + " ");

        while (true) {
            sum2 = prev + next;

            if (sum2 > n) {
                break;
            }

            System.out.println(sum2 + " ");

            prev = next;
            next = sum2;
        }

        // REVERSE OF A NUMBER
        /*
         * 
         * DECLARE n : INTEGER
         * DECLARE b : INTEGER
         * DECLARE a : INTEGER
         * 
         * SET b:=0
         * READ n
         * WHILE n > 0
         * a = n % 10
         * n = n / 10
         * b = b * 10 + a
         * ENDWHILE
         * PRINT b
         */
        // Code snippet for reverse of a number

        int n9, b1 = 0, a1;
        System.out.println("Enter an integer:");
        n9 = sc.nextInt();
        while (n9 > 0) {
            a1 = n9 % 10;
            n9 /= 10;
            b1 = b1 * 10 + a1;
        }
        System.out.println("The reverse of the number is: " + b1);

    }
}
