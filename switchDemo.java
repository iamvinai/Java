public class switchDemo{
    public static void main(String args[]){
        int i = 2;
        switch(i){
            case 1,2:
                System.out.println("Value is 1 or 2");
                break;
            case 3:
                System.out.println("Value is 3");
                break;
            case 4:
                System.out.println("Value is 4");
                break;
            default:
                System.out.println("Value is not 1,2,3 or 4");
        }
        // latest switch no need break
        switch(i){
            case 1,2 -> System.out.println("Value is 1 or 2");
            case 3 -> System.out.println("Value is 3");
            case 4 -> System.out.println("Value is 4");
            default -> System.out.println("Value is not 1,2,3 or 4");
        }
        // latest switch with return statements and storing in a variable   
        int r = switch(i){
            case 1 -> {
                System.out.println("Value is 1");
                i++;
                yield i;
            }
            case 2 -> {
                System.out.println("Value is 2");
                i++;
                yield i;
            }
            case 3 -> {
                System.out.println("Value is 3");
                i++;
                yield i;
            }
            case 4 -> {
                System.out.println("Value is 4");
                i++;
                yield i;
            }
            default -> {
                System.out.println("Value is not 1,2,3 or 4");
                yield 0;
            }
        };
        System.out.println(r);
        }
}