import java.util.Scanner;

public class RekapNilaiRPLGhaisan{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0;

        System.out.println("Rekap nilai siswa RPL");
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();


        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            total += nilai;
        }

        double rataRata = total / jumlahSiswa;

        System.out.println("Rata-rata nilai seluruh siswa adalah: " + rataRata);
    }
}
