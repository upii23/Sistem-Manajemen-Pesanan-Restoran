public class Pelanggan {
    //@Encapsulation
    private String Nama;
    private String No_Telp;

    //Constructor
    public Pelanggan(String nama, String no_Telp) {
        Nama = nama;
        No_Telp = no_Telp;
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
    public String getNo_Telp() {
        return No_Telp;
    }

    //Setter
    public void setNo_Telp(String no_Telp) {
        No_Telp = no_Telp;
    }
}
