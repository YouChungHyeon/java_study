package Array;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        final int INIT_MAX = 5;
        Stack<Integer> stack = new Stack<>();

        //empty
        if(stack.empty()){
            System.out.println("스택이 비어있음!");
        }

        //push
        for(int i = 0; i < INIT_MAX; i++) {
            stack.push(i + i);
        }
        printStack(stack, "스택");

        //search
        final int SEARCH_INDEX = 5;
        if(stack.search(SEARCH_INDEX) != -1) {
            System.out.println(SEARCH_INDEX + "위치의 값은 " + stack.search(SEARCH_INDEX) + "입니다.");
        }else {
            System.out.println(SEARCH_INDEX + "위치의 값은 없습니다. ");
        }

        //peak
        System.out.println("맨 위의 값 : " + stack.peek());

        //pop
        try {
            System.out.println("맨 위의 값 삭제 : " + stack.pop());
        }catch (EmptyStackException ese) {
            //pop 연산시 제거요소가 없으면 "EmptyStackException" 이 일어납니다.
            System.out.println("스택이 비어있음");
        }

    }

    public static <t> void printStack(Stack<t> stack, final String str) {
        System.out.println(str + " : ");
        for(int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();
    }
}
