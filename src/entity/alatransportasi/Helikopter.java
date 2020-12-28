package entity.alatransportasi;

public class Helikopter {
    private String Kode_Kendaraan;
    private int Ketinggian_Maksimal;
    private int Diameter_Baling_Baling;

    public Helikopter(String kode_Kendaraan, int ketinggian_Maksimal, int diameter_Baling_Baling) {
        Kode_Kendaraan = kode_Kendaraan;
        Ketinggian_Maksimal = ketinggian_Maksimal;
        Diameter_Baling_Baling = diameter_Baling_Baling;
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

    public int getDiameter_Baling_Baling() {
        return Diameter_Baling_Baling;
    }

    public void setDiameter_Baling_Baling(int diameter_Baling_Baling) {
        Diameter_Baling_Baling = diameter_Baling_Baling;
    }
}
