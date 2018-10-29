package pbo310117087latihan52siapakamu;

/**
 *
 * @author amxyfa
 * Nama : Ahmad Maula
 * NIM  : 10117087
 * Kelas: IF-3
 */
public class Pbo310117087latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen dsn = new Dosen();
        dsn.setNip("41227829930");
        dsn.setNama("Rizki Adam Kurniawan");
        dsn.setUmur(27);
        dsn.setMataKuliah("PBO");

        System.out.println("NIP DOSEN : "+dsn.getNip());
        dsn.siapaKamu();
        dsn.mengajarApa();

        Mahasiswa mhs = new Mahasiswa();
        mhs.setNim("10117087");
        mhs.setNama("Ahmad Maula");
        mhs.setUmur(20);
        mhs.setKelas("PBO3");

        System.out.println("\nNIP MAHASISWA : "+mhs.getNim());
        mhs.siapaKamu();
        mhs.kelasApa();
    }
    
}
