import java.util.Scanner;

public class A1113359_0224_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("輸入一個整數");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("偶數");
        } else {
            System.out.println("奇數");
        }
    }
}