package pbo310117087latihan56umurbarangantik;

/**
 *
 * @author amxyfa
 * Nama : Ahmad Maula
 * NIM  : 10117087
 * Kelas: IF-3
 */
   public class Radio extends BarangAntik {
   private String nama;

    public Radio(int umur) {
        super(umur);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
