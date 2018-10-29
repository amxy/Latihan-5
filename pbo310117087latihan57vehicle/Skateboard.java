package pbo310117087latihan57vehicle;

/**
 *
 * @author amxyfa
 * Nama : Ahmad Maula
 * NIM  : 10117087
 * Kelas: IF-3
 */
public class Skateboard extends Vehicle{
    private double myBoardLength;

    public Skateboard() {
        this.myBoardLength = 0;
        setMyBrand("Ally Skate");
        setMyModel("Rocket");
        setMyBoardLength(54.5);

        System.out.println("\nSkateboard");
        System.out.println("Brand  : "+getMyBrand());
        System.out.println("Model  : "+getMyModel());
        System.out.println("Panjangnya Board: "+getMyBoardLength());
    }

    public double getMyBoardLength() {
        return myBoardLength;
    }

    public void setMyBoardLength(double myBoardLength) {
        this.myBoardLength = myBoardLength;
    }
}
