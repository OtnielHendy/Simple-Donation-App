package main.app;

import java.util.Scanner;

import main.model.Donasi;
import main.model.DonasiTransfer;
import main.model.DonasiTunai;
import main.model.Donatur;
import main.service.DonasiManager;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DonasiManager manager = new DonasiManager();

        while (true) {
            System.out.println("=== Aplikasi Donasi Sederhana ===");
            System.out.println("1. Tambah Donasi");
            System.out.println("2. Tampilkan Semua Donasi");
            System.out.println("3. Tampilkan Total Donasi");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Donatur: ");
                    String nama = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("No HP: ");
                    String noHP = scanner.nextLine();
                    Donatur donatur = new Donatur(nama, email, noHP);

                    System.out.print("Jumlah Donasi: ");
                    double jumlah = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Metode (tunai/transfer): ");
                    String metode = scanner.nextLine();

                    Donasi donasi;
                    if (metode.equalsIgnoreCase("tunai")) {
                        donasi = new DonasiTunai(donatur, jumlah);
                    } else {
                        donasi = new DonasiTransfer(donatur, jumlah);
                    }

                    manager.tambahDonasi(donasi);
                    break;

                case 2:
                    manager.tampilkanSemuaDonasi();
                    break;

                case 3:
                    System.out.println("Total Donasi: Rp" + manager.hitungTotalDonasi() + "\n");
                    break;

                case 0:
                    System.out.println("Terima kasih telah menggunakan aplikasi donasi.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid.\n");
            }
        }
    }
}
