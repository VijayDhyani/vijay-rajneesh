package basicprograms;

/**
 * Created by vijay on 21/12/18.
 */
public class DataTypeTesting {

    void show(byte b)   //1byte
    {
        System.out.println("byte type of number");    //type casting required
    }

    void show(int x)   //4byte
    {
        System.out.println("int type of number");   //by default
    }
    void show(long h)  //8byte
    {
        System.out.println("long type of number");      //if the int method is not in the class then the type promotion is applied and int is promoted in long
    }
    void show(short s)  //2byte
    {
        System.out.println("short type of number");     //type casting required
    }


   public static void main(String[] args) {

     /*  byte b = 100;
       byte c = 112;
       byte d = (byte)(b + c);    // type casting is required because by default any integer literal is known as int
       System.out.println(d);
      */

     DataTypeTesting dataTypeTesting = new DataTypeTesting();  //creating the object by new operator here dataTypeTesting is the reference variable which holds the reference id generated by jvm through (constructor) function
       dataTypeTesting.show((byte) 10);
       dataTypeTesting.show((short) 39);
       dataTypeTesting.show(45);
       dataTypeTesting.show(4563L);
       }
}
