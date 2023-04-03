package MyHashMap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class oca {
    private static final ArrayList<String> values = new ArrayList<>();

    public static void main(String[] args) {
        List<Integer> list = List.of(3,7,4,1);
        list = list.stream().sorted().collect(Collectors.toList());
        System.out.println(list.get(0));;
    }


}
