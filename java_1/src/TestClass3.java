class Name {
    private String name;
    Name(String n){
        name = n;
    }
    void infoPrint(){
        System.out.println("이름 : " + name);
    }
}
class Phone {
    private String phone;
    Phone(String p){
        phone = p;
    }
    void infoPrint(){
        System.out.println("전화번호 : " + phone);
    }
}
class Salary {
    private int salary;
    Salary(int s){
        salary = s;
    }
    void infoPrint(){
        System.out.println("월급 : " + salary);
    }
}
class Interview{
    private Name name;
    private Phone phone;
    private Salary salary;
    Interview(String n, String p, int s) {
        name = new Name(n);
        phone = new Phone(p);
        salary = new Salary(s);
    }
    void infoPrint() {
        name.infoPrint();;
        phone.infoPrint();
        salary.infoPrint();
    }
}
class Employee {
    void Emp_info(Interview view) {
        view.infoPrint();
    }
}

public class TestClass3 {
    public static  void  main(String[] args) {
        Employee emp = new Employee();
        emp.Emp_info(new Interview("홍길동","010-1111-2222", 3000000));
    }
}
