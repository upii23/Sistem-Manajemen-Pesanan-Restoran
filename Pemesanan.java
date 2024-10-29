import java.util.ArrayList;
import java.util.List;

public class Pemesanan {
    //Encapsulation
    private static Pelanggan pelanggan;
    private static PemesananTipe Pemesanantipe;
    private static List<Menu> menuItem;
    private static boolean isCompleted;

    public Pemesanan(Pelanggan pelanggan, PemesananTipe pemesananTipe) {
        this.pelanggan = pelanggan;
        Pemesanantipe = pemesananTipe;
        this.menuItem = new ArrayList<>();
        this.isCompleted = false;
    }

    //Getter
    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    //Setter
    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    //Getter
    public PemesananTipe getPemesanantipe() {
        return Pemesanantipe;
    }

    //Setter
    public void setPemesanantipe(PemesananTipe pemesanantipe) {
        Pemesanantipe = pemesanantipe;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public void addMenuItem(Menu menu) {
        menuItem.add(menu);
    }
    public static int calculateTotalHarga() {
        int total = 0;
        for (Menu menu : menuItem) {
            total += menu.getHarga();
        }
        return total;
    }

    //Overloading
    public static void displayOrderDetails() {
        System.out.println("Pelanggan: " + pelanggan.getNama());
        System.out.println("Kontak: " + pelanggan.getNo_Telp());
        System.out.println("Tipe Order: " + (Pemesanantipe == PemesananTipe.Dine_in ? "Dine-In" : "Take-Away"));
        System.out.println("Menu Item:");
        for (Menu menu : menuItem) {
            System.out.println("- " + menu.getNama() + " : Rp" + menu.getHarga());
            menu.displayTipeMenu();
        }
        System.out.println("Total Harga: Rp" + calculateTotalHarga());
        System.out.println("Status: " + (isCompleted ? "Completed" : "In Progress"));
    }

}
