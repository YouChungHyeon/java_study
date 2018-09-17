class ClassInstance {
    private static int num = 0;
    ClassInstance() {
        num++;
        System.out.println("인스턴스가 생성되었습니다. ");
    }
    void  printNum() {
        System.out.println("static int num = " + num);
    }
    void numAdd(int add) {
        num += add;
    }
}

public class ClassVariable {
    public static void main(String[] args){
        ClassInstance var1 = new ClassInstance();
        ClassInstance var2 = new ClassInstance();
        ClassInstance var3 = new ClassInstance();
        System.out.println("값 수정 전....");
        var1.printNum();
        var2.printNum();
        var3.printNum();

        var3.numAdd(5);

        System.out.println("값 수정 후....");
        var1.printNum();
        var2.printNum();
        var3.printNum();
    }
}
