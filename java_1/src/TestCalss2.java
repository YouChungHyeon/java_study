class GirlFriend {
    private int money;
    GirlFriend(int m) {
        money = m;
    }
    void pay(int value) {
        if(money >= value) {
            money -= value;
            System.out.println("여자친구가 돈을 냈습니다. ");
        } else {
            System.out.println("돈이 부족합니다. ");
        }
    }
    void addMoney(int m){
        money += m;
    }
    int getMoney() {
        return money;
    }
}

class BoyFriend {
    private  int money;
    BoyFriend(int m) {
        money = m;
    }
    void pay(int value) {
        if(money >= value) {
            money -= value;
            System.out.println("남자친구가 돈을 냈습니다. ");
        } else {
            System.out.println("돈이 부족합니다. ");
        }
    }
    void addMoney(int m){
        money += m;
    }
    int getMoney() {
        return money;
    }
}

public class TestCalss2 {
    public  static  void main(String[] args) {
        GirlFriend girl = new GirlFriend(5000);
        BoyFriend boy = new BoyFriend(10000);
        int FoodValue = 4000;
        if(girl.getMoney() > boy.getMoney()) {
            girl.pay(FoodValue);
        } else {
            boy.pay(FoodValue);
        }
    }
}
