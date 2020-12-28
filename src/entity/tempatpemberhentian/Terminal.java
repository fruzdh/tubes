package entity.tempatpemberhentian;

public class Terminal {
    private String Kode_Tempat_Pemberhentian;
    private int Jumlah_Jalur;
    private String Klasifikasi;

    public Terminal(String kode_Tempat_Pemberhentian, int jumlah_Jalur, String klasifikasi) {
        Kode_Tempat_Pemberhentian = kode_Tempat_Pemberhentian;
        Jumlah_Jalur = jumlah_Jalur;
        Klasifikasi = klasifikasi;
    }

    public String getKode_Tempat_Pemberhentian() {
        return Kode_Tempat_Pemberhentian;
    }

    public void setKode_Tempat_Pemberhentian(String kode_Tempat_Pemberhentian) {
        Kode_Tempat_Pemberhentian = kode_Tempat_Pemberhentian;
    }

    public int getJumlah_Jalur() {
        return Jumlah_Jalur;
    }

    public void setJumlah_Jalur(int jumlah_Jalur) {
        Jumlah_Jalur = jumlah_Jalur;
    }

    public String getKlasifikasi() {
        return Klasifikasi;
    }

    public void setKlasifikasi(String klasifikasi) {
        Klasifikasi = klasifikasi;
    }
}
