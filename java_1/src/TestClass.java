class Add {
    int num1, num2;
    Add(int n1, int n2) {
        num1 = n1;
        num2 = n2;
    }

    void add() {
        System.out.println("값 : " + (num1 + num2));
    }
}

public class TestClass {
    public static  void  main(String[] args) {
        Add adder = new Add(4, 6);
        adder.add();
    }
}
