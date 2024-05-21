
import java.util.Scanner;

public class backHand {

    public static void Sleep(double var0) {
        try {
            double var2 = var0 * 1000.0;
            int var4 = (int)var2;
            Thread.sleep(var4);
        } catch (InterruptedException var5) {
            System.out.println("ERROR");
        }

    }

    public static void cleaner() {
        try {
            (new ProcessBuilder(new String[]{"cmd", "/c", "cls"})).inheritIO().start().waitFor();
        } catch (Exception var1) {
            System.out.println("Error clearing console: " + var1.getMessage());
        }

    }

    public static int here() {
        Scanner var0 = new Scanner(System.in);
        System.out.print("\n\n\t\t Here ---> \t");
        int var1 = var0.nextInt();
        return var1;
    }
}
