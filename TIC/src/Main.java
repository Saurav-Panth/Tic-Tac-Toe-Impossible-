import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n\n\t\t Your Name (Must Be 6-7 Letter Please) ---> \t");
        String fname = scan.nextLine();
        System.out.println("\n\n\t\t 1 RULES");
        System.out.println("\t\t 2 PLAY");
        System.out.print("\n\n\t\t Press Here ---> \t");
        byte ch1 = scan.nextByte();
        if (ch1 == 1) {
            Board.Rule();
        }

        Game.game(fname);
        scan.close();
    }
}
