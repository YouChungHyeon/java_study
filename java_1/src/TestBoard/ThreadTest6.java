package TestBoard;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class Info {
    String name;
    int value;

    // toString을 오버라이드를 했는데 해당 클래스를 출력하면 toString에 있는 내용이 기본적으로 출력
    @Override
    public String toString() {
        return (name + "(" + value + ")");
    }
}

class Goods {
    Info info;
    private boolean isUploaded;
    //lock 을 위한 ReentrantLock
    private final ReentrantLock locker = new ReentrantLock();
    //lock의 상태를 조정할 Condition
    private final Condition lockerCondition = locker.newCondition();

    Goods() {
        info = new Info();
    }

    public void setInfo(final String name, final int value) {
        info.name = name;
        info.value = value;
        isUploaded = true;

        locker.lock();
        try {
            lockerCondition.signalAll();
        }finally {
            locker.unlock();
        }
    }

    public Info getInfo() {
        if (isUploaded == false) {
            locker.lock();
            try {
                lockerCondition.await();
            } catch (Exception ie) {
                ie.printStackTrace();
            }finally {
                locker.unlock();
            }
        }
        return info;
    }
}

class HomepageManager extends Thread {
    private Goods goods;
    private String name;
    private int value;

    HomepageManager(final Goods goods, final String name, final int value) {
        this.goods = goods;
        this.name = name;
        this.value = value;
    }

    @Override
    public void run() {
        goods.setInfo(name, value);
    }
}

class CustomerViewer extends Thread {
    private Goods goods;
    private String id;

    CustomerViewer(final Goods goods, final String id) {
        this.goods = goods;
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println(id + "가 보고있는 쇼핑몰 물품 내용 : " + goods.getInfo());
    }
}

public class ThreadTest6 {
    public static void main(String[] args) {
        Goods goods = new Goods();
        HomepageManager homepageManager = new HomepageManager(goods, "태블릿", 100000);
        CustomerViewer customerViewer1 = new CustomerViewer(goods, "채숨실");
        CustomerViewer customerViewer2 = new CustomerViewer(goods, "이세상바꾼애");

        customerViewer1.start();
        customerViewer2.start();
        homepageManager.start();

        try {
            customerViewer1.join();
            customerViewer2.join();
            homepageManager.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
