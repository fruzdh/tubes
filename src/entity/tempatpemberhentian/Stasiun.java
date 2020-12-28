package entity.tempatpemberhentian;

public class Stasiun {
    private String Kode_Tempat_Pemberhentian;
    private int Jumlah_Jalur;
    private String Klasifikasi;
    private int Jumlah_Peron;

    public Stasiun(String kode_Tempat_Pemberhentian, int jumlah_Jalur, String klasifikasi, int jumlah_Peron) {
        Kode_Tempat_Pemberhentian = kode_Tempat_Pemberhentian;
        Jumlah_Jalur = jumlah_Jalur;
        Klasifikasi = klasifikasi;
        Jumlah_Peron = jumlah_Peron;
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

    public int getJumlah_Peron() {
        return Jumlah_Peron;
    }

    public void setJumlah_Peron(int jumlah_Peron) {
        Jumlah_Peron = jumlah_Peron;
    }
}
