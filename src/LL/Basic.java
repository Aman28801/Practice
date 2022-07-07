package LL;

class Basic {
    Node head;
    static class Node{
        String data;
        Node next;

        Node(String data){
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

    }
}
