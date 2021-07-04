package searching;

public class BinarySearch {
    private final int[] angka = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    private void tampikanData(){
        for (int i : angka){
            System.out.println(i + " ");
        }
        System.out.println();
    }
    public String pencarianangka(int key){
        int bawah = 0;
        int atas = angka.length - 1;

        while (atas >= bawah){
            int tengah = (bawah + atas)/2;
            if (key <angka[tengah]){
                atas = tengah -1;
            } else if (key==angka[tengah]){
                return  "Angka " + key + " terdapat pada array index ke-" + (tengah);
            } else{
                bawah = tengah +1;
            }
        }
        return "Angka " + key + " tidak terdapat pada array";
    }

    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
        obj.tampikanData();
        System.out.println(obj.pencarianangka(8));
    }
}
