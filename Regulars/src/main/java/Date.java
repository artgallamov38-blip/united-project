import java.util.regex.Pattern;
import java.util.Scanner;
public class Date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String DATE_PATTERN = "^(0[1-9]|1\\d|2\\d|3[0-1])\\.(0[1-9]|1[0-2])\\.(?!0000)\\d{4}$";
        System.out.println("31.12.2000 " + Pattern.matches(DATE_PATTERN, "31.12.2000"));
        System.out.println("32.12.2000 " + Pattern.matches(DATE_PATTERN, "32.12.2000"));
        String DATE_PATTERN2 = "^(0[1-9]|1\\d|2\\d|3[0-1])\\.(0[1-9]|1[0-2])\\.\\d{2}$";
        System.out.println("31.12.00 " + Pattern.matches(DATE_PATTERN2, "31.12.00"));
        System.out.println("31.13.00 " + Pattern.matches(DATE_PATTERN2, "31.13.00"));
        String DATE_PATTERN3 = "^(?!0000)\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|1\\d|2\\d|3[0-1])$";
        System.out.println("2001-12-31 " + Pattern.matches(DATE_PATTERN3, "2001-12-31"));
        System.out.println("2001-12-32 " + Pattern.matches(DATE_PATTERN3, "2001-12-32"));
        String DATE_PATTERN4 = "^(0[1-9]|1\\d|2\\d|3[0-1])/(I|II|III|IV|V|VI|VII|VIII|IX|X|XI|XII)/(?!0000)\\d{4}$";
        System.out.println("31/XII/2001 " + Pattern.matches(DATE_PATTERN4, "31/XII/2001"));
        System.out.println("32/XII/2001 " + Pattern.matches(DATE_PATTERN4, "32/XII/2001"));
    }
}