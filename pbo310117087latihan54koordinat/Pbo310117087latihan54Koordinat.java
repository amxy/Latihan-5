package pbo310117087latihan54koordinat;

/**
 *
 * @author amxyfa
 * Nama : Ahmad Maula
 * NIM  : 10117087
 * Kelas: IF-3
 */
public class Pbo310117087latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WarnaKoordinat warnaKoordinat = new WarnaKoordinat(10,4,"Jingga");
        System.out.println("Warna Koordinat : "+warnaKoordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "+warnaKoordinat.getX()+", y : "+warnaKoordinat.getY());
    }
    
}
