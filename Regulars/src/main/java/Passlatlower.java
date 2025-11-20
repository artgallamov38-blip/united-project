import java.util.regex.Pattern;
import java.util.Scanner;
public class Passlatlower {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String PASSWORD_PATTERN = "^.*[a-z]+.*";
		System.out.println(Pattern.matches(PASSWORD_PATTERN, sc.next()));
	}
}