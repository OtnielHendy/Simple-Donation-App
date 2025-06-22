package main.model;

public class Donasi {
    protected Donatur donatur;
    protected double jumlah;

    public Donasi(Donatur donatur, double jumlah) {
        this.donatur = donatur;
        this.jumlah = jumlah;
    }

    public double getJumlah() {
        return jumlah;
    }

    public Donatur getDonatur() {
        return donatur;
    }

    public void tampilkanInfo() {
        System.out.println("Donasi oleh " + donatur.getNama() + ": Rp" + jumlah);
    }
}
