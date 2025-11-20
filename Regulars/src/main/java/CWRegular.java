import java.util.regex.Pattern;
public class CWRegular {
	public static void main(String[] args){
		String EMAIL_PATTERN = "^[a-zA-Z\\d\\-_]+@[a-zA-Z\\d\\-_]+\\.[a-z]{2,}";
		System.out.println(Pattern.matches(EMAIL_PATTERN, "ab-c.d1e_f@gmail.com"));
	}
}