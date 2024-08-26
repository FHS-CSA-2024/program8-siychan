import java.lang.Math;
/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;

    /**
     * Constructor for objects of class Calculator
     */
    public Calculator(int num1, int num2)
    {
        // initialise instance variables
        x = num1;
        y = num2;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sum()
    {
        // put your code here
        return x + y;
    }

    public int difference()
    {
        // put your code here
        return x - y;
    }
    
    public int product()
    {
        // put your code here
        return x * y;
    }
    
    public double average()
    {
        // put your code here
        return this.sum() / 2.0;
    }
    
    public int distance()
    {
        // put your code here
        return Math.abs(x - y);
    }
    
    public int maximum()
    {
        // put your code here
        int max;
        if (x > y)
        {
            return x;
        }
        else
        {
            return y;
        }
    }
    
    public int minimum()
    {
        // put your code here
        int max;
        if (x < y)
        {
            return x;
        }
        else
        {
            return y;
        }
    }
}
