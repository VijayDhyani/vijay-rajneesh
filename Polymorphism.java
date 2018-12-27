package basicprograms;

/**
 * Created by vijay on 28/12/18.
 */
public class Polymorphism {   //In polymorphism java does not support the prototype of Access Specifiers. Here All the prototype are of Access modifiers type. Such as public, private, protected, static, dafault, volatile, transient, final, Abstract.

 /*  public void show ()
    {                       //Access modifiers does not play any role in case of function overloading.

    }                       //It gives error may be ambiquity error

    private void show()
    {

    }
*/

 /*  public void show()
   {
                            //Same like as static because it is also a Access Modifier
   }                        //It also gives error

   static void show()
   {

   }
*/

// Heading 1:- Acheiving function overloading by changing only in arguments.
  //  a)by changing the number of arguments in each function. Ex:-

    void show()
    {
        System.out.println("having no argument");
    }

    void show(int x)
    {
        System.out.println("having single argument");
    }
    void show(int x, int y)
    {
        System.out.println("having double argument");
    }

  //  b)If you want to keep number of arguments in each function same and still you want to overload them, then change the data type of their arguments.

    void show(byte b)
    {
        System.out.println("Having datatype byte");
    }
    void show(short s)
    {
        System.out.println("Having datatype short");
    }
    void show(long l)
    {
        System.out.println("Having datatype long");
    }
    void show(char c)
    {
        System.out.println("Having datatype char");
    }
//Heading 2:- Acheiving a function overloading by changing only in the return type of object

/*    void show(int 1(x))
    {
        System.out.println("sjhdfgnscfgiu");
    }
    int show(int x) {                           //It gives compilation error. IT is not mandatory to catch the return value of any function while calling it.
        System.out.println("csbdjhfg");
        return 20;
    }
*/
    public static void main(String[] args) {
      Polymorphism polymorphism = new Polymorphism();
    //  polymorphism.show();
    //  polymorphism.show(789890808);
        polymorphism.show(43,453);
        polymorphism.show(32);

    }
}
