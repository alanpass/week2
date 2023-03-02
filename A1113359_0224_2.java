import java.util.Scanner;

public class A1113359_0224_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("輸入攝氏溫度：");
        double c = scanner.nextDouble();

        double f = (celsius * 9 / 5) + 32;

        System.out.println(c + " 度攝氏溫度 = " + f + " 度華氏溫度。");
    }
}