package basicprograms;

/**
 * Created by vijay on 24/12/18.
 */
//A complete working java rogram to demonstrate the working of all insertion method on linked list with java
public class LinkList {
    Node head;  // head of list

    //linked list node
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Insert a new Node at front of the list

    public void push(int new_data) {
        //first method is or allocating and put in the data
        Node new_node = new Node(new_data);
        //make next of new_node to head;
        new_node.next = head;
        //move the head to point to next node
        head = new_node;
    }

// Insert a new node after the given previous node

    public void insertAfter(Node prev_Node, int new_data) {
        //1: Check if the given Node is null
        if (prev_Node == null) {
            System.out.println("The given previous node is not Null");
            return;
        }
        //2&3: Allocate the Node and put in the data

        Node new_node = new Node(new_data);
        //4: Make next of new Node as next of prev_node

        new_node.next = prev_Node.next;

        //5: Make next of prev_node as new Node
        prev_Node.next = new_node;

        //Appends a new node at the end. This method is defined inside Linked List class defined above

    }

    public void append(int new_data) {
        //1,2&3 Allocate the node ; Put in the data ; Set next as null;

        Node new_node = new Node(new_data);

        //If the Linked List is empty then make the new_node as head
        if (head == null) {
            head = new Node(new_data);
            return;
        }
        //This new node is going to be last node. Then make next of it as null.

        new_node.next = null;
        //5: Else traverse till the last node
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        //6:Change the next of last node
        last.next = new_node;
        return;
    }


    //This function prints the content of the linked list starting from given node

    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.println(tnode.data + "");
            tnode = tnode.next;
        }
    }


}
