import arraylist.MyList;

public class Diary {
    Student student;
    Lesson lesson;
    MyList<String> dates;
    MyList<Double> points;
    MyList<String> reasons;

    Diary(Student student, Lesson lesson, String startdate, double startpoint, String startreason) {
        this.student = student;
        this.lesson = lesson;
        String[] dates = {startdate};

        this.dates = MyList.ofString(dates);
        double[] points = {startpoint};
        this.points = MyList.ofDouble(points);
        String[] reasons = {startreason};
        this.reasons = MyList.ofString(reasons);
    }
    void addPoint(String date, double point, String reason) {
        this.dates.add(date);
        this.points.add(point);
        this.reasons.add(reason);
    }
}
