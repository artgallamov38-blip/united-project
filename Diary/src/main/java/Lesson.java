public class Lesson {
    final String subject;
    Teacher teacher;

    Lesson(Teacher teacher, String subject) {
        this.teacher = teacher;
        this.subject = subject;
    }

    String getSubject() {
        return subject;
    }

    String getTeachersname() {
        return this.teacher.getName();
    }

    void setTeachersname (String teachersname) {
        this.teacher.setName(teachersname);
    }
    public String toString() {
        return "Предмет: " + this.subject + " ФИО преподавателя: " + this.teacher;
    }
}
