import java.util.Scanner;

public class backHand {

    public static void Sleep(double time) {
        try {
            double time1 = time * 1000.0;
            int time2 = (int)time1;
            Thread.sleep((long)time2);
        } catch (InterruptedException var5) {
            System.out.println("ERROR");
        }

    }

    public static void cleaner() {
//    	System.out.println("\f");
//        try {
//            if (System.getProperty("os.name").contains("Windows")) {
//                (new ProcessBuilder(new String[]{"cmd", "/c", "cls"})).inheritIO().start().waitFor();
//            } else {
//                (new ProcessBuilder(new String[]{"clear"})).inheritIO().start().waitFor();
//            }
//        } catch (InterruptedException | IOException var1) {
//            System.out.println("error occur");
//        }
    	for (int i = 0; i < 100; i++) {
			System.out.println("\n\n");
		}

    }

    public static int here() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n\n\t\t Here ---> \t");
        int sc = scan.nextInt();
        return sc;
    }
}
