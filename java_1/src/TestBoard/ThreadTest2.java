package TestBoard;

class Human {
    private String name;
    private int age;
    Human(final String name, final int age) {
        this.name = name;
        this.age = age;
    }
    String getName() {
        return name;
    }
    int getAge() {
        return age;
    }
}
class Student extends Human implements Runnable {

    private String subject;
    Student(final String name, final int age, final String subject) {
        super(name, age);
        this.subject = subject;
    }
    @Override
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println("제이름은 " + getName());
            System.out.println("제나이는 " + getAge());
            System.out.println("제전공은 " + subject);
            System.out.println();

            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadTest2 {
    public static void main(String[] args){
        Student huni = new Student("훈이", 20, "컴공");
        Student mini = new Student("미니", 21, "정통");
        Thread huni_thread = new Thread(huni);
        Thread mini_thread = new Thread(mini);
        huni_thread.start();
        mini_thread.start();
    }
}
