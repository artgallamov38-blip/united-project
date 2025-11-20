public class WorkSpace {
    private User user;

    public WorkSpace(User user) {
        this.user = user;
    }
    public void showAdminMenu() {
        System.out.println("Меню администратора: \n1)Доступ к базе данных \n2)Изменение логина/пароля \n3)Отключить сервис \n4)Выход");
    }
    public void showUserMenu() {
        System.out.println("Меню пользователя: \n1)Изменить эл. почту \n2)Изменение логина/пароля \n3)Выход");
    }
    public void showMenu() {
        switch (this.user.getRole()) {
            case "USER": showUserMenu(); break;
            case "ADMIN": showAdminMenu(); break;
        }
    }
}
