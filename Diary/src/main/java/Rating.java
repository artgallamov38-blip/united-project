public class Rating {
    Student[] students;
    Diary[] diaries;

    Rating(Student[] students, Diary[] diaries) {
        this.students = students;
        this.diaries = diaries;
    }

    void calcRating() {
        for (Student student : students) {
            double sum = 0;
            for (Diary diary : diaries) {
                if (diary.student == student) {
                    student.calcTotalpoints(diary.points);
                }
            }
        }
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].getTotalpoints() < students[j + 1].getTotalpoints()) {
                    Student tmp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < students.length; i++) {
            students[i].setRating(i + 1);
        }
    }

    void printRating() {
        for (Student s : students) {
            System.out.println(s.getRating() + " место: " + s.getFio() + " (" + s.getTotalpoints() + " баллов)");
        }
    }
}
