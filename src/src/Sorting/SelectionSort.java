package Sorting;

public class SelectionSort {
    private static void selectionsort(int[] arr){
        for (int i=0; i<arr.length-1; i++){
            int ary = i;
            for (int j=i+1; j<arr.length; j++){
                if (arr[j]<arr[ary]){
                    ary = j;
                }
            }
            int smallerNumber = arr[ary];
            arr[ary] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public static void main(String[] args) {
        int bilangan[] = {9, 3, 4, 1, 8, 10, 2, 6};
        System.out.println("Sebelum Dilakukan Sorting");
        for (int i = 0; i < bilangan.length; i++) {
            System.out.println(bilangan[i] + " ");
        }
        System.out.println();
        selectionsort(bilangan);
        System.out.println("Sesudah Dilakukan Sorting Secara Ascenden");
        for (int i = 0; i < bilangan.length; i++) {
            System.out.println(bilangan[i] + " ");
        }
    }
}
