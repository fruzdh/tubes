package entity;

public class MemilikiRute {
    private String Kode_Kendaraan;
    private String Kode_Rute;

    public MemilikiRute(String kode_Kendaraan, String kode_Rute) {
        Kode_Kendaraan = kode_Kendaraan;
        Kode_Rute = kode_Rute;
    }

    public String getKode_Kendaraan() {
        return Kode_Kendaraan;
    }

    public void setKode_Kendaraan(String kode_Kendaraan) {
        Kode_Kendaraan = kode_Kendaraan;
    }

    public String getKode_Rute() {
        return Kode_Rute;
    }

    public void setKode_Rute(String kode_Rute) {
        Kode_Rute = kode_Rute;
    }
}
