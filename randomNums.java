//  7/6/22

import java.util.Random;
public class randomNums {
    public static void main(String[] args){
        Random random = new Random();

        int x = random.nextInt(6)+1;
        double y = random.nextDouble();
        boolean z = random.nextBoolean();

        System.out.println(x);
    }
}
