package Listenify;

public class Song {

    private String songTitle;
    private double duration;

    private String password;

    public Song(String songTitle, double duration) {
        this.songTitle = songTitle;
        this.duration = duration;
    }

    public String getSongTitle() {
        return songTitle;
    }


    public double getDuration() {
        return duration;
    }


    public String setSongTitle(String newSongTitle,String enteredPassword){

        if(enteredPassword.equals(password)){
            songTitle = newSongTitle;
            return "Song title modified successfully";
        }

        return "Incorrect password";

    }


    public String toString() {
        return "Song{" +
                "songTitle='" + songTitle + '\'' +
                ", duration=" + duration +
                '}';
    }
}
