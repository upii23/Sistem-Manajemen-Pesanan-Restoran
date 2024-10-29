//@inheritance dan polymorphism
public class Makanan extends Menu{
    public Makanan(String nama, int harga) {
        super(nama, harga);
    }

    @Override
    public void displayTipeMenu() {
        System.out.println("Tipe: Makanan");
    }
}
