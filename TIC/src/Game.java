import java.util.Scanner;

public class Game {
    static int com = 0;
    static int draw = 0;

    public static void counter(boolean var0) {
        if (var0) {
            ++com;
        } else {
            ++draw;
        }

    }

    public static int getCom() {
        return com;
    }

    public static int getDraw() {
        return draw;
    }

    public static void game(String var0) {
        String[][] var1 = Board.cleanBoard();
        Board.setSec(true);
        Scanner var2 = new Scanner(System.in);
        System.out.print("\n\n\t\t Here ---> \t");
        int var3 = var2.nextInt();
        if (var3 == 7) {
            Seven.seven(var1);
        } else if (var3 == 3) {
            Three.three(var1);
        } else if (var3 == 9) {
            Nine.nine(var1);
        } else if (var3 == 1) {
            One.one(var1);
        } else if (var3 == 8) {
            Eight.eight(var1);
        } else if (var3 == 6) {
            Six.six(var1);
        } else if (var3 == 2) {
            Two.two(var1);
        } else if (var3 == 4) {
            Four.four(var1);
        } else if (var3 == 5) {
            Five.five(var1);
        }

        System.out.print("\n\n\t\t Play Again(0) ---> \t");
        int var4 = var2.nextInt();
        if (var4 == 0) {
            game(var0);
        } else {
            backHand.cleaner();
            SimpleAudioPlayer.playGameOver();
            Board.ScoreBoard(var0, getCom(), getDraw());
            backHand.Sleep(5.0);
            SimpleAudioPlayer.playGameOver();
            System.exit(0);
        }

        var2.close();
    }
}
