import java.util.Scanner;

public class Board {
    static boolean sec = true;
    
    public static void setSec(boolean sec) {
        Board.sec = sec;
    }

    public static String[][] cleanBoard() {
        backHand.cleaner();
        String[][] Grid = new String[3][3];

        int i;
        int j;
        for(i = 0; i < 3; ++i) {
            for(j = 0; j < 3; ++j) {
                Grid[i][j] = "[   ]";
            }
        }

        System.out.println("\n\n\n");

        for(i = 0; i < 3; ++i) {
            for(j = 0; j < 3; ++j) {
                System.out.print("\t\t" + Grid[i][j] + " ");
            }

            System.out.println("\n");
        }

        return Grid;
    }

    public static void Rule() {
        backHand.cleaner();
        int time = 2;
        System.out.println("\n\n\t\t\t\t\t\tRULES OF THE GAME");
        backHand.Sleep((double)time);
        System.out.println("\n\t\t1 YOU WILL PLAY WITH 'X' SYMBOL.");
        backHand.Sleep((double)time);
        System.out.println("\n\t\t2 YOU WILL PLAY FIRST");
        backHand.Sleep((double)time);
        System.out.println("\n\t\t3 YOU CAN PLAY AGAIN BY PRESSING 0");
        backHand.Sleep((double)time);
        System.out.println("\n\t\t4 THIS IS THE FORMAT OF GAME");
        backHand.Sleep((double)time);
        int[] rulegrid = new int[]{7, 8, 9, 4, 5, 6, 1, 2, 3};

        for(int i = 0; i < 9; ++i) {
            if (i % 3 == 0) {
                System.out.println("\n");
            }

            System.out.print("\t\t[" + rulegrid[i] + "] ");
        }

        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.print("\n\n\t\t Press Any Button ---> \t");
        scan.next();
        backHand.cleaner();
    }

    public static void BoardReader(String[][] board) {
        SimpleAudioPlayer.play8bit();
        backHand.cleaner();
        System.out.println("\n\n");

        for(int i = 0; i < 3; ++i) {
            for(int j = 0; j < 3; ++j) {
                System.out.print("\t\t" + board[i][j] + " ");
            }

            System.out.println("\n");
        }

        if (sec) {
            backHand.Sleep(2.0);
            sec = false;
        } else {
            sec = true;
        }

    }

    public static void ScoreBoard(String fname, int com, int draw) {
        System.out.println("\n\n\n\t\t " + fname + "      |      Saurav");
        System.out.println("\t\t ------------------------------------");
        System.out.println("\t\t| 0          WIN          " + com );
        System.out.println("\t\t ------------------------------------");
        System.out.println("\t\t| " + draw + "          DRAW      " + draw );
        System.out.println("\t\t ------------------------------------");
        System.out.println("\t\t| " + com + "         LOSE         0 ");
        System.out.println("\t\t ------------------------------------");
    }
}
