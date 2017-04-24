package week2.equals;

/**
 * Created by SmooZzzie on 24.04.2017.
 */
public class Group {

    private static final int DEFAULT_GROUP_SIZE = 20;

    private String groupName;
    private Student[] students;
    private int actualGroupSize;

    public Group() {
        this.groupName = "TestGroupName";
        this.students = new Student[DEFAULT_GROUP_SIZE];
    }

    public Group(String groupName) {
        this.groupName = groupName;
        this.students = new Student[DEFAULT_GROUP_SIZE];
    }

    public Group(String groupName, int sizeOfGroup) {
        this.groupName = groupName;
        this.students = new Student[sizeOfGroup];
    }

    public Student[] getStudents() {
        return students;
    }

    public void setActualGroupSize(int actualGroupSize) {
        this.actualGroupSize = actualGroupSize;
    }

    public boolean addStudent(Student newStudent) {

        if (newStudent == null || contains(newStudent) || actualGroupSize >= students.length) {
            return false;
        }


        students[actualGroupSize++] = newStudent;
        return true;
    }

    private boolean contains(Student newStudent) {

        for (int i = 0; i < actualGroupSize; i++) {
            if (students[i].equals(newStudent)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || obj.getClass() != Group.class) {
            return false;
        }

        Group other = (Group) obj;

        // по логике программы,
        // если размер групп не совпадает --> они автоматически разные и не "равны"
        // если один и тот же студент появился в обеих проверяемых на равность группах --> они равны,
        // так как один и тот же студент не может числиться в нескольких группах

        if (actualGroupSize != other.actualGroupSize) {
            return false;
        }

        for (int i = 0; i < actualGroupSize; i++) {
            for (int j = 0; j < actualGroupSize; j++) {
               if (students[i].equals(other.students[j])) {
                   return true;
               }
            }
        }

        return false;
    }

}