package entity;

public class MemilikiFasilitas {
    private String Kode_Tempat_Pemberhentian;
    private String Kode_Kendaraan;
    private String Kode_Fasilitas;

    public MemilikiFasilitas(String kode_Tempat_Pemberhentian, String kode_Kendaraan, String kode_Fasilitas) {
        Kode_Tempat_Pemberhentian = kode_Tempat_Pemberhentian;
        Kode_Kendaraan = kode_Kendaraan;
        Kode_Fasilitas = kode_Fasilitas;
    }

    public String getKode_Tempat_Pemberhentian() {
        return Kode_Tempat_Pemberhentian;
    }

    public void setKode_Tempat_Pemberhentian(String kode_Tempat_Pemberhentian) {
        Kode_Tempat_Pemberhentian = kode_Tempat_Pemberhentian;
    }

    public String getKode_Kendaraan() {
        return Kode_Kendaraan;
    }

    public void setKode_Kendaraan(String kode_Kendaraan) {
        Kode_Kendaraan = kode_Kendaraan;
    }

    public String getKode_Fasilitas() {
        return Kode_Fasilitas;
    }

    public void setKode_Fasilitas(String kode_Fasilitas) {
        Kode_Fasilitas = kode_Fasilitas;
    }
}
