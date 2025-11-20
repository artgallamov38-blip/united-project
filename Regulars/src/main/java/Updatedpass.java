import java.util.regex.Pattern;
import java.util.Scanner;
public class Updatedpass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String PASSWORD_PATTERN = "^.{8,}";
		System.out.println(Pattern.matches(PASSWORD_PATTERN, sc.next()));
	}
}