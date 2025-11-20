public class DiaryMainTest {
    public static void main(String[] args) {
        Student student1 = new Student("Иванов И.И.", "11-100");
        Student student2 = new Student("Иванова Ж.Б.", "11-101");
        Student student3 = new Student("Васильев А.И.", "11-102");
        Student[] students = {student1, student2, student3};
        Teacher teacher1 = new Teacher("Ибрагимова А.А.");
        Teacher teacher2 = new Teacher("Авдеев Л.Л.");
        Lesson math = new Lesson(teacher1, "Математика");
        Lesson rus = new Lesson(teacher2, "Русский язык");
        Lesson physics = new Lesson(teacher1, "Физика");
        Diary diary1 = new Diary(student1, math, "11.11.2025", 5, "Дз" );
        Diary diary2 = new Diary(student2, math, "11.11.2025", 4, "Дз" );
        Diary diary3 = new Diary(student3, math, "11.11.2025", 2, "Дз" );
        Diary diary4 = new Diary(student1, rus, "11.11.2025", 7, "Дз" );
        Diary diary5 = new Diary(student2, rus, "11.11.2025", 9, "Дз" );
        Diary diary6 = new Diary(student3, rus, "11.11.2025", 10, "Дз" );
        Diary[] diaries = {diary1, diary2, diary3, diary4, diary5, diary6};
        Rating rating = new Rating(students, diaries);
        diary1.addPoint("20.11.2025", 7, "Работа на уроке");
        diary2.addPoint("20.11.2025", 0, "Работа на уроке");
        diary3.addPoint("20.11.2025", 3, "Работа на уроке");
        diary4.addPoint("20.11.2025", 4, "Работа на уроке");
        diary5.addPoint("20.11.2025", 2, "Работа на уроке");
        diary6.addPoint("20.11.2025", 7, "Работа на уроке");
        rating.calcRating();
        rating.printRating();

    }
}
