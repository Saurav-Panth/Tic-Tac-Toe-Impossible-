import java.util.Scanner;

public class Main {


    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("\n\n\t\t Your Name (Must Be 6-7 Letter Please) ---> \t");
        String var2 = var1.nextLine();
        System.out.println("\n\n\t\t 1 RULES");
        System.out.println("\t\t 2 PLAY");
        System.out.print("\n\n\t\t Press Here ---> \t");
        byte var3 = var1.nextByte();
        if (var3 == 1) {
            Board.Rule();
        }

        Game.game(var2);
        var1.close();
    }
}
