//@inheritance dan polymorphism
public class Minuman extends Menu{
    public Minuman(String nama, int harga) {
        super(nama, harga);
    }
    @Override
    public void displayTipeMenu(){
        System.out.println("Tipe: Minuman");
    }
}
