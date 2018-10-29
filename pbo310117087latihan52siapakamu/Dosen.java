package pbo310117087latihan52siapakamu;

/**
 *
 * @author amxyfa
 * Nama : Ahmad Maula
 * NIM  : 10117087
 * Kelas: IF-3
 */
public class Dosen extends Manusia {
private String nip,mataKuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public void mengajarApa() {
        System.out.println("Saya "+nama+" umur "+umur+" tahun sedang mengajar matakuliah "+mataKuliah);
    }
    public void siapaKamu() {
        System.out.println("Saya Dosen");
    }
}
