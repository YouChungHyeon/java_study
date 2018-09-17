package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        /*isEmpty*/
        if(arrayList.isEmpty()) {
            System.out.println("arrayList_int 가 비어 있다.");
        }
        
        /*add*/
        arrayList.add(4);
        arrayList.add(19);
        arrayList.add(15);
        arrayList.add(21);
        System.out.println("add 호출 후 ");
        PrintArrayList(arrayList);

        /*contains*/
        final int var_contains = 19;
        if(arrayList.contains(var_contains)) {
            System.out.println("19를 가지고 있다");
        }

        /*get & set*/
        final int var_getIndex = 3;
        final int var_set = 81;
        if(arrayList.get(var_getIndex) != null) {
            System.out.println(var_getIndex + "번 위치에 " + arrayList.get(var_getIndex) + "이(가) 있다.");
            arrayList.set(var_getIndex, var_set);
            System.out.print("값 변경 후 ");
            PrintArrayList(arrayList);
        }

        /*remove*/
        final int var_removeIndex = 1;
        if(arrayList.get(var_removeIndex) != null) {
            System.out.print(var_removeIndex +"번 위치의 값 " + arrayList.remove(var_removeIndex) + "제거 후 ");
            PrintArrayList(arrayList);
        }
        /*addAll*/
        final List<Integer> arrayList_2 = Arrays.asList(11, 22, 33, 44, 55);
        // 위의 구문은 11, 22, 33, 44, 55 를 가진 리스트를 만들기 위한 것입니다.
        arrayList.addAll(arrayList_2);
        PrintArrayList_Iter(arrayList);

        /*clear*/
        System.out.println("arrayList_Int 비우기!!!");
        arrayList.clear();
        if(arrayList.isEmpty()) {
            System.out.println("arrayList가 비어있다 !!!!");
        }
    }

    private static <t extends Integer> void PrintArrayList(final ArrayList<t> arrayList) {
        /*size*/
        System.out.print("arrayList_int : ");
        for(int i=0; i<arrayList.size(); i++) {
            System.out.print(arrayList.get(i));
            if(i != arrayList.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static <t extends Integer> void PrintArrayList_Iter(final ArrayList<t> arrayList) {
        /*iterator*/
        Iterator<t> iter = arrayList.iterator();
        System.out.print("arrayList_int : ");
        while(true) {
            //iter.next() : iter가 가리키는 다음 값을 반환
            System.out.print(iter.next());
            if(iter.hasNext()) {
                //iter.hasNext() :
                System.out.print(", ");
            } else {
                break;
            }
        }
        System.out.println();
    }
}