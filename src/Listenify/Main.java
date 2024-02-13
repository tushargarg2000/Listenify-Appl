package Listenify;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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

        System.out.println("Welcome the Listenify Application");

        int currSongIndex = 0;
        System.out.println("Now playing "+playList.get(currSongIndex).toString());
        printMenu();
        startPlayList(playList);
    }

    public static void startPlayList(List<Song> playList){

        int currSongIndex = 0;
        Scanner sc = new Scanner(System.in);
        boolean quitApplication = false;
        while(quitApplication==false){

            System.out.println("Enter your choice !! ");

            int choice = sc.nextInt();
            switch (choice){

                case 1:
                    currSongIndex=currSongIndex+1;
                    if(currSongIndex==playList.size()){
                        currSongIndex=0;
                    }
                    System.out.println("Now playing "+playList.get(currSongIndex).toString());
                    break;
                case 2:
                    currSongIndex = currSongIndex-1;
                    if(currSongIndex==-1){
                        currSongIndex = 0;
                    }
                    System.out.println("Now playing "+playList.get(currSongIndex).toString());
                    break;
                case 3:
                    System.out.println("Now playing "+playList.get(currSongIndex).toString());
                    break;
                case 4:
                    Collections.shuffle(playList);
                    break;
                case 5:
                    playList.remove(currSongIndex);
                    break;
                case 6:
                    printMenu();
                    break;
                case 7:
                    printPlayList(playList);
                    break;
                case 8:
                    quitApplication = true;
                    break;
            }

        }



    }


    public static void printMenu() {


        System.out.println("1. Play Next Song");
        System.out.println("2. Play Previous Song");
        System.out.println("3. Repeat the Song");
        System.out.println("4. Shuffle the PlayList");
        System.out.println("5. Delete the current Song");
        System.out.println("6. Print the Menu ");
        System.out.println("7. View the PlayList");
        System.out.println("8. Exit the Application");

    }

    private static void printPlayList(List<Song> playList){

        for(Song song:playList) {
            System.out.println(song.toString());
        }
    }
}