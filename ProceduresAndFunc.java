public class ProceduresAndFunc{


    // procedure to add two integers
    void add(int a, int b) {
        System.out.println("The sum of " + a + " and " + b + " is: " + (a + b));
    }
    // function to multiply two integers
    int multiply(int a, int b) {
        return a * b;
    }
    

    // Procedure for Simple Interest Calculation
    void calculateSimpleInterest(double principal, double rate, double time) {
        double interest = (principal * rate * time) / 100;
        System.out.println("The simple interest is: " + interest);
    }

    // Function for Area of a Circle
    double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    // Function for Greatest of two numbers
    int greatestOfTwo(int a, int b) {
        return (a > b) ? a : b;
    }

    // Function of Absoulute Value Program
    double absoluteValue(double num) {
        return (num < 0) ? -num : num;
    }

    // Function of Factorial of a Number
    int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Sum the series 1 + 2 + 3 + ... + n
    int sumOfSeries(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // Sum the series 1 + 1/2 + 1/3 + ... + 1/n
    double sumOfHarmonicSeries(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }
    
    // Function of revrse of a number 
    int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
   
    // Function of Palindrome of a number 
    boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }



    public static void main(String[] args) {
        // code for procedures and functions will go here


        // Example procedure call
        ProceduresAndFunc obj = new ProceduresAndFunc();
        obj.add(5, 10);

        // Example function call
        int result = obj.multiply(5, 10);
        System.out.println("The product of 5 and 10 is: " + result);


        // Example procedure call for simple interest calculation
        obj.calculateSimpleInterest(1000, 5, 2);

        // Example function call for area of a circle
        double area = obj.areaOfCircle(7);
        System.out.println("The area of the circle with radius 7 is: " + area);

        // Example function call for greatest of two numbers
        int greatest = obj.greatestOfTwo(10, 20);
        System.out.println("The greatest of 10 and 20 is: " + greatest);

        //Example function call for absolute value program
        double absValue = obj.absoluteValue(-5.5);
        System.out.println("The absolute value of -5.5 is: " + absValue);

        // Example function call for factorial of a number
        int fact = obj.factorial(5);
        System.out.println("The factorial of 5 is: " + fact);

        // Example function call for sum of series
        int sumSeries = obj.sumOfSeries(5);
        System.out.println("The sum of the series 1 + 2 + 3 + ... + 5 is: " + sumSeries);


        // Example function call for sum of harmonic series
        double sumHarmonic = obj.sumOfHarmonicSeries(5);
        System.out.println("The sum of the harmonic series 1 + 1/2 + 1/3 + ... + 1/5 is: " + sumHarmonic);

        // Example function call for reverse of a number
        int reversedNum = obj.reverseNumber(12345);
        System.out.println("The reverse of the number 12345 is: " + reversedNum);

        // Example function call for palindrome of a number
        boolean isPalin = obj.isPalindrome(12321);
        System.out.println("Is the number 12321 a palindrome? " + isPalin);


        // --------------- Some Questions for Practice --------------
        //  Q1 :- Whats returned for a = 4 b = 3 ??
      /*                             
          INTEGER computeVal(Integer a, Integer b)
           INTEGER res = 1
           WHILE (b>0)
              IF (B MOD 2 EQUALS 1)
                   RES = RES * A
                   A = A * A
                   B = B DIV 2
            END WHILE 
            RETURN RES 
            END FUNCTION
      */
    //  code snippet for the above question
        int a = 4, b = 3;
        int res = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                res *= a;
            }
            a *= a;
            b /= 2;
        }
        System.out.println("The result of computeVal(4, 3) is: " + res);


        // Q2  a = 2; b = 6 , c = 1
        /*  
        INTEGER FUNN(INETGER a, INTEGER b, INTEGER c)
          IF ((c^b + a) < (a & c))
               b = a ^ b 
               c = (a + 3) + 3

          END IF 
        
        IF ((3 ^ b) + (c ^ c) > (11 & c))
             b = ( c + 12 ) ^ a
        END IF 
        
        RETURN a+b+c 
        END FUNCTION
         */
        
        // code snippet for the above question
       int a1 = 2 , b1 = 6 , c1 = 1;
        if ((c1 ^ b1 + a1) < (a1 & c1)) {
            b1 = a1 ^ b1;
            c1 = (a1 + 3) + 3;
        }
        if ((3 ^ b1) + (c1 ^c1) > (11 & c1)) {
            b1 = (c1 + 12) ^ a1;
        }
        int finalResult = a1 + b1 + c1 ;
        System.out.println("The result of FUNN(2, 6, 1) is: " + finalResult);
        
        // Q3 a = 3, b = 8, c = 7
        /* 
        INTEGER FUNN(INTEGER a, INTEGER b,INTEGER c)
           if((a^8) < 8)
             c = a + c
             c = a + c
              END IF

           RETURN a + b + c
        END FUNCTION
        */ 
       
        // code snippet for the above question
        int a2 = 3, b2 = 8, c2 = 7;
        if ((a2 ^ 8) < 8) {
            c2 = a2 + c2;
            c2 = a2 + c2;
        }
        int finalResult2 = a2 + b2 + c2;
        System.out.println("The result of FUNN(3, 8, 7) is: " + finalResult2);

    }
    
}
