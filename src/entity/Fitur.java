package entity;

public class Fitur {
    private String Kode_Fitur;
    private String Nama;

    public Fitur(String kode_Fitur, String nama) {
        Kode_Fitur = kode_Fitur;
        Nama = nama;
    }

    public String getKode_Fitur() {
        return Kode_Fitur;
    }

    public void setKode_Fitur(String kode_Fitur) {
        Kode_Fitur = kode_Fitur;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }
}
