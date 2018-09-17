package TestBoard;

class CalcThread extends Thread {
    private int num1, num2, result;
    CalcThread (final int num1, final int num2) {
        this.num1 = num1;
        this.num2 = num2;
        result = 0;
    }

    @Override
    public void run() {
        result = num1 + num2;
    }

    public int getResult() {
        return result;
    }
}

public class ThreadTest4 {
    public static void main(String[] args) {
        CalcThread calcThread = new CalcThread(5, 7);
        calcThread.start();
        try {
            calcThread.join();
        }catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println(calcThread.getResult());

    }
}
