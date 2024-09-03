
public class LinkedListDemo {
    public static void main(String [] args){
        LinkedListCustom testList = new LinkedListCustom();
        for(Integer i=1;i<=10;i++){
            testList.add(i);
        }
        testList.printList();
    }
}
