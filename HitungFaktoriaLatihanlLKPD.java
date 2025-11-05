import java.util.Scanner;

public class HitungFaktoriaLatihanlLKPD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bilangan;

        System.out.println("--- Program Menghitung Faktorial ---");
        System.out.println("Bilangan harus positif dan bulat.");
        System.out.print("Masukkan bilangan yang ingin anda masukan: ");
        bilangan = input.nextInt();

        if (bilangan < 0) {
            System.out.println("Bilangan harus positif!");
        } else {
            long faktorial = 1;

            for (int i = 1; i <= bilangan; i++) {
                faktorial *= i;
            }

            System.out.println("Faktorial dari " + bilangan + " adalah: " + faktorial);
        }
        input.close();
    }
}
