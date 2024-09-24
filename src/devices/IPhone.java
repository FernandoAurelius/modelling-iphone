package devices;

import utils.InternetBrowser;
import utils.MusicPlayer;

public class IPhone extends ElectronicDevice implements MusicPlayer, InternetBrowser {
    @Override
    public void showPage() {
        System.out.println("Showing an Internet page in Safari!");
    }

    @Override
    public void updatePage() {
        System.out.println("Updating the current Internet page in Safari!");
    }

    @Override
    public void addNewGuide() {
        System.out.println("Adding a new guide to Safari!");
    }

    @Override
    public void play() {
        System.out.println("Playing music!");
    }

    @Override
    public void pause() {
        System.out.println("Pausing music!");
    }

    @Override
    public void selectMusic(String music) {
        System.out.println("Now playing: " + music + " 🎵");
    }

    @Override
    public void call() {
        System.out.println("Calling momma!");
    }

    @Override
    public void answer() {
        System.out.println("Answering grandpa!");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("You have 0 new messages! :(");
    }
}
