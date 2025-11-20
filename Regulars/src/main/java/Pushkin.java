import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Pushkin {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\JavaInform\\L251025\\Qpushk\\pushkin.txt"));
        String[] names = new String[] {"Я, мне, моё:", "Море (моря, морем, морю...):", "Муза:", "Любовь:", "Ветры ... веют:", "Друзья:", "Поэт:", "Взор ... (вс)тревожит:"};
        Pattern[] patterns = new Pattern[] {
        Pattern.compile("^((.*\\bЯ\\b.*)|(.*\\bмне\\b.*)|(.*\\bмо[её]\\b.*))$",  Pattern.UNICODE_CHARACTER_CLASS + Pattern.CASE_INSENSITIVE),
        Pattern.compile("^(.*\\bмор(е|я|ю|ем)\\b.*)$",  Pattern.UNICODE_CHARACTER_CLASS + Pattern.CASE_INSENSITIVE),
        Pattern.compile("^(.*\\bмуза\\b.*)$",  Pattern.UNICODE_CHARACTER_CLASS + Pattern.CASE_INSENSITIVE),
        Pattern.compile("^(.*\\bлюбовь\\b.*)$",  Pattern.UNICODE_CHARACTER_CLASS + Pattern.CASE_INSENSITIVE),
        Pattern.compile("^(.*\\bветры\\b.*\\bвеют\\b.*)$",  Pattern.UNICODE_CHARACTER_CLASS + Pattern.CASE_INSENSITIVE),
        Pattern.compile("^(.*\\bдрузья\\b.*)$",  Pattern.UNICODE_CHARACTER_CLASS + Pattern.CASE_INSENSITIVE),
        Pattern.compile("^(.*\\bпоэт\\b.*)$",  Pattern.UNICODE_CHARACTER_CLASS + Pattern.CASE_INSENSITIVE),
        Pattern.compile("^(.*\\bвзор\\b.*\\b(вс)?тревожит\\b.*)$",  Pattern.UNICODE_CHARACTER_CLASS + Pattern.CASE_INSENSITIVE)}; 
        int[] patternscounters = new int[] {0, 0, 0, 0, 0, 0, 0, 0}; //счётчик для прохода по 5 элементам каждого массива под результаты
        String[][] results = new String[8][5]; //массив для первых 5 результатов
        int counter = 0; //счётчик строк
        while(sc.hasNext()) {
            String line = sc.nextLine(); //берём строку из файла
            counter++; //считаем её
            for (int i = 0; i < 8; i++) {
                if (results[i][4] == null && match(line, patterns[i])) { //если массив результатов не заполнен и строка удовлетворяет регулярке
                    results[i][patternscounters[i]] = counter + ": " + line; //то в результат отдаётся счётчик строки + строка
                    patternscounters[i]++; //переходим на след позицию для результата
                }
            }
        }
        sc.close();
        for (int i = 0; i < 8; i++) { //проходим по результатам (8 регулярок)
            System.out.println(names[i]); //выводим название регулярки
            for (int j = 0; j < 5; j++) {
                if (results[i][j] != null) { //если в результате не пустой элемент массива, то выводим
                    System.out.println(results[i][j]);
                } else {break;}
            }
            System.out.println("----------------------------------------------");
        }
    }
    public static boolean match(String line, Pattern pattern) { //функция сравнения регулярки и строки
        Matcher matcher = pattern.matcher(line);
        return matcher.find();
    }
}