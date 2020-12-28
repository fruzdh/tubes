package entity;

public class Kota {
    private String Kode_Kota;
    private String Nama;
    private int Luas_Wilayah;

    public Kota(String kode_Kota, String nama, int luas_Wilayah) {
        Kode_Kota = kode_Kota;
        Nama = nama;
        Luas_Wilayah = luas_Wilayah;
    }

    public String getKode_Kota() {
        return Kode_Kota;
    }

    public void setKode_Kota(String kode_Kota) {
        Kode_Kota = kode_Kota;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public int getLuas_Wilayah() {
        return Luas_Wilayah;
    }

    public void setLuas_Wilayah(int luas_Wilayah) {
        Luas_Wilayah = luas_Wilayah;
    }
}
