package prakpbo;

public class Mahasiswi {
        // Member 1 
        // Variable/Attribute/Data
        
        // Public: Only accessible within the same package or from other packages through inheritance.
        // Protected: Accessible within the same package and subclasses (even if they are in different packages).
        // Private: Accessible only within the same class.

        public String nama;
        protected int umur;
        private double nilai;
        public int nim;
        public String alamat;

        // Member 2 - Constructor
        public Mahasiswi(String nama, int umur, double nilai, int nim, String alamat) {
            this.nama = nama;
            this.umur = umur;
            this.nilai = nilai;
            this.nim = nim;
            this.alamat = alamat;
        }

        // Method/Function
        public void tampilData() {
            System.out.println("-------------------------");
            System.out.println("Nama: " + nama);
            System.out.println("Umur: " + umur);
            System.out.println("Nilai: " + nilai);
            System.out.println("NIM: " + nim);
            System.out.println("Alamat: " + alamat);
            System.out.println("-------------------------");
        }

        // Getter for private member 'nilai'
        public double getNilai() {
            return nilai;
        }
}
