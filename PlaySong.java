import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class PlaySong {
    public static void main(String[] args) {
        try {
            File songFile = new File("song.wav"); // song ka path
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(songFile);

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            System.out.println("Teri tasveer nu dekha me rauz ,
                                Par eh te adat purani meri ,
                                Supne cho aja nikal samne ,
                                Karde jo poori jubani meri ,
                                Tere ne zindagi dekhi he jo ,
                                Ik te eh soch niani meri");
            
            Thread.sleep(clip.getMicrosecondLength() / 1000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
