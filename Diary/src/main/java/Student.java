import arraylist.MyList;

public class Student {
    String fio;
    String group;
    double totalpoints = 0.0;
    int rating;

    Student(String fio, String group) {
        this.fio = fio;
        this.group = group;
    }

    void setFio(String fio) {
        this.fio = fio;
    }
    String getFio() {
        return this.fio;
    }

    void setGroup(String group) {
        this.group = group;
    }
    String getGroup() {
        return this.group;
    }

    void calcTotalpoints(MyList<Double> points) {
        double sum = 0;
            for (int i = 0; i < points.length(); i++) {
                sum += points.get(i);
            }
        this.totalpoints += sum;
    }
    double getTotalpoints() {
        return this.totalpoints;
    }

    void setRating(int rating) {
        this.rating = rating;
    }
    int getRating() {
        return this.rating;
    }
    public String toString() {
        return "ФИО: " + this.fio + " Группа: " + this.group + " Итоговое число баллов: " + this.totalpoints +
                " Место в рейтинге: " + this.rating;
    }

}


