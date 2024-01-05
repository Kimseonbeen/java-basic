package ref;

public class Method2 {

    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 90);
        System.out.println("student1 = " + student1);
        Student student2 = createStudent("학생1", 15, 90);
        System.out.println("student2 = " + student2);

        printStudent(student1);
        printStudent(student2);
    }

    /**
     * 객체를 생성하는 부분도 메서드안에 함께 포함
     * 그런데 메서드 안에서 객체를 생성했기 때문에 만들어진 객체를 메서드 밖에서 사용할 수 있게 돌려주어야한다.
     * 그래야 메서드 밖에서 이 객체를 사용 할 수 있기 때문에 호출 결과를 반환
     * @param name
     * @param age
     * @param grade
     * @return
     */
    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        System.out.println("student = " + student);
        student.name = name;
        student.age = age;
        student.grade = grade;

        return student;
    }



    /**
     * 전달한 학생 객체의 필드 값을 읽어서 출력한다.
     * @param student
     */
    static void printStudent(Student student) {
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }
}
