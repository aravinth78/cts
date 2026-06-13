public class CourseInfo {
    private String courseName;
    private int courseCode;

    public CourseInfo(String courseName, int courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public void show() {
        System.out.println("Course: " + courseName);
        System.out.println("Code: " + courseCode);
    }

    public boolean isActive() {
        return courseCode > 0;
    }

    public static void main(String[] args) {
        CourseInfo d = new CourseInfo("Java Programming", 101);
        d.show();
        System.out.println("Active: " + d.isActive());
    }
}
