package me.alarai;

import java.util.Scanner;

/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program Kalkulator Sederhana
 * */
public class Main {

    public static void main(String[] args) {
        System.out.println("====Aplikasi Kalkulator Bilangan====");

        System.out.print("Masukkan bilangan ke-1 : ");
        Scanner scan1 = new Scanner(System.in);
        double bilangan1 = scan1.nextDouble();

        System.out.print("Masukkan bilangan ke-2 : ");
        Scanner scan2 = new Scanner(System.in);
        double bilangan2 = scan2.nextDouble();

        System.out.println();

        Kalkulator calc = new Kalkulator();
        calc.value1 = bilangan1;
        calc.value2 = bilangan2;
        System.out.println("Hasil Pertambahan : "+calc.tambahBilangan());
        System.out.println("Hasil Pengurangan : "+calc.kurangBilangan());
        System.out.println("Hasil Perkalian : "+calc.kaliBilangan());
        System.out.println("Hasil Pembagian : "+calc.bagiBilangan());
        System.out.println("Hasil Sisa : "+calc.sisaBilangan());
    }
}
