package TestBoard;

class ThreadPriority extends Thread {
    private String name;
    ThreadPriority(final String name, final int priority) {
        this.name = name;
        setPriority(priority);
    }

    @Override
    public void run() {
        for(int i = 0; i < 3; i++) {
            System.out.println(name + " 쓰레드 우선순위 : " + getPriority());
        }
    }
}
public class ThreadTest3 {
    public static void main(String[] args) {
        ThreadPriority tp1 = new ThreadPriority("tp1", 10);
        ThreadPriority tp2 = new ThreadPriority("tp2", 5);
        ThreadPriority tp3 = new ThreadPriority("tp3", 1);

        tp1.start();
        tp2.start();
        tp3.start();
    }
}
