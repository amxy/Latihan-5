package pbo310117087latihan53rabbit;

/**
 *
 * @author amxyfa
 * Nama : Ahmad Maula
 * NIM  : 10117087
 * Kelas: IF-3
 */
public class Rabbit extends Animal {
    private String color,name;

    public String getColor() {
        return color;
    }
    
    public String getName() {
        return name;
    }
    
    public Rabbit (String name,boolean veg,String food,int legs,String color){
    super (veg,food,legs);
        this.name = name;
        this.vegetarian = veg;
        this.eats = food;
        this.noOfLegs = legs;
        this.color = color;
    }
    
    
}
