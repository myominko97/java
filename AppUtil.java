import java.util.Scanner;

public class AppUtil {
    public static final Scanner scan = new Scanner(System.in);

    public void printHeaderFooter(String message) {
        int length = message.length();

        String star = "";
        for (int i = 0; i < length; i++) {
            star += "*";
        }

        System.out.println("**".concat(star).concat("**"));
        System.out.println("* ".concat(message).concat(" *"));
        System.out.println("**".concat(star).concat("**"));

    }

    public String geString(String message) {
        System.out.println(message);
        return scan.nextLine();
    }

    public int getInt(String message) {
        return Integer.parseInt(geString(message));
    }
}
