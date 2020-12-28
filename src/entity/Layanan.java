package entity;

public class Layanan {
    private String Kode_Layanan;
    private String Nama;

    public Layanan(String kode_Layanan, String nama) {
        Kode_Layanan = kode_Layanan;
        Nama = nama;
    }

    public String getKode_Layanan() {
        return Kode_Layanan;
    }

    public void setKode_Layanan(String kode_Layanan) {
        Kode_Layanan = kode_Layanan;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }
}
