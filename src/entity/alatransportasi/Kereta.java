package entity.alatransportasi;

public class Kereta {
    private String Kode_Kendaraan;
    private int Jumlah_Roda;
    private String Plat_Nomor;
    private int Jumlah_Lokomotif;
    private int Jumlah_Gerbong;

    public Kereta(String kode_Kendaraan, int jumlah_Roda, String plat_Nomor, int jumlah_Lokomotif, int jumlah_Gerbong) {
        Kode_Kendaraan = kode_Kendaraan;
        Jumlah_Roda = jumlah_Roda;
        Plat_Nomor = plat_Nomor;
        Jumlah_Lokomotif = jumlah_Lokomotif;
        Jumlah_Gerbong = jumlah_Gerbong;
    }

    public String getKode_Kendaraan() {
        return Kode_Kendaraan;
    }

    public void setKode_Kendaraan(String kode_Kendaraan) {
        Kode_Kendaraan = kode_Kendaraan;
    }

    public int getJumlah_Roda() {
        return Jumlah_Roda;
    }

    public void setJumlah_Roda(int jumlah_Roda) {
        Jumlah_Roda = jumlah_Roda;
    }

    public String getPlat_Nomor() {
        return Plat_Nomor;
    }

    public void setPlat_Nomor(String plat_Nomor) {
        Plat_Nomor = plat_Nomor;
    }

    public int getJumlah_Lokomotif() {
        return Jumlah_Lokomotif;
    }

    public void setJumlah_Lokomotif(int jumlah_Lokomotif) {
        Jumlah_Lokomotif = jumlah_Lokomotif;
    }

    public int getJumlah_Gerbong() {
        return Jumlah_Gerbong;
    }

    public void setJumlah_Gerbong(int jumlah_Gerbong) {
        Jumlah_Gerbong = jumlah_Gerbong;
    }
}
