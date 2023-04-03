package MyList;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedLists = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        linkedLists.add(1);
        linkedLists.add(2);
        linkedLists.add(3);
        linkedLists.add(4);
        linkedLists.add(1, 3);
        System.out.println(Integer.toBinaryString(1 << 4));
//
//        for (Integer linkedList : linkedLists) {
//            System.out.println("My LinkedList: " + linkedList);
//        }
//        linkedLists.add(2,5);
//
//        for (Integer linkedList : linkedLists) {
//            System.out.println("My LinkedList: " + linkedList);
//        }

        int[] numbers = {2,4,6,8};


        int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};
        OUTER_LOOP:
        for (int[] mySimpleArray : myComplexArray) {
            INNER_LOOP:
            for (int i = 0; i < mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i] + "\t");
            }
            System.out.println();
        }
    }
}

class mylist2 {

}
