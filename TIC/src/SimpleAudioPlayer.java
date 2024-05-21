import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SimpleAudioPlayer {

    public static void PlayMusic(String var0) {
        try {
            URL var1 = SimpleAudioPlayer.class.getResource(var0);
            if (var1 != null) {
                AudioInputStream var2 = AudioSystem.getAudioInputStream(var1);
                Clip var3 = AudioSystem.getClip();
                var3.open(var2);
                var3.start();
            } else {
                System.out.println("Can't find music file: " + var0);
            }
        } catch (Exception var4) {
            System.out.println("Error: " + var4.getMessage());
        }

    }

    public static void play8bit() {
        String var0 = "8-bit-game-4-188106.wav";
        PlayMusic(var0);
    }

    public static void playGameDraw() {
        String var0 = "Draw.wav";
        PlayMusic(var0);
    }

    public static void playGameLoss() {
        String var0 = "com.wav";
        PlayMusic(var0);
    }

    public static void playGameOver() {
        String var0 = "gameover.wav";
        PlayMusic(var0);
    }
}
