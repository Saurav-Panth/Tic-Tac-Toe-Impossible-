import java.util.Scanner;

public class Game {
    static int com = 0;
    static int draw = 0;
    
    public static void counter(boolean c) {
        if (c) {
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

    public static void game(String fname) {
        String[][] board = Board.cleanBoard();
        Board.setSec(true);
        Scanner in = new Scanner(System.in);
        System.out.print("\n\n\t\t Here ---> \t");
        int ch4 = in.nextInt();
        if (ch4 == 7) {
            Seven.seven(board);
        } else if (ch4 == 3) {
            Three.three(board);
        } else if (ch4 == 9) {
            Nine.nine(board);
        } else if (ch4 == 1) {
            One.one(board);
        } else if (ch4 == 8) {
            Eight.eight(board);
        } else if (ch4 == 6) {
            Six.six(board);
        } else if (ch4 == 2) {
            Two.two(board);
        } else if (ch4 == 4) {
            Four.four(board);
        } else if (ch4 == 5) {
            Five.five(board);
        }

        System.out.print("\n\n\t\t Play Again(0) ---> \t");
        int ch5 = in.nextInt();
        if (ch5 == 0) {
            game(fname);
        } else {
            backHand.cleaner();
            SimpleAudioPlayer.playGameOver();
            Board.ScoreBoard(fname, getCom(), getDraw());
            backHand.Sleep(5.0);
            SimpleAudioPlayer.playGameOver();
        }

        in.close();
    }
}
