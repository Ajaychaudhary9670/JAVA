package LinkedList;

import function.reverse;

public class linledlist {

    public static class Node { // class hai
        int data;
        Node next;

        public Node(int data) { // constructor hai
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) { /// function hai       ////  1111
        // step1 = create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2 - newNode next = head
        newNode.next = head; // link

        // step - head = newNode
        head = newNode;

    }

    public void addLast(int data) {       ////   22222
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;

        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() { // o(n)       ///   3333
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        System.out.println("null");

    }

    public void add(int idx, int data) {     /////   44444
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;

        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){    /////  5555555
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

        public int removeLast(){          //////     66666
            if(size==0){
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            }else if(size==1){
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
            Node prev = head;
            for(int i = 0;i<size-2;i++){
                prev = prev.next;
            }
            int val = prev.next.data;
            prev.next = null;
            tail = prev;
            size--;
            return val;
            
        }
      public int  itrSearch(int key){     /////777777
        Node temp = head;
        int i = 0;
        while (temp!=null) {
            if(temp.data==key){
                return i;
            }
            temp = temp.next;
            i++;
            
        }
        return -1;
      }
      public void  Reverse(){  //////8888888
        Node prev = null;
        Node curr= tail=head;
        Node next;
       
        while ((curr!=null)) {
            next = curr.next;
            curr.next = prev ;
            prev = curr;
            curr = next;
            
        }
        head = prev;
        
      }

     public int  skip( int key){     /////999999
        Node temp = head;
        
        while (temp!=null) {
            if(temp.data==key){
                
            }
            temp = temp.next;
           
            
        }
        return head;
      }

    public static void main(String[] args) {
        linledlist ll = new linledlist();

        ll.addFirst(2);

        ll.addFirst(1);

        ll.addLast(4);

        ll.addLast(5);
        ll.add(2, 3);
        ll.print();
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println(ll.size);
        System.out.println(ll.itrSearch(3));
        ll.Reverse();
        ll.print();

    }

}
