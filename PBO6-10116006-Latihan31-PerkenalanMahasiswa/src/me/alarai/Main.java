package me.alarai;
/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program perkenalan mahasiswa
 * */
public class Main {

    public static void main(String[] args) {
	    Mahasiswa mhs1 = new Mahasiswa();
	    mhs1.nim  = "10116006";
	    mhs1.nama = "Ala Rai AbdiAllah";
	    mhs1.perkenalkanDiri();

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim  = "10116007";
        mhs2.nama = "Ahmad Surya Baihaqi";
        mhs2.perkenalkanDiri();

        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim  = "10116001";
        mhs3.nama = "Muhammad Djusril";
        mhs3.perkenalkanDiri();

        Mahasiswa mhs4 = new Mahasiswa();
        mhs4.nim  = "10116002";
        mhs4.nama = "Maman Julaiman";
        mhs4.perkenalkanDiri();
    }
}
