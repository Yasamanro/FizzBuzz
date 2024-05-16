import java.util.Scanner;
public class Reduce {
    public static void main(String[] args) {
        System.out.println("Type in an integer:");
        Scanner in = new Scanner(System.in);
        int num;
        num = in.nextInt();
        int count  = 0;
        while (num > 0){
            if (num % 2 == 0){
                num = num / 2;
                count ++;
            }
            else {
                num --;
                count ++;
            }
        }
        System.out.println("Number of steps to reduce the number to 0 is "+count);


    }
}
