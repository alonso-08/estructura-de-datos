package LinkedList;

public class LinkedList {

    Node head;
    int total;

    public class Node {
        int data;
        Node next;

        Node(int data){
        this.data = data;
        this.next = null;
        }
    }

    public void add(int data){
        Node newNode= new Node(data);
        if(this.head == null){
            this.head = newNode;    
        }else{
            Node last = getLastNode();
            last.next = newNode;
        }
        this.total++;
    }

    public Node getLastNode(){
        Node temp = this.head;
        while(temp.next != null){
            temp = temp.next;
        }
        return temp;

    }

    public Node getNodeCurrent(int index){
        Node temp = this.head;
        int count = 0;
        while(count < index){
            temp = temp.next;
            count++;
        }
        return temp;
    }

    public void print(){
        Node temp = this.head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

   
}
