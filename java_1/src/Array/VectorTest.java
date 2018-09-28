package Array;

import java.util.*;

public class VectorTest {
    public static void main(String[] args) {
        final int INIT_SIZE =3;
        Vector<Integer> vector = new Vector<>();

        //isEmpty
        if(vector.isEmpty()) {
            System.out.println("벡터가 비어있다!!!!");
        }

        //add
        for(int i = 0; i < INIT_SIZE; i++) {
            vector.add(INIT_SIZE * i + 2);
        }
        printUseIterator(vector, "값 추가 후 벡터");
        vector.add(1, 81);
        printUseIterator(vector, "1번 위치에 81 추가 후 벡터");

        //contains
        final int CONTAINS_VALUE = 5;
        if(vector.contains(CONTAINS_VALUE)) {
            System.out.println("벡터에 " + CONTAINS_VALUE +"가 포함되어 있다!!!!");
        }

        //get() & set()
        final int GET_INDEX1 = 6;
        final int GET_INDEX2 = 3;
        final int SET_INDEX1 = 8080;
        final int SET_INDEX2 = 80;
        try {
            System.out.println(GET_INDEX1 + "번 위치의 값 : " + vector.get(GET_INDEX1));
            vector.set(GET_INDEX1, SET_INDEX1);
            System.out.println("값 변경 후 " + GET_INDEX1 +"번 위치의 값 : " + vector.get(GET_INDEX1));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(GET_INDEX1 + "번 위치의 값이 없다");
        }

        try {
            System.out.println(GET_INDEX2 + "번 위치의 값 : " + vector.get(GET_INDEX2));
            vector.set(GET_INDEX2, SET_INDEX2);
            System.out.println("값 변경 후 " + GET_INDEX2 +"번 위치의 값 : " + vector.get(GET_INDEX2));
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(GET_INDEX2 + " 번 위치의 값이 없다");
        }

        //remove
        final int REMOVE_INDEX = 3;
        try {
            vector.remove(REMOVE_INDEX);
            printUseFor(vector, REMOVE_INDEX + "번 위치의 값 제거 후 벡터");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(REMOVE_INDEX + "번 위치에는 값이 없다.");
        }

        //addAll
        final List<Integer> list = Arrays.asList(1,2,3,4);
        vector.addAll(list);
        printUseListIterator(vector, "새로운 배열 추가 후 벡터");

        //clear
        System.out.println("벡터 초기화!!!");
        vector.clear();
        if(vector.isEmpty()) {
            System.out.println("벡터가 비어있다!!!!");
        }
    }

    //Iterator
    public static <T> void printUseIterator(final Vector<T> vector, final String str) {
        Iterator<T> iterator = vector.iterator();
        System.out.print(str + " : ");
        while(true) {
            System.out.print(iterator.next());
            if(iterator.hasNext()) {
                System.out.print(", ");
            }else {
                break;
            }
        }
        System.out.println();
    }

    //ListIterator
    public static <T> void printUseListIterator(final Vector<T> vector, final String str) {
        ListIterator<T> listIterator = vector.listIterator();
        System.out.print(str + " : ");
        while(true) {
            System.out.print(listIterator.next());
            if(listIterator.hasNext()){
                System.out.print(", ");
            }else {
                break;
            }
        }
        System.out.println();
    }

    public static <T> void printUseFor(final Vector<T> vector, final String str) {
        System.out.print(str + " : ");
        //size
        for(int i = 0; i < vector.size(); i++) {
            System.out.print(vector.get(i));
            if(i != vector.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
