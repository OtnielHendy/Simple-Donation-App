package main.service;

import java.util.ArrayList;
import java.util.List;

import main.model.Donasi;

public class DonasiManager {
    private List<Donasi> daftarDonasi = new ArrayList<>();

    public void tambahDonasi(Donasi donasi) {
        daftarDonasi.add(donasi);
        System.out.println("Donasi berhasil ditambahkan!\n");
    }

    public void tampilkanSemuaDonasi() {
        if (daftarDonasi.isEmpty()) {
            System.out.println("Belum ada donasi.\n");
            return;
        }

        System.out.println("=== Riwayat Donasi ===");
        for (Donasi d : daftarDonasi) {
            d.tampilkanInfo();
        }
        System.out.println();
    }

    public double hitungTotalDonasi() {
        double total = 0;
        for (Donasi d : daftarDonasi) {
            total += d.getJumlah();
        }
        return total;
    }
}
