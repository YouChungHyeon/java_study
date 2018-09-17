package Generic;

public class GenericTest2 {
    public static <T> void printArray(T[] arr) {
        for(T i : arr) {
            System.out.println(i + " ");
        }
    }

    public static void main(String[] args) {
        final Integer[] arr = {1,2,3,4,5,6,7};
        printArray(arr);
    }
}
