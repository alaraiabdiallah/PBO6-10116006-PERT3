package me.alarai;

public class Film {
    public String filmName;
    public String filmGenre;
    public double filmRating;
    public int filmDuration;

    public void nowPlaying(){
        System.out.println("Judul Film : "+this.filmName);
        System.out.println("Genre Film : "+this.filmGenre);
        System.out.println("Rating Film : "+this.filmRating);
        System.out.println("Duration Film : "+this.filmDuration+" Menit");
        System.out.println();
    }
}
