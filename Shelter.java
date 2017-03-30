/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shelter;

/**
 *
 * @author Kotak Hitam
 */
public class Shelter {

    String[] namaPenduduk;
    String namaShelter;
    int jumlahPenduduk;

    public Shelter() {
    }

    public Shelter(String namaShelter, int jumlahPenduduk) {
        this.namaShelter = namaShelter;
        this.jumlahPenduduk = jumlahPenduduk;
        this.namaPenduduk = new String[this.jumlahPenduduk];
    }

    public Shelter(String[] namaPenduduk) {
        this.namaPenduduk = namaPenduduk;
        this.jumlahPenduduk = this.namaPenduduk.length;
    }

    public Shelter(String[] namaPenduduk, String namaShelter, int jumlahPenduduk) {
        this.namaPenduduk = namaPenduduk;
        this.namaShelter = namaShelter;
        this.jumlahPenduduk = jumlahPenduduk;
    }

    public Shelter(int jumlahPenduduk) {
        this.jumlahPenduduk = jumlahPenduduk;
    }

    public Shelter(String namaShelter) {
        this.namaShelter = namaShelter;
    }

    public String[] getNamaPenduduk() {
        return namaPenduduk;
    }

    public String getNamaShelter() {
        return namaShelter;
    }

    public void setNamaShelter(String namaShelter) {
        this.namaShelter = namaShelter;
    }

    public int getJumlahPenduduk() {
        return jumlahPenduduk;
    }

    public void setJumlahPenduduk(int jumlahPenduduk) {
        this.jumlahPenduduk = jumlahPenduduk;
        namaPenduduk = new String[this.jumlahPenduduk];
    }

    public String getPendudukbyIndex(int index) {
        return this.namaPenduduk[index - 1];
    }

    public void tampilPenduduk(String judul) {
        System.out.println("=====" + judul + "=====");
        for (int i = 0; i < this.namaPenduduk.length; i++) {
            if (this.namaPenduduk[i] != null) {
                System.out.println("No. " + (i + 1) + " " + this.namaPenduduk[i]);
            }
        }
    }

    public void addPenduduk(String nama) {
        for (int i = 0; i < this.namaPenduduk.length; i++) {
            if (this.namaPenduduk[i] == null) {
                this.namaPenduduk[i] = nama;
                break;
            }
            if (i == this.namaPenduduk.length - 1) {
                System.out.println("Maaf Shelter ini sudah penuh");
            }
        }

     }

    public void setNamaPenduduk(String[] namaPenduduk) {
        int pointer = 0;
        for (int i = 0; i < this.namaPenduduk.length; i++) {
            if (this.namaPenduduk[i] == null) {
                pointer = i;
                break;

            }

        }
        for (int i = 0; i < namaPenduduk.length; i++) {
            this.namaPenduduk[pointer++] = namaPenduduk[i];
        }
    }

}
