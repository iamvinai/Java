/*This Java code defines a functional interface named `A`.
 A functional interface is an interface that has exactly one abstract method. 
 In this case, the abstract method is `add(int i, int j)` which takes two integers as input and returns an integer. 
 This interface can be used as a lambda expression or method reference for any functional programming construct that expects a function that takes two integers and returns an integer.
 */
@FunctionalInterface
interface A{
    int add(int i,int j);
}
class Mobile{
    int id;
    String name;
    public static String brand = "Samsung";
    public Mobile(int id, String name){
        this.id=id;
        this.name=name;
    }
    static{
        System.out.println("Static block");
    }
    public void display(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Brand: "+brand);
    }
    public static void display1(Mobile m){
        System.out.println("ID: "+m.id);
        System.out.println("Name: "+m.name);
        System.out.println("Brand: "+brand);
    }
}
public class testJava{
    public static void main(String args[]){
        A obj = (i,j)->i+j;
        System.out.println(obj.add(2,3));
        String s="name";
        s+="vinai";
        try {
            Class.forName("Mobile");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        // Mobile m=new Mobile(1,"vinai");
        // Mobile.brand="Apple";
        // m.display();
        // Mobile.display1(m);
        StringBuffer sbf = new StringBuffer(s);
        StringBuilder sb = new StringBuilder(s);
        long start=System.currentTimeMillis();
        for(int i=0;i<100000000;i++){
            sbf.setCharAt(0, 'v');
            sbf.append(4.5);
        }
        System.out.println(System.currentTimeMillis()-start);
        start=System.currentTimeMillis();
        for(int i=0;i<100000000;i++){
            sb.setCharAt(0, 'v');
            sb.append(4.5);
        }
        System.out.println(System.currentTimeMillis()-start);
        start=System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            s+="vinai";
        }
        System.out.println(System.currentTimeMillis()-start);

    }
}