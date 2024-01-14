package Hi;

public class Dashboard {
    public String musicPlayer;

    public Dashboard(String musicPlayer){
        this.musicPlayer = musicPlayer;
    }

    void show(){
        System.out.println(musicPlayer);
    }
}
