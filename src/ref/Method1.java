package ref;

public class Method1 {

    public static void main(String[] args) {
        Student student1 = new Student();   //x001
        initStudent(student1, "학생1", 15, 90);

        Student student2 = new Student();   //x002
        initStudent(student2, "학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);
    }

    /**
     * 전달한 학생 객체의 필드에 값을 설정한다.
     * @param student
     * @param name
     * @param age
     * @param grade
     */
    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    /**
     * 전달한 학생 객체의 필드 값을 읽어서 출력한다.
     * @param student
     */
    static void printStudent(Student student) {
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }
}
