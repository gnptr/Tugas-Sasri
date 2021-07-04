package Sorting;

public class BubbleSort {
    private static void bubblesort(int[] arr){
        int ary = arr.length;
        int temp = 0;
        for (int i=0; i<ary; i++){
            for (int j=1; j<(ary-i); j++){
                if (arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int bilangan[] = {9, 3, 4, 1, 8, 10, 2, 6};
        System.out.println("Sebelum Dilakukan Sorting");
        for (int i = 0; i < bilangan.length; i++) {
            System.out.println(bilangan[i] + " ");
        }
        System.out.println();
        bubblesort(bilangan);
        System.out.println("Sesudah Dilakukan Sorting Secara Ascenden");
        for (int i = 0; i < bilangan.length; i++) {
            System.out.println(bilangan[i] + " ");
        }
    }
}
