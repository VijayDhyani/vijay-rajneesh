package basicprograms;

/**
 * Created by vijay on 25/12/18.
 */
public class Emp {
    static String Cname= "Google";  //only keep those properties of an object as static data member of a class whose values are same for each object
    String name;                    //Instance variable of the class which defines the properties of the object
    int salary;

    void get(String s1, int s2)
    {
        name = s1;         // Local variables
        salary = s2;

    }

    void show()
    {
        System.out.println(name);
        System.out.println(salary);
        System.out.println(Cname);
    }

  /* public int add(int a1, int a2)
    {
        int z = a1+a2;              //local variable z
        System.out.println(z);
        return z;
    }
**/

    public static void main(String[] args) {
        Emp e1 = new Emp();
        e1.get("lalu" , 101);
        e1.show();

        Emp e2 = e1;
        e2.get("Rajneesh" , 800808800);
        e2.show();

        Emp e3 = e2;
        //e3.add(5,8);

        if (e2==e3)
        {
            System.out.println("reference Id of the both reference variable is same");
        }else
        System.out.println("reference Id of the both reference variable is not same");
    }
}
//Static data members are always getting a memory at class loading time that means before the execution of main function.
//Static data members always get the memory only once in the life cycle of a class.
//All the objects are sharing a same memory location for the each static data member.