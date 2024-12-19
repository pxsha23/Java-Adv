// import java.util.*;
public class LinkedList{
    public static class Node{
        int data;
        Node next;
        //constructor
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        //step one-create new node
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step two-newNode next=head
        newNode.next=head; //linking step creates a link
        //step three-head=newNode
        head=newNode; 
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
        //null case
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("-->null");
    }
    public void addMid(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int iSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public int helper (Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int i=helper(head.next,key);
        if(i==-1){
            return -1;
        }
        return i+1;
    }
    public int rSearch(int key){
        return helper(head,key);
    }
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void deleteFromEnd(int n){
        //CALCULATE SIZE INDEPENDENTLY
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;//remove first 
            return;
        }
        //sz-n
        int i=1;
        int iToFind=sz-n;
        Node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
    }
    //slow approach
    public Node findMid(Node head){//helper
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow;//slow is my midNode;
    }
    public boolean palindrome(){
        //1221 is palindrome
        if(head==null||head.next==null){
            return true;
        }
        //step-1-find mid
        Node midNode=findMid(head);
        //step-2-reverse 2nd half
        Node prev =null;
        Node curr=midNode;
        Node next;
        while(curr !=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right =prev;//right.half head
        Node left=head;
        //step-3-chack left half and right half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static void main(String args[]){
        LinkedList li=new LinkedList(); //object
        li.print();
        li.addFirst(2);
        li.print();
        li.addFirst(1);
        li.print();
        li.addLast(4);
        li.print();
        li.addLast(5);
        li.print();
        li.addMid(2,3);
        li.print();//1->2->3->4->5
        System.out.println(li.size);
        System.out.println(li.iSearch(2));
        System.out.println(li.rSearch(2));
        li.reverse();
        li.print();
        li.deleteFromEnd(3);
        li.print();

        //true for
        // li.addLast(1);
        // li.addLast(2);
        // li.addLast(2);
        // li.addLast(1);
        System.out.println(li.palindrome());
    }
}
