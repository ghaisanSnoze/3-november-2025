import java.util.Scanner;

public class LatUKLghaisanafifalghifariXrpl8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double berat, panjang, lebar, tinggi, volume, jarak, biayaPerkg, totalBiaya;

        System.out.println("Selamat datang di Apip ekspedisi");
        System.out.println("NOTE: Jarak kurang dari atau sama dengan 10 km biaya menjadi Rp 4.250 per kg");
        System.out.println("Jarak lebih dari 10 km biaya menjadi Rp 6.000 per kg");
        System.out.println("Volume paket akan dikenakan biaya Rp 50.000 ketika volume melebihi 100 cm³");

        System.out.print("Masukkan berat barang anda dalam kg: ");
        berat = input.nextDouble();

        System.out.print("Masukkan panjang barang (cm): ");
        panjang = input.nextDouble();

        System.out.print("Masukkan lebar barang (cm): ");
        lebar = input.nextDouble();

        System.out.print("Masukkan tinggi barang (cm): ");
        tinggi = input.nextDouble();

        System.out.print("Masukkan jarak tempuh pengiriman (km): ");
        jarak = input.nextDouble();

        volume = panjang * lebar * tinggi;

        if (jarak <= 10) {
            biayaPerkg = 4250;
        } else {
            biayaPerkg = 6000;
        }

        totalBiaya = berat * biayaPerkg;

        if (volume > 100) {
            totalBiaya += 50000;
        }

        System.out.println("-------------NOTA ANDA--------------");
        System.out.println("Volume barang: " + volume + " cm³");
        System.out.println("Biaya pengiriman per kg: Rp " + biayaPerkg);
        System.out.println("Biaya total pengiriman: Rp " + totalBiaya);
        System.out.println("------------------------------------");
        System.out.println("Terima kasih telah menggunakan jasa Apip ekspedisi!");

        input.close();
    }
}
