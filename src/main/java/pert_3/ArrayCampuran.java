package pert_3;

public class ArrayCampuran {
    public static void main(String[] args) {
        Object[][] data = {
            {"Zufar", 20, 78.0f},
            {"Afifi", 19, 65.8f},
            {"Ali", 18, 69.9f}
        };
        System.out.println(" Nama\tUmur\tBerat Badan");
        System.out.println("------------------------");

        for (int i = 0; i < data.length; i++ ) {
            String nama = (String) data[i][0];
            int umur = (int) data[i][1];
            float berat_badan = (float) data[i][2];
            System.out.println(nama + "\t" + umur + "\t" + berat_badan);
        }
    }
}
