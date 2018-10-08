package me.alarai;

import java.util.Scanner;

/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program User Login
 * */
public class Main {
    private static String usName;
    private static String passWord;
    public static void main(String[] args) {
        System.out.print("Masukkan Username = ");
        Scanner scan1 = new Scanner(System.in);
        usName = scan1.nextLine();

        System.out.print("Masukkan Password = ");
        Scanner scan2 = new Scanner(System.in);
        passWord = scan2.nextLine();

        System.out.println();

        User user  = new User();
        user.pengecheckkanLogin(usName,passWord);


    }
}
