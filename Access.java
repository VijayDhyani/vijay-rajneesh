package basicprograms;

/**
 * Created by vijay on 24/12/18.
 */
public class Access {

    //Driver program to test above functions. Ideally this function should be in some different class. It is kept here to keep code compact

    public static void main(String[] args) {

        //Start with th empty list
        LinkList linkList = new LinkList();

        //Insert 3 so list become 3 >--Null list
        linkList.append(3);

        //Insert 2 at the beginning so it becomes 2,3
        linkList.push(2);

        linkList.push(1);

        linkList.insertAfter(linkList.head.next, 8);

        linkList.append(5);
        System.out.println("\n Created link list is: ");
        linkList.printList();
    }
}
