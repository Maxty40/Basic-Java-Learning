package prakpbo;

public class Belanja {
    public static void main(String[] args) {
        // Variable declaration
        String pelanggan = "Casmin";
        double totalBelanja = 150000;
        String keterangan;

        // If else statement
        if(totalBelanja > 100000)
        {
            keterangan = "Selamat Anda Mendapatkan Hadiah";
        } else {
            keterangan = "Terima Kasih";
        }

        // Display customer name
        System.out.println("Halo " + pelanggan + ", Kamu berbelanja total " + totalBelanja + ", " + keterangan); 
    }
}
