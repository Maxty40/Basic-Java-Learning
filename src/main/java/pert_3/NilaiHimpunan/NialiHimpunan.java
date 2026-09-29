package pert_3.NilaiHimpunan;

public class NialiHimpunan {
    public static void main(String[] args) {
        int[] Nilai = {70, 80, 87, 76, 90, 100};

        System.out.println("Jumlah elemen: " + Nilai.length);
        for (int i = 0; i < Nilai.length; i++) {
            System.out.println("Nilai ke-" + (i+1) + ": " + Nilai[i]);
        }

        int total =0;
        for (int n : Nilai) {
            total =+ n;
        }
        double rata = (double) total / Nilai.length;

        System.out.println("Rata - rata: " + rata);
    }
}
