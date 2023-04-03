package GT;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        int[] a = {9,4,2,6,5,1,7};
        selectSort(a);
    }

    public static void printArray(int no, int[] a){
        System.out.printf("%d: ", no);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.printf("\n");
    }

    private static void selectSort(int[] a){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if(a[j] < a[minIndex]){
                    minIndex = j;
                }
            }

            if(minIndex != i){
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }

            printArray(i, a);
        }
    }

    private static void insertionSort(int[] a){
        int n = a.length;
        for (int i = 1; i < n-1; i++) {
            int ai = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > ai){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = ai;
        }
    }

    private static void bubbleSort(int[] a){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            boolean isSored = true;
            for (int j = 0; j < n - i - 1; j++) {
                if(a[j] > a[j + 1]){
                    isSored = false;
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            printArray(i, a);
            if(isSored) break;
        }
    }
}


