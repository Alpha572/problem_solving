/*
Description:

Create a function that finds the integral of the expression passed.

In order to find the integral all you need to do is add one to the exponent (the second argument), and divide the coefficient (the first argument) by that new number.

For example for 3x^2, the integral would be 1x^3: we added 1 to the exponent, and divided the coefficient by that new number).
 */



public class Find_the_Integral {


    
     public static String integrate(int coefficient, int exponent) {
        return coefficient/(exponent+1)+"x^"+(exponent+1);
    }

//==============================================================================

    public static void main(String[] args) {
        System.out.println(integrate(3,2)); //  "1x^3"
        System.out.println(integrate(12,5)); // "2x^6"
        System.out.println(integrate(20,1)); // "10x^2"
        System.out.println(integrate(40,3)); // "10x^4"
    }
    
}
