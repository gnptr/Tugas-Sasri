package searching;


public class SequentialSearch {
    private final int[] angka = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    private void tampilkanData(){
        for (int data : angka) {
            System.out.print(data + " ");
        }
        System.out.println();
    }

    private void searching(int karakter){
        int x = 0;
        boolean ketemu = false;
        for (int i = x; i < angka.length; i++) {
            if(karakter==(angka[i])){
                ketemu = true;
                x = i;
            }
        }
        if(ketemu){
            System.out.println("Angka " + karakter + " terdapat pada array index ke-" + (x));
        } else {
            System.out.println("Angka " + karakter + " tidak terdapat pada array");
        }
    }

    public static void main(String[] args) {
        SequentialSearch obj = new SequentialSearch();
        obj.tampilkanData();
        obj.searching(8);
    }
}