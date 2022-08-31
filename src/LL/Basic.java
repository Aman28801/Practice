package LL;

class Basic {
    Node head;
    static class Node{
        private String data;
        private Node next;

        public Node(String data){
        this.data=data;
        this.next=null;
        }
    }

    public void addFirst(String data){
        Node newNode= new Node(data);
        //add in 1st position
        if(head == null){
            head=newNode;
            return;
        }
        newNode.next =head;
        head=newNode;
    }

    public void addlast(String data){
        Node newNode =new Node(data);
        //add at last position using current pointer
        if(head==null){
            head=newNode;
            return;
        }

        Node currNode =head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next = newNode;
    }


    public void printlist(){
        if(head==null){
            System.out.println("Empty");
            return;
        }
        Node currNode =head;
        while(currNode!=null){
            System.out.print(currNode.data + "-->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

    //delete first
    public void deletefirst(){
        if(head == null){
            System.out.println("The list is Empty");
            return;
        }
        head=head.next;
    }

    //delete last
    public void deletelast(){
        if(head == null){
            System.out.println("The list is Empty");
            return;
        }
        if(head.next==null){
            head=null;
        }
        Node secondLast =head;
        while(secondLast.next.next!=null){
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }


    public void reverseIterate(){

        if(head==null){
            return;
        }
        if(head.next==null){
            return;
        }
        Node prevNode= head;
        Node currNode =head.next;
        while(currNode!=null){
            Node nextNode =currNode.next;
            currNode.next =prevNode;

            //update
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next =null;
        head = prevNode;

    }

    public Node reverserecursive(Node head){

        if(head==null || head.next==null){
            return head;
        }

        Node newHead = reverserecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }

    public static void main(String[] args) {
    Basic list =new Basic();
    list.addFirst("me");
    list.addFirst("is");
    list.addlast("Aman");
    list.addFirst("This");
    list.printlist();
    list.deletefirst();
    list.deletelast();
    list.printlist();
    list.reverseIterate();
    list.printlist();

    }
}
