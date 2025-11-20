public class Diary {
    Student student;
    Lesson lesson;
    SpecChangeableArray dates;
    SpecChangeableArray points;
    SpecChangeableArray reasons;

    Diary(Student student, Lesson lesson, String startdate, double startpoint, String startreason) {
        this.student = student;
        this.lesson = lesson;
        String[] dates = {startdate};
        this.dates = new SpecChangeableArray(dates);
        double[] points = {startpoint};
        this.points = new SpecChangeableArray(points);
        String[] reasons = {startreason};
        this.reasons = new SpecChangeableArray(reasons);
    }
    void addPoint(String date, double point, String reason) {
        this.dates.add(date);
        this.points.add(point);
        this.reasons.add(reason);
    }
}
