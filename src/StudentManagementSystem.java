public class StudentManagementSystem {
    private final int MAX_NUMBER;
    private int countNumber = 0;
    private Student[] students;

    public StudentManagementSystem(int MAX_NUMBER) {
        this.MAX_NUMBER = MAX_NUMBER;
        this.students = new Student[MAX_NUMBER];
    }


    public void searchStudent(int studentId) {
        boolean found = false;
        for (Student student : students) {
            if (studentId == student.getStudentId()) {
                System.out.println("학생을 찾았습니다");
                System.out.println("이름 : " + student.getName());
                System.out.println("학번 : " + student.getStudentId());
                System.out.println("전공 : " + student.getMajor());
                System.out.println("학년 : " + student.getGrade());
                found = true;
            }
        }
        if (!found) {
            System.out.println("학생을 찾지 못했습니다");
        }
    }


    public void addStudent(Student student) {
        if (countNumber < MAX_NUMBER) {
            students[countNumber] = student;
            countNumber++;
            System.out.println("학생을 추가했습니다.");
        }else {
            System.out.println("학생을 더 추가할 수 없습니다");
        }
    }

    public void removeStudent(Student student1) {
        Student[] newStudents = new Student[MAX_NUMBER];
        int count = 0;
        for (Student student : students) {
            if (!student.equals(student1)) {    //값이 다르면 if문 통과
                                                // 값이 같으면?
                newStudents[count] = student;   //newStudent 배열에 student 추가
                count++;
            }
        }
        students = newStudents;
    }

    public void printStudent() {
        for (Student student : students) {
            System.out.println("학생을 찾았습니다");
            System.out.println("이름 : " + student.getName());
            System.out.println("학번 : " + student.getStudentId());
            System.out.println("전공 : " + student.getMajor());
            System.out.println("학년 : " + student.getGrade());
        }
    }
}

