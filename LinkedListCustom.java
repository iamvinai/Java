
public class LinkedListCustom {
    Node head;
    public LinkedListCustom(){

    }
    class Node{
        Integer val;
        Node next;
        Node(Integer val,Node next){
            this.val=val;
            this.next=next;
        }
    }
    void add(Integer val){
        Node temp = head;
        if(temp==null){
            temp = new Node(val,null);
            head = temp;
        }
        else{
            while(temp.next!=null){
                temp = temp.next;
            }
            Node newNode = new Node(val,null);
            temp.next=newNode;
        }
    }
    void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }



}
