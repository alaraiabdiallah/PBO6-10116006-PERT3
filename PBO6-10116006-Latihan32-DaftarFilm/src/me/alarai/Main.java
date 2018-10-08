package me.alarai;
/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program list film
 * */
public class Main {

    public static void main(String[] args) {
        System.out.println("===Daftar Film Sedang Tayang===");
        System.out.println();

        Film film1 = new Film();
        film1.filmName     = "Venom";
        film1.filmGenre    = "Action, Horror, Scifi";
        film1.filmRating   = 8.5;
        film1.filmDuration = 120;
        film1.nowPlaying();

        Film film2 = new Film();
        film2.filmName     = "Small Foot";
        film2.filmGenre    = "Animation";
        film2.filmRating   = 9;
        film2.filmDuration = 96;
        film2.nowPlaying();

        Film film3 = new Film();
        film3.filmName     = "Crazy Rich Asian";
        film3.filmGenre    = "Comedy";
        film3.filmRating   = 7.8;
        film3.filmDuration = 119;
        film3.nowPlaying();

        Film film4 = new Film();
        film4.filmName     = "Asih";
        film4.filmGenre    = "Horror";
        film4.filmRating   = 6;
        film4.filmDuration = 100;
        film4.nowPlaying();
    }
}
