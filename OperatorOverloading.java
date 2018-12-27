package basicprograms;

/**
 * Created by vijay on 28/12/18.
 */
public class OperatorOverloading {   //declaring class

    public static void main(String[] args) {   // main method which is called by jvm

        int a = 10;                             //declaring local variables
        int b = 3;

        System.out.println(a+b);                //println function for printing something in console  (or) System is a class  (or) Here the "+" operator is used for adding two numbers
        System.out.println("Hello" + "World");  //here the same "+" operator is used for concatinating two strings
    }
}

//In java operator overloading is only possible implicitly., but java does not support operator overloading explicitly. It is done only by the jvm at class loading time.

//Java does not support compile time polymorphism.
