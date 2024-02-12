package Listenify;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Album diljitAlbum = new Album("Moon Child Era","Diljit Dosanjh");

        diljitAlbum.addNewSongToPlayList("Vibe",2.36);
        diljitAlbum.addNewSongToPlayList("Lover",3.10);
        diljitAlbum.addNewSongToPlayList("Luna",2.45);

        Album arijitAlbum = new Album("Hindi Hit Song","Arijit Songs");

        arijitAlbum.addNewSongToPlayList("Kesariya",2.3);
        arijitAlbum.addNewSongToPlayList("Shayad",4.3);
        arijitAlbum.addNewSongToPlayList("Tum hi ho",2.3);
        arijitAlbum.addNewSongToPlayList("Muskurane ki wajah",2.3);
        arijitAlbum.addNewSongToPlayList("Chaleya",2.3);



        List<Song> playList = new ArrayList<>();
        diljitAlbum.addSongToPlayList(1,playList);
        diljitAlbum.addSongToPlayList("Luna",playList);
        arijitAlbum.addSongToPlayList(3,playList);
        arijitAlbum.addSongToPlayList("Chaleya",playList);

    }

    public void printMenu() {

        System.out.println("1. Play Next Song");
        System.out.println("2. Play Previous Song");
        System.out.println("3. Repeat the Song");
        System.out.println("4. Shuffle the PlayList");
        System.out.println("5. Delete the current Song");
        System.out.println("6. Print the Menu ");
        System.out.println("7. View the PlayList");
        System.out.println("8. Exit the Application");

    }
}