package datastructs.linked_lists.single.java;

/**
 * Implementation of singly linked list in Java
 * 
 * @author Jacob Biehler (https://github.com/biehlerj)
 */
public class SinglyLinkedList {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String d) {
            data = d;
            next = null;
        }
    }

    /**
     * Inserts a new node at the beginning of the linked list
     * 
     * @param new_data the data to be stored in the new node
     */
    public void push(String new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    /**
     * Inserts a new node after the given node
     * 
     * @param prev     the node to insert after
     * @param new_data the data to be stored in the new node
     */
    public void insertAfter(Node prev, String new_data) {
        if (prev == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev.next;
        prev.next = new_node;
    }

    /**
     * Inserts a new node at the end of the list
     * 
     * @param new_data
     */
    public void append(String new_data) {
        Node new_node = new Node(new_data);

        if (head == null) {
            head = new Node(new_data);
            return;
        }
        new_node.next = null;
        Node last = head;

        while (last.next != null)
            last = last.next;

        last.next = new_node;
        return;
    }

    /**
     * Prints the list
     */
    public void printList() {
        Node tNode = head;
        while (tNode != null) {
            System.out.print(tNode.data + " ");
            tNode = tNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList llist = new SinglyLinkedList();
        llist.append("6");
        llist.push("7");
        llist.push("1");
        llist.append("4");
        llist.insertAfter(llist.head.next, "8");
        System.out.println("\nCreated Linked List is: ");
        llist.printList();
    }
}