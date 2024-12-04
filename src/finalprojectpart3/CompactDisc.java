/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectpart3;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author arist
 */
public class CompactDisc {
    public static void main(String[] args)throws IOException {
        Scanner input = new Scanner(new File("src/finalprojectpart3/Classics.txt"));
        String title;
        String artist;
        Song[] cd = new Song[6];
        
        for (int i = 0; i < cd.length; i++) {
            title = input.nextLine();
            artist = input.nextLine();
            cd[i] = new Song(title, artist);
        
        }
        System.out.println("Contents of Classics:");
        for (int i = 0; i < cd.length; i++) {
            System.out.print(cd[i].toString());
            
        }
    }
}
