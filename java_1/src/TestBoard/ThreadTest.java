package TestBoard;

import static java.lang.Thread.sleep;

class Fruit implements Runnable {
    private String name;
    Fruit(final String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("저는 " + name + "쓰레드 입니다. ");
            try {
                Thread.sleep(150);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple");
        Fruit banana = new Fruit("Banana");
        Thread apple_thread = new Thread(apple);
        Thread banana_thread = new Thread(banana);
        apple_thread.start();
        banana_thread.start();
    }
}
