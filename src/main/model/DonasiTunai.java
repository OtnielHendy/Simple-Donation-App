package main.model;

public class DonasiTunai extends Donasi {
    public DonasiTunai(Donatur donatur, double jumlah) {
        super(donatur, jumlah);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Donasi Tunai - " + donatur.getNama() + ": Rp" + jumlah);
    }
}
