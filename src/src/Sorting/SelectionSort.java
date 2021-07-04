package Sorting;

public class SelectionSort {
    private static void selectionsort(int[] bilangan){
        for (int i=0; i< bilangan.length-1; i++){
            int pos = i;
            for (int j=i+1; j< bilangan.length; j++){
                if (bilangan[j]<bilangan[pos]){
                    pos= j;
                }
            }
            int smallerNumber = bilangan[pos];
            bilangan[pos] = bilangan[i];
            bilangan[i] = smallerNumber;
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
