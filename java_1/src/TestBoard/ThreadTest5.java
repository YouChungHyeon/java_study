package TestBoard;

class Num {
    private int num;
    Num(final int num) {
        this.num = num;
    }
    public void increadNum() {
        num++;
    }
    public int getNum() {
        return num;
    }
}

class Adder extends Thread {
    private Num num;
    private int loop;
    private String name;
    Adder(final Num num, final int loop, final String name) {
        this.num = num;
        this.loop = loop;
        this.name = name;
    }

    @Override
    public void run() {
        for(int i=0 ; i<loop;  i++) {
            num.increadNum();
        }
    }

    public void getResult() {
        System.out.println(name  + " : " + num.getNum());
    }

}
public class ThreadTest5 {
    public static void main(String[] args) {
        Num num = new Num(5);
        Adder adder1 = new Adder(num, 200, "adder1");
        Adder adder2 = new Adder(num, 200, "adder2");
        adder1.start();
        adder2.start();

        try{
            adder1.join();
            adder2.join();
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }finally {
            adder1.getResult();
            adder2.getResult();
        }
    }
}
