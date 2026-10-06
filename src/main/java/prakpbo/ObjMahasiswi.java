package prakpbo;

public class ObjMahasiswi {
    public static void main(String[] args) {
        // Object
        Mahasiswi mhs1 = new Mahasiswi("Zihan", 26, 99.9, 123456, "Jl. Mawar No. 1");
        mhs1.tampilData();

        Mahasiswi mhs2 = new Mahasiswi("Nabila", 21, 88.8, 123457, "Jl. Melati No. 2");
        mhs2.tampilData();

        Mahasiswi mhs3 = new Mahasiswi("Aulia", 20, 77.7, 123458, "Jl. Anggrek No. 3");
        mhs3.tampilData();

        // Accessing protected and private members
        System.out.println(mhs1.nama);
        System.out.println(mhs1.umur);
        System.out.println(mhs1.getNilai());
    }
}
