class NationalNumber {
    void printNational() {
        System.out.println("자연수!!");
    }
}
class IntegerNumber extends NationalNumber {
    void printInteger() {
        System.out.println("정수!!");
    }
}
class RationalNumber extends IntegerNumber {
    void printRational() {
        System.out.println("유리수!!");
    }
}

public class Inherit3 {
    public static void main(String[] args) {
        NationalNumber national = new NationalNumber();
        IntegerNumber integer = new IntegerNumber();
        RationalNumber rational = new RationalNumber();

        instanceofCheck(national);
        instanceofCheck(integer);
        instanceofCheck(rational);
    }
    public static void instanceofCheck(NationalNumber nn) {
        if (nn instanceof RationalNumber) {
            ((RationalNumber) nn).printRational();
        } else if (nn instanceof IntegerNumber) {
            ((IntegerNumber) nn).printInteger();
        } else {
            nn.printNational();
        }
    }
}
