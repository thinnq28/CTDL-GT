package MyList;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>();
        int sum = 0;
        for (Integer integer : ar) {
            sum += integer;
        }

        System.out.println(sum);
    }
}
