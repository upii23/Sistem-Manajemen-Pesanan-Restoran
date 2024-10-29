//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Menu> menuList = new ArrayList<>();
        List<Pemesanan> orderList = new ArrayList<>();

        menuList.add(new Makanan("Nasi ayam Paprika", 20000));
        menuList.add(new Minuman("Mie Ayam Bakso", 25000));
        menuList.add(new Makanan("Soda Gembira", 10000));
        menuList.add(new Minuman("Es Jeruk", 7000));

        while (true) {
            System.out.println("1. Tambah Pesanan");
            System.out.println("2. Tampilkan Semua Pesanan");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi: ");
            int pil = scanner.nextInt();
            scanner.nextLine();

            switch (pil) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String Nama = scanner.nextLine();
                    System.out.print("Masukkan kontak pelanggan: ");
                    String no_Telp = scanner.nextLine();
                    Pelanggan pelanggan = new Pelanggan(Nama, no_Telp);

                    System.out.println("Pilih tipe pesanan (1. Dine-In, 2. Take-Away): ");
                    int PemesananTipepilihan = scanner.nextInt();
                    PemesananTipe pemesananTipe = (PemesananTipepilihan == 1) ? PemesananTipe.Dine_in : PemesananTipe.Take_away;

                    Pemesanan newPemesanan = new Pemesanan(pelanggan, pemesananTipe);

                    System.out.println("Pilih item menu (0 untuk selesai): ");
                    for (int i = 0; i < menuList.size(); i++) {
                        System.out.println((i + 1) + ". " + menuList.get(i).getNama() + " - Rp" + menuList.get(i).getHarga());
                    }
                    int menuChoice;
                    do {
                        System.out.print("Pilih nomor menu: ");
                        menuChoice = scanner.nextInt();
                        if (menuChoice > 0 && menuChoice <= menuList.size()) {
                            newPemesanan.addMenuItem(menuList.get(menuChoice - 1));
                        }
                    } while (menuChoice != 0);

                    orderList.add(newPemesanan);
                    System.out.println("Pesanan berhasil ditambahkan!\n");
                    break;

                case 2:
                    if (orderList.isEmpty()) {
                        System.out.println("Tidak ada pesanan.");
                    } else {
                        for (Pemesanan pemesanan : orderList) {
                            Pemesanan.displayOrderDetails();
                            System.out.println("-----------------------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opsi tidak valid.");
            }
        }
    }
}