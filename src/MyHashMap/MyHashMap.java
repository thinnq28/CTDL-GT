package MyHashMap;

import java.util.HashMap;

public class MyHashMap {
    public static void main(String[] args) {
        //Create a HashMap with mutable key
        HashMap<Account, String> map = new HashMap<Account, String>();

        //Create key 1
        Account a1 = new Account(1);
        a1.setHolderName("A_ONE");
        //Create key 2
        Account a2 = new Account(2);
        a2.setHolderName("A_TWO");

        //Put mutable key and value in map
        map.put(a1, a1.getHolderName());
        map.put(a2, a2.getHolderName());

        //Change the keys state so hash map should be calculated again
        a1.setHolderName("Defaulter");
        a2.setHolderName("Bankrupt");

        //Success !! We are able to get back the values
        System.out.println(map.get(a1)); //Prints A_ONE
        System.out.println(map.get(a2)); //Prints A_TWO


        Account a3 = new Account(3);
        Account a6 = new Account(6);

        //n N là số lượng bucket mặc định cũng chính là kích thước mặc định của mảng trong HashMap
        final int n = 16;

        int indexa3 = a3.hashCode() & (n-1);
        int indexa6 = a6.hashCode() & (n-1);
        System.out.println(indexa3);
        System.out.println(indexa6);
    }
}
