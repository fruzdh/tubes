package entity.alatransportasi;

public class Pesawat {
    private String Kode_Kendaraan;
    private int Ketinggian_Maksimal;
    private int Luas_Sayap;
    private int Sudut_Sayap;
    private int Tinggi_Ekor;
    private int Lebar_Kabin;
    private int Bentang_Sayap;

    public Pesawat(String kode_Kendaraan, int ketinggian_Maksimal, int luas_Sayap, int sudut_Sayap, int tinggi_Ekor, int lebar_Kabin, int bentang_Sayap) {
        Kode_Kendaraan = kode_Kendaraan;
        Ketinggian_Maksimal = ketinggian_Maksimal;
        Luas_Sayap = luas_Sayap;
        Sudut_Sayap = sudut_Sayap;
        Tinggi_Ekor = tinggi_Ekor;
        Lebar_Kabin = lebar_Kabin;
        Bentang_Sayap = bentang_Sayap;
    }

    public String getKode_Kendaraan() {
        return Kode_Kendaraan;
    }

    public void setKode_Kendaraan(String kode_Kendaraan) {
        Kode_Kendaraan = kode_Kendaraan;
    }

    public int getKetinggian_Maksimal() {
        return Ketinggian_Maksimal;
    }

    public void setKetinggian_Maksimal(int ketinggian_Maksimal) {
        Ketinggian_Maksimal = ketinggian_Maksimal;
    }

    public int getLuas_Sayap() {
        return Luas_Sayap;
    }

    public void setLuas_Sayap(int luas_Sayap) {
        Luas_Sayap = luas_Sayap;
    }

    public int getSudut_Sayap() {
        return Sudut_Sayap;
    }

    public void setSudut_Sayap(int sudut_Sayap) {
        Sudut_Sayap = sudut_Sayap;
    }

    public int getTinggi_Ekor() {
        return Tinggi_Ekor;
    }

    public void setTinggi_Ekor(int tinggi_Ekor) {
        Tinggi_Ekor = tinggi_Ekor;
    }

    public int getLebar_Kabin() {
        return Lebar_Kabin;
    }

    public void setLebar_Kabin(int lebar_Kabin) {
        Lebar_Kabin = lebar_Kabin;
    }

    public int getBentang_Sayap() {
        return Bentang_Sayap;
    }

    public void setBentang_Sayap(int bentang_Sayap) {
        Bentang_Sayap = bentang_Sayap;
    }
}
