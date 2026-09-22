package prakpbo;

public class Nilai {
    public static void main(String[] args) {
        float nilai = 90.0f;

        // Ternary
        String keterangan = (nilai >= 60) ? "Lulus" : "Gagal";

        char grade;

        // Multi conditional if
        if (nilai >= 85 && nilai <= 100) {
            grade = 'A';
        } else if (nilai >= 75 && nilai < 85) {
            grade = 'B';
        } else if (nilai >= 60 && nilai < 75) {
            grade = 'C';
        } else if (nilai >= 30 && nilai < 60) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        // Switch case
        String predikat;

        switch (grade) {
            case 'A':
                predikat = "Memuaskan";
                break;
            case 'B' :
                predikat = "Baik";
                break;
            case 'C' :
                predikat = "Cukup";
                break;
            case 'D' :
                predikat = "Kurang";
                break;
            case 'E' :
                predikat = "Sangat Kurang";
                break;
            default:
                predikat = "";
        }

        System.out.println(nilai + " " + keterangan + " " + grade + " " + predikat);
    }
}
