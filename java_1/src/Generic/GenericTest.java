package Generic;

class  GenericClass<T> {
    private T value;
    GenericClass(final T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
}

public class GenericTest {
    public static void main(String[] args) {
        GenericClass<Integer> intClass = new GenericClass<>(5);
        GenericClass<Double> doubleClass = new GenericClass<>(3.2);
        System.out.println("intClass : " + intClass.getValue());
        System.out.println("doubleClass : " + doubleClass.getValue());
    }
}
