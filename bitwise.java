public class bitwise {
    public static void main(String[] args) {


//Q1:--------------
          /*
        DECLARE a : INT
        DECLARE b : INT
        DECLARE c : INT

        SET c:= 8 , b:= 2
        a = c/b
        c = b >> a
        c = b << a
        print(c)
         */

// code snippet for Q1

        int a ;
        int b ;
        int c ;

        c = 8; 
        b = 2;
        a = c/b;
        c = b >> a; 
        c = b << a;
        System.out.println(c);

// Q2:- --------------------------------------------------
        /*  DECLARE a : INT
            DECLARE b : INT
            DECLARE c : INT

            SET b:= 40 , a:= 20, c:= 20
            a = a+c
            c = c+a
            a = a+c
            c = c+a
            print a+b+c
        */ 
       
 // code snippet for Q2

        int a1 ;
        int b1 ;    
        int c1 ;
        b1 = 40;
        a1 = 20;
        c1 = 20;
        a1 = a1 + c1;
        c1 = c1 + a1;
        a1 = a1 + c1;
        c1 = c1 + a1;
        System.out.println(a1 + b1 + c1);

    }
}
