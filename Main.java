import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = inp.nextInt();
        
        if (n <= 0) {
            System.out.println("Geçerli bir sayı giriniz.");
            return;
        }

        System.out.print("1. sayıyı giriniz: ");
        int number = inp.nextInt();
        int min = number;
        int max = number;

        for (int i = 2; i <= n; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            number = inp.nextInt();

            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);
    }
}