public abstract class Menu {
    //Encapsulation
    private String Nama;
    private int Harga;

    //Constructor
    public Menu(String nama, int harga) {
        Nama = nama;
        Harga = harga;
    }

    //Getter
    public String getNama() {
        return Nama;
    }

    //Setter
    public void setNama(String nama) {
        Nama = nama;
    }

    //Getter
    public int getHarga() {
        return Harga;
    }

    //Setter
    public void setHarga(int harga) {
        Harga = harga;
    }
    public abstract void displayTipeMenu();
}
