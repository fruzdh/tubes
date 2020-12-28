package entity;

public class MemilikiFitur {
    private String Kode_Kendaraan;
    private String Kode_Fitur;

    public MemilikiFitur(String kode_Kendaraan, String kode_Fitur) {
        Kode_Kendaraan = kode_Kendaraan;
        Kode_Fitur = kode_Fitur;
    }

    public String getKode_Kendaraan() {
        return Kode_Kendaraan;
    }

    public void setKode_Kendaraan(String kode_Kendaraan) {
        Kode_Kendaraan = kode_Kendaraan;
    }

    public String getKode_Fitur() {
        return Kode_Fitur;
    }

    public void setKode_Fitur(String kode_Fitur) {
        Kode_Fitur = kode_Fitur;
    }
}
