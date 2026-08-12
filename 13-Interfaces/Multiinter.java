interface Camera {
    void TakePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class SmartPhone implements MusicPlayer, Camera {

    @Override
    public void TakePhoto() {
        System.out.println("Taking Photo.....");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing Music.....");
    }

}

public class Multiinter {
    public static void main(String[] args) {
        SmartPhone obj = new SmartPhone();
        obj.TakePhoto();
        obj.playMusic();
    }
}
