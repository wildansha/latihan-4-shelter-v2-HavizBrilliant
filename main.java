/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shelter;

import java.util.Scanner;

/**
 *
 * @author Kotak Hitam
 */
public class main {

    public static void main(String[] args) {

        //Shelter A
        Shelter A = new Shelter("Shelter A", 12);
        String[] Penduduk = {"A", "B", "C", "D"};
        A.setNamaPenduduk(Penduduk);
        
        //Shelter B
        Shelter B = new Shelter();
        B.setJumlahPenduduk(3);
        B.setNamaPenduduk(new String[]{"A", "B", "C"});
        B.setNamaShelter("Shelter B");

        //Shelter C
        Shelter C = new Shelter(Penduduk);
        C.setNamaShelter("Shelter C");

        Boolean menu = true;
        Scanner in = new Scanner(System.in);

        System.out.println("=======SHELTER==========");

        while (menu) {
            System.out.println("=======SHELTER==========");
            System.out.println("1. Jumlah Penduduk berdasarkan Shelter");
            System.out.println("2. Menampilkan Nama-nama Penduduk di semua Shelter");
            System.out.println("3. Nama-nama Penduduk suatu Shelter");
            System.out.println("4. Nama-nama penduduk dari suatu Shelter di index tertentu");
            System.out.println("5. Menambahkan penduduk pada suatu Shelter");
            System.out.println("6. Keluar");
            System.out.print("OPSI:");
            int input = in.nextInt();

            switch (input) {
                case 1:
                    System.out.println(A.getNamaShelter() + " " + A.getJumlahPenduduk());
                    System.out.println(B.getNamaShelter() + " " + B.getJumlahPenduduk());
                    System.out.println(C.getNamaShelter() + " " + C.getJumlahPenduduk());
                    break;
                case 2:
                    A.tampilPenduduk(A.getNamaShelter());
                    B.tampilPenduduk(A.getNamaShelter());
                    C.tampilPenduduk(A.getNamaShelter());
                    break;
                case 3:
                    System.out.println("Pilih Shelter: ");
                    System.out.println("1. A");
                    System.out.println("2. B");
                    System.out.println("3. C");
                    System.out.print("opsi: ");

                    int h = in.nextInt();
                    switch (h) {
                        case 1:
                            A.tampilPenduduk(A.getNamaShelter());
                            break;
                        case 2:
                            B.tampilPenduduk(A.getNamaShelter());
                            break;
                        case 3:
                            C.tampilPenduduk(A.getNamaShelter());
                            break;
                    }
                    break;
                case 4:
                    int index;
                    System.out.println("Pilih Shelter: ");
                    System.out.println("1. A");
                    System.out.println("2. B");
                    System.out.println("3. C");
                    System.out.print("opsi: ");
                    int D = in.nextInt();
                    switch (D) {
                        case 1:
                            System.out.print("input index:");
                            index = in.nextInt();
                            System.out.println("No." + index + " " + A.getPendudukbyIndex(index));
                            break;
                        case 2:
                            System.out.print("input index:");
                            index = in.nextInt();
                            System.out.println("No." + index + " " + B.getPendudukbyIndex(index));
                            break;
                        case 3:
                            System.out.print("input index:");
                            index = in.nextInt();
                            System.out.println("No." + index + " " + C.getPendudukbyIndex(index));
                            break;
                    }
                    break;
                case 5:
                    String nama;
                    System.out.println("Pilih Shelter: ");
                    System.out.println("1. A");
                    System.out.println("2. B");
                    System.out.println("3. C");
                    System.out.print("opsi: ");
                    int ops = in.nextInt();
                    switch (ops) {
                        case 1:
                            System.out.print("input nama:");
                            nama = in.next();
                            A.addPenduduk(nama);
                            break;
                        case 2:
                            System.out.print("input nama:");
                            nama = in.next();
                            B.addPenduduk(nama);
                            break;
                        case 3:
                            System.out.print("input nama:");
                            nama = in.next();
                            C.addPenduduk(nama);
                            break;
                    }
                    break;
                case 6:
                    System.out.println("TERIMA KASIH");
                    System.out.println();
                    menu = false;
            }

        }

    }
}

/* 
   Nama : M.Haviz Brillianto
   NIM : 165150200111128
*/
