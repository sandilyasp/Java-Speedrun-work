// 8/10/22

import java.util.Scanner;
public class whileLoop {
    public static void main(String[] args){
        // while loop = executes a block of code as long as it's condition remains true
        // do loop = like the while loop but you check the condition after the code is run and you write do before the block of code and at the end you write a while

        Scanner scanner = new Scanner(System.in);
        String name = "";
         do {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        } while(name.isBlank());
        System.out.println("Hello "+name);
    }
}
