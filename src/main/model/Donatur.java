package main.model;

public class Donatur {
    private String nama;
    private String email;
    private String noHP;

    public Donatur(String nama, String email, String noHP) {
        this.nama = nama;
        this.email = email;
        this.noHP = noHP;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getNoHP() {
        return noHP;
    }
}
