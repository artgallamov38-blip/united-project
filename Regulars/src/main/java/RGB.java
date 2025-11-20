import java.util.regex.Pattern;
import java.util.Scanner;
public class RGB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tff = "(25[0-5]|2[0-4]\\d|1\\d\\d|\\d?\\d)";
        String RGB_PATTERN = "^[Rr]+[Gg]+[Bb]+\\s*\\(\\s*" + tff + "\\s*,\\s*" + tff + "\\s*,\\s*" + tff + "\\s*\\)$";
        System.out.println(Pattern.matches(RGB_PATTERN, "RrGgBb ( 255  , 255  ,  60   )"));
        System.out.println(Pattern.matches(RGB_PATTERN, "Rgb ( 255  , 255  ,  60   )"));
        System.out.println(Pattern.matches(RGB_PATTERN, "Rgb ( 256  , 255  ,  60   )"));
    }
}