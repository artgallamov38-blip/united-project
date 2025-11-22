import java.util.Scanner;
public class Program {
    private User[] dataBase;
    Scanner sc = new Scanner(System.in);
    private int countUsers;
    public Program() {
        this.dataBase = new User[100];
        dataBase[0] = new User("Art", "12313344", "ADMIN");
        dataBase[1] = new User("Crun", "12rrwe3", "USER");;
        dataBase[2] = new User("Brans", "123sdsd44", "ADMIN");;
        dataBase[3] = new User("WW", "12313ddsd344", "USER");;

        this.countUsers = 4;
    }

        public void run() {
            boolean flag = true;
            while (flag) {
                User user = signIn();
                if (user != null) {
                    flag = false;
                    System.out.println("Добро пожаловать, " + user.getLogin());
                    new WorkSpace(user).showMenu();
                } else {
                    System.out.println("Неверный логин или пароль");
                }
            }
        }
        public User signIn() {
            System.out.println("Введите логин:");
            String login = sc.nextLine();
            if (login.equals("exit")) {System.out.println("Завершение работы"); System.exit(0);}
            System.out.println("Введите пароль:");
            String password = sc.nextLine();
            if (password.equals("exit")) {System.out.println("Завершение работы"); System.exit(0);}
            return checkUser(login, password);
        }
        public User checkUser(String login, String password) {
            for (int i = 0; i < countUsers; i++) {
                if (login.equals(dataBase[i].getLogin()) && password.equals(dataBase[i].getPassword())) {
                    return dataBase[i];
                }
            }
            return null;
        }

}
