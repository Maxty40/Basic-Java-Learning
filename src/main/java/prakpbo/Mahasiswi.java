package prakpbo;

public class Mahasiswi {
    public static class Mahasiswinf {
        // Member 1 
        // Variable/Attribute/Data
        public String nama;
        public int umur;
        public double nilai;

        // Member 2 - Constructor
        public Mahasiswinf(String nama, int umur, double nilai) {
            this.nama = nama;
            this.umur = umur;
            this.nilai = nilai;
        }

        // Method/Function
        public void tampilData() {
            System.out.println("Nama: " + nama);
            System.out.println("Umur: " + umur);
            System.out.println("Nilai: " + nilai);
        }
    }

    // Object
    public static void main(String[] args) {
        // Mahasiswi 1
        Mahasiswinf mhs1 = new Mahasiswinf("Zihan", 26, 99.9);
        mhs1.tampilData();

        // Mahasiswi 2
        Mahasiswinf mhs2 = new Mahasiswinf("Nabila", 21, 88.8);
        mhs2.tampilData();

        //   Mahasiswi 3
        Mahasiswinf mhs3 = new Mahasiswinf("Aulia", 20, 77.7);
        mhs3.tampilData();
    }
}
