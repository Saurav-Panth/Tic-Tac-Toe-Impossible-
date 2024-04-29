import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class SimpleAudioPlayer {

    public static void PlayMusic(String filePath) {
        try {
            File musicPath = new File(filePath);
            if (musicPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
            } else {
                System.out.println("can't find music file");
            }
        } catch (Exception var4) {
            System.out.println("error");
        }

    }

    public static void play8bit() {
        String filePath = "src/8-bit-game-4-188106.wav";
        PlayMusic(filePath);
        JOptionPane optionPane = new JOptionPane();
        JDialog dialog = optionPane.createDialog("Dummy Dialog");
        dialog.setVisible(false);
        dialog.dispose();
    }

    public static void playGameDraw() {
        String filePath = "src/Draw.wav";
        PlayMusic(filePath);
        JOptionPane optionPane = new JOptionPane();
        JDialog dialog = optionPane.createDialog("Dummy Dialog");
        dialog.setVisible(false);
        dialog.dispose();
    }

    public static void playGameLoss() {
        String filePath = "src/com.wav";
        PlayMusic(filePath);
        JOptionPane optionPane = new JOptionPane();
        JDialog dialog = optionPane.createDialog("Dummy Dialog");
        dialog.setVisible(false);
        dialog.dispose();
    }

    public static void playGameOver() {
        String filePath = "src/gameover.wav";
        PlayMusic(filePath);
        JOptionPane optionPane = new JOptionPane();
        JDialog dialog = optionPane.createDialog("Dummy Dialog");
        dialog.setVisible(false);
        dialog.dispose();
    }
}
