/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectpart3;

/**
 *
 * @author arist
 */
public class Song {
    private String title; // The song's title
    private String artist; // The song's artist
    /**
    Constructor
    @param title A reference to a String object
    containing the song's title.
    @param artist A reference to a String object
    containing the song's artist.
    */
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
    /**
    The toString method
    @return A String object containing the name
    of the song and the artist.
    */
    @Override
    public String toString() {
        return title + " by " + artist + "\n";
    }
}
