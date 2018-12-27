package basicprograms;

/**
 * Created by vijay on 26/12/18.
 */
public class Demo {
    public static void main(String[] args) {
        Emp e1 = new Emp();
        e1.get("lalu", 101);
        e1.show();

        Emp e2 = e1;
        e2.get("Rajneesh", 800808800);
        e2.show();

        Emp e3 = e2;
        //e3.add(5,8);

        if (e1 == e3) {
            System.out.println("same");
        }
    }
}