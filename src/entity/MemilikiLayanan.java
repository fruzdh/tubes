package entity;

public class MemilikiLayanan {
    private String Kode_Tempat_Pemberhentian;
    private String Kode_Layanan;

    public MemilikiLayanan(String kode_Tempat_Pemberhentian, String kode_Layanan) {
        Kode_Tempat_Pemberhentian = kode_Tempat_Pemberhentian;
        Kode_Layanan = kode_Layanan;
    }

    public String getKode_Tempat_Pemberhentian() {
        return Kode_Tempat_Pemberhentian;
    }

    public void setKode_Tempat_Pemberhentian(String kode_Tempat_Pemberhentian) {
        Kode_Tempat_Pemberhentian = kode_Tempat_Pemberhentian;
    }

    public String getKode_Layanan() {
        return Kode_Layanan;
    }

    public void setKode_Layanan(String kode_Layanan) {
        Kode_Layanan = kode_Layanan;
    }
}
