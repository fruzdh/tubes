package entity.alatransportasi;

public class MobilBus {
    private String Kode_Kendaraan;
    private int Jumlah_Roda;
    private String Plat_Nomor;
    private String Karoseri;
    private int Manual_Atau_Matik;

    public MobilBus(String kode_Kendaraan, int jumlah_Roda, String plat_Nomor, String karoseri, int manual_Atau_Matik) {
        Kode_Kendaraan = kode_Kendaraan;
        Jumlah_Roda = jumlah_Roda;
        Plat_Nomor = plat_Nomor;
        Karoseri = karoseri;
        Manual_Atau_Matik = manual_Atau_Matik;
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

    public String getKaroseri() {
        return Karoseri;
    }

    public void setKaroseri(String karoseri) {
        Karoseri = karoseri;
    }

    public int getManual_Atau_Matik() {
        return Manual_Atau_Matik;
    }

    public void setManual_Atau_Matik(int manual_Atau_Matik) {
        Manual_Atau_Matik = manual_Atau_Matik;
    }
}
