public class Student {
    private String name;
    private int StudentId;
    private String Major;
    private int grade;

    public Student(String name, int studentId, String major, int grade) {
        this.name = name;
        this.StudentId = studentId;
        this.Major = major;
        this.grade = grade;
    }

    public int getStudentId() {
        return StudentId;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String getMajor() {
        return Major;
    }


}
