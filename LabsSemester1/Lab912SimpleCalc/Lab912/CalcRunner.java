
/**
 * Write a description of class CalcRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalcRunner
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class CalcRunner
     */
    public CalcRunner()
        
    {
        x1 = EasyCalc.add(3,5);
          system.out.println(x1)
        x2 = EasyCalc.subtract(3,5);
        system.out.println(x2)
        x3 =  EasyCalc.multiply(7,5);
        system.out.println(x3)
        x4 =  EasyCalc.divide(3,4);
        system.out.println(x4);
         x5 = EasyCalc.module(6,7);
        system.out.println(x5)
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
