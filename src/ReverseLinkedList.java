import java.util.LinkedList;

public class ReverseLinkedList {
    Node head; // head of list
    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
        }
    }
    public static ReverseLinkedList insert(ReverseLinkedList list, int data)
    {
        Node new_node = new Node(data);
        new_node.next = null;
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }
    public static void printList(ReverseLinkedList list)
    {
        Node currNode = list.head;
        System.out.print("LinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }
    public static Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
    public static void main(String[] args)
    {
        ReverseLinkedList list = new ReverseLinkedList();
        insert(list, 1);
        insert(list, 2);
        insert(list, 3);
        insert(list, 4);
        insert(list, 5);
        insert(list, 6);
        insert(list, 7);
        insert(list, 8);
        printList(list);
        list.head = reverse(list.head);
        printList(list);
    }
}
