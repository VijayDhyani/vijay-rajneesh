package basicprograms;

/**
 * Created by vijay on 24/12/18.
 */
public class Employee {
    static String name;
    static int salary;

    void get(String s1, int s2)
    {
         name = s1;
         salary = s2;
    }

   public static void show(String name , int salary)
    {
        System.out.println(name);
        System.out.println(salary);
    }

    public static void main(String[] args) {
        System.out.println("This block runs when the main method is executed");
        show(name,salary);
    }
}