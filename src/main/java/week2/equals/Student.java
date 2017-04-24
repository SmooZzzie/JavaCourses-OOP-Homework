package week2.equals;

/**
 * Created by SmooZzzie on 24.04.2017.
 */
public class Student {

    private String studentName;
    private String studentSurname;

    public Student() {
        this.studentName = "testName";
        this.studentSurname = "testSurname";
    }

    public Student(String studentName, String studentSurname) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || obj.getClass() != Student.class) {
            return false;
        }

        Student other = (Student) obj;

        if(studentName.equals(other.studentName) && studentSurname.equals(other.studentSurname)) {
            return true;
        }

        return false;

    }
}
