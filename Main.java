import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("first question");
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        System.out.println("second question");
        for (int j = 1; j <= 20; j++) {
            sum += j;
            System.out.println(sum);
        }
        System.out.println("third question");
        for (int t = 2; t < 21; t+=2) {
            System.out.println(t);
        }
        System.out.println("fourth question");
        Scanner input = new Scanner(System.in);
        System.out.print("Pick a number: ");
        int num= input.nextInt();
        for (int n=1; n<=10; n++){
            System.out.println(num + "x" + n + "=" + (num*n));
        }
     System.out.println("fifth question");
        for (int h=10; h>0; h--) {
            System.out.println(h);
        }

    }
}