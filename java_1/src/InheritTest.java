class Human {
    private int age;
    private  String name;
    Human(int _age, String _name) {
        age = _age;
        name = _name;
    }
    void HumanInfo() {
        System.out.println("[정보출력]");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }
}

class Student extends Human {
    private String subject;
    private int number;
    Student(int _age, String _name, String _subject, int _number) {
        super(_age, _name);
        subject = _subject;
        number = _number;
    }
    void StudentInfo(){
        HumanInfo();
        System.out.println("학번 : " + number);
        System.out.println("학과 : " + subject);
    }
}

public class InheritTest {
    public static void main(String[] args) {
        Student st1 = new Student(23, "홍길동", "컴퓨터공학", 20130000);
        Human hu1 = new Human(5, "아기");
        st1.StudentInfo();
        hu1.HumanInfo();
    }
}
