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
    private String nomor;
    private String kategori;

    // Konstruktor
    public Kontak(int id, String nama, String nomor, String kategori) {
        this.id = id;
        this.nama = nama;
        this.nomor = nomor;
        this.kategori = kategori;
    }

    // Getter dan Setter
    public int getId() { return id; }
    public String getNama() { return nama; }
    public String getNomor() { return nomor; }
    public String getKategori() { return kategori; }

}
