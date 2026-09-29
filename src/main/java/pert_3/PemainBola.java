package pert_3;

public class PemainBola {
    public static void main(String[] args) {
        String[][] Pemain = {
            {"Ronaldo", "Arab"},
            {"Haaland", "Norway"},
            {"Messi", "Argentina"},
            {"Mbappe", "Prancis"},
            {"Madun", "Indonesia"}
        };
        System.out.println("Daftar Pemain Bola Dunia:");
        for (int i = 0; i < Pemain.length; i++) {
            System.out.println(Pemain[i][0] + "\t: " + Pemain[i][1]); 
        }
    }
}
