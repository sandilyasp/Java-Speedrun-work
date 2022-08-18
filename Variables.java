// 7/5/22
public class Variables {
    public static void main(String[] args){
        /*int x = 123;
        double y = 3.14;
        boolean z = true;
        char symbol = '@';
        String name = "Bro";
        System.out.println("Hello " + name);
        */
        String x = "water";
        String y = "Kool-Aid";
        String temp;

        temp = x;
        x=y;
        y=temp;

        System.out.println("x: "+x);
        System.out.println("y: " +y);
    }
}
