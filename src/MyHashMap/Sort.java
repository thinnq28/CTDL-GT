package MyHashMap;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        printArray(sortArray(a));
    }

    private static int[] sortArray(int[] a){
        return mergeSort(a, 0, a.length - 1);
    }

    private static int[] merge(int[] a1, int[] a2){
        // tron vao: a1 va a2 la cac mang da duoc sap xep
        int n = a1.length + a2.length;
        int[] result = new int[n];

        int i = 0, i1 = 0, i2 = 0;
        while (i < n){
            if(i1 < a1.length && i2 < a2.length ){ //a1 & a2 != rong
                if(a1[i1] <= a2[i2]){ //a1 nho hon
                    result[i] = a1[i1];
                    i++; i1++;
                }else{ //a2 nho hon
                    result[i] = a2[i2];
                    i++; i2++;
                }
            }else{//a1 rong hoac a2 rong
                if(i1 < a1.length){//a1 ok
                    result[i] = a1[i1];
                    i++; i1++;
                }else{//a2 ok
                    result[i] = a2[i2];
                    i++; i2++;
                }
            }
        }
        return result;
    }

    private static int[] mergeSort(int[] a, int L, int R){
        //dieu kien dung | truong hop dac biet
        if(L > R) return new int[0];
        if(L == R) {
            int[] singleElement = {a[L]};
            return singleElement;
        }
        // truong hop tong quat

        // chia ra
        System.out.println("chia: " + L + " - " + R);
        int k = (L + R)/2;
        int[] a1 = mergeSort(a, L, k);
        int[] a2 = mergeSort(a, k + 1, R);

        int[] result = merge(a1, a2);
        System.out.println("Ket qua merge: " + Arrays.toString(result));
        return result;
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
    }
}
