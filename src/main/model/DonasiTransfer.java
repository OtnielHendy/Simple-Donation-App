package main.model;

public class DonasiTransfer extends Donasi {
    public DonasiTransfer(Donatur donatur, double jumlah) {
        super(donatur, jumlah);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Donasi Transfer - " + donatur.getNama() + ": Rp" + jumlah);
    }
}
