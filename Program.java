//import stuff here
import java.util.Scanner;
//Your code here
public class Program8
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();
        System.out.println();
        Calculator test = new Calculator(num1, num2);
        System.out.println("Original numbers are " + num1 + " and " + num2);
        System.out.println("Sum = " + test.sum());
        System.out.println("Difference = " + test.difference());
        System.out.println("Product = " + test.product());
        System.out.println("Average = " + test.average());
        System.out.println("Absolute value = " + test.distance());
        System.out.println("Maximum = " + test.maximum());
        System.out.println("Minimum = " + test.minimum());
    }
}
//Paste console output below:
/*
Enter number 1: 13
Enter number 2: 20

Original numbers are 13 and 20
Sum = 33
Difference = -7
Product = 260
Average = 16.5
Absolute value = 7
Maximum = 20
Minimum = 13

*/
