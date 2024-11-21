/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Kontak {
    private int id;
    private String nama;
    private String nomor_telepon;
    private String kategori;

    // Konstruktor
    public Kontak(int id, String nama, String nomor_telepon, String kategori) {
        this.id = id;
        this.nama = nama;
        this.nomor_telepon = nomor_telepon;
        this.kategori = kategori;
    }

    // Getter dan Setter
    public int getId() { return id; }
    public String getNama() { return nama; }
    public String getNomor_telepon() { return nomor_telepon; }
    public String getKategori() { return kategori; }
}
