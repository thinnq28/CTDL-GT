package GT;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] a1 = {1,3,5,7,9};
        int[] a2 = {2,4,6,8,10};
        int[] a3 = {1,5,3,2,8,7,6,4};

        System.out.println(Arrays.toString(sortArray(a3)));
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

    private static void bubbleSort(int[] arrays){
        int size = arrays.length;
        for (int i = 0; i < size; i++) {
            boolean isSorted = true;
            for (int j = 0; j < size-i-1; j++) {
                if(arrays[j] > arrays[j+1]){
                    isSorted = false;
                    int t = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1] = t;
                }
            }
            printArray(i, arrays);
            if(isSorted) break;
        }
    }

    private static void insertionSort(int[] a){
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int ai = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > ai){
                a[j+1] = a[j];
                j--;
            }

            a[j+1] = ai;
            printArray(i, a);
        }
    }

    private static void selectionSort(int[] a){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if(a[j] < a[minIndex]){
                    minIndex = j;
                }
            }

            if(minIndex != i){
                int t = a[i];
                a[i] = a[minIndex];
                a[minIndex] = t;
            }

            printArray(i, a);
        }
    }

    public static void printArray(int no, int[] a){
        System.out.printf("%d: ", no);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.printf("\n");
    }
}
