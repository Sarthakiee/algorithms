import java.util.Scanner;
class basics 
{
    public static void main(String[] args) {
        // Area of a rectangle
        /* 
        DECLARE LENGTH : REAL
        DECLARE WIDTH : REAL
        DECLARE RECT  : REAL
        DECLARE AREA : REAL 
        
        READ LENGTH
        READ WIDTH
        RECT = LENGTH * WIDTH
        AREA = RECT
        */
        // code snippet for area of a rectangle
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        int length = sc.nextInt();
        System.out.println("Enter the width of the rectangle:");
        int width = sc.nextInt();
        int area = length * width;
        System.out.println("The area of the rectangle is: " + area);
    }
}