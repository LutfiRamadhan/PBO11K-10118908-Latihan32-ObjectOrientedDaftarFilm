/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan32;

/**
 *
 * @author lutfi
 * NAMA  : LUTFI RAMADHAN
 * NIM   : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class Latihan32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Film list = new Film();
        System.out.println("===Daftar Film Sedang Tayang===\n");
        list.filmName = "Venom";
        list.filmGenre = "Action, Horror, Scifi";
        list.filmRating = 8.5;
        list.filmDuration = 120;
        list.nowPlaying();
        list.filmName = "Small Foot";
        list.filmGenre = "Animation";
        list.filmRating = 9.0;
        list.filmDuration = 96;
        list.nowPlaying();
        list.filmName = "Crazy Rich Asian";
        list.filmGenre = "Comedy";
        list.filmRating = 7.8;
            list.filmDuration = 119;
        list.nowPlaying();
        list.filmName = "Asih";
        list.filmGenre = "Horror";
        list.filmRating = 6.0;
        list.filmDuration = 100;
        list.nowPlaying();
    }
    
}
