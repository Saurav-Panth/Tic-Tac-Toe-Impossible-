import java.util.Scanner;

public class Board {
    static boolean sec = true;
    public static void setSec(boolean var0) {
        sec = var0;
    }

    public static String[][] cleanBoard() {
        backHand.cleaner();
        String[][] var0 = new String[3][3];

        int var1;
        int var2;
        for(var1 = 0; var1 < 3; ++var1) {
            for(var2 = 0; var2 < 3; ++var2) {
                var0[var1][var2] = "[   ]";
            }
        }

        System.out.println("\n\n\n");

        for(var1 = 0; var1 < 3; ++var1) {
            for(var2 = 0; var2 < 3; ++var2) {
                System.out.print("\t\t" + var0[var1][var2] + " ");
            }

            System.out.println("\n");
        }

        return var0;
    }

    public static void Rule() {
        backHand.cleaner();
        byte var0 = 2;
        System.out.println("\n\n\t\t\t\t\t\tRULES OF THE GAME");
        backHand.Sleep((double)var0);
        System.out.println("\n\t\t1 YOU WILL PLAY WITH 'X' SYMBOL.");
        backHand.Sleep((double)var0);
        System.out.println("\n\t\t2 YOU WILL PLAY FIRST");
        backHand.Sleep((double)var0);
        System.out.println("\n\t\t3 YOU CAN PLAY AGAIN BY PRESSING 0");
        backHand.Sleep((double)var0);
        System.out.println("\n\t\t4 THIS IS THE FORMAT OF GAME");
        backHand.Sleep((double)var0);
        int[] var1 = new int[]{7, 8, 9, 4, 5, 6, 1, 2, 3};

        for(int var2 = 0; var2 < 9; ++var2) {
            if (var2 % 3 == 0) {
                System.out.println("\n");
            }

            System.out.print("\t\t[" + var1[var2] + "] ");
        }

        System.out.println();
        Scanner var3 = new Scanner(System.in);
        System.out.print("\n\n\t\t Press Any Button ---> \t");
        var3.next();
        backHand.cleaner();
    }

    public static void BoardReader(String[][] var0) {
        SimpleAudioPlayer.play8bit();
        backHand.cleaner();
        System.out.println("\n\n");

        for(int var1 = 0; var1 < 3; ++var1) {
            for(int var2 = 0; var2 < 3; ++var2) {
                System.out.print("\t\t" + var0[var1][var2] + " ");
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

    public static void ScoreBoard(String var0, int var1, int var2) {
        System.out.println("\n\n\n\t\t " + var0 + "      |      Saurav");
        System.out.println("\t\t ------------------------------------");
        System.out.println("\t\t| 0          WIN          " + var1);
        System.out.println("\t\t ------------------------------------");
        System.out.println("\t\t| " + var2 + "          DRAW         " + var2);
        System.out.println("\t\t ------------------------------------");
        System.out.println("\t\t| " + var1 + "         LOSE         0 ");
        System.out.println("\t\t ------------------------------------");
    }

}
