package searching;

public class BinarySearch {
    private final int[] angka = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    private void tampikanData(){
        for (int data : angka){
            System.out.println(data + " ");
        }
        System.out.println();
    }

    public String searching(int karakter){
        int bawah = 0;
        int atas = angka.length - 1;

        while (atas >= bawah){
            int tengah = (bawah + atas)/2;
            if (karakter <angka[tengah]){
                atas = tengah -1;
            } else if (karakter==angka[tengah]){
                return  "Angka " + karakter + " terdapat pada array index ke-" + (tengah);
            } else{
                bawah = tengah +1;
            }
        }
        return "Angka " + karakter + " tidak terdapat pada array";
    }

    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
        obj.tampikanData();
        System.out.println(obj.searching(8));
    }
}
