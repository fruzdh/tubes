package entity.alatransportasi;

public class Kapal {
    private String Kode_Kendaraan;
    private int Jumlah_Geladak;

    public Kapal(String kode_Kendaraan, int jumlah_Geladak) {
        Kode_Kendaraan = kode_Kendaraan;
        Jumlah_Geladak = jumlah_Geladak;
    }

    public String getKode_Kendaraan() {
        return Kode_Kendaraan;
    }

    public void setKode_Kendaraan(String kode_Kendaraan) {
        Kode_Kendaraan = kode_Kendaraan;
    }

    public int getJumlah_Geladak() {
        return Jumlah_Geladak;
    }

    public void setJumlah_Geladak(int jumlah_Geladak) {
        Jumlah_Geladak = jumlah_Geladak;
    }
}
