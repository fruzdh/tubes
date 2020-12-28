package entity.tempatpemberhentian;

public class Pelabuhan {
    private String Kode_Tempat_Pemberhentian;
    private int Jumlah_Dermaga;

    public Pelabuhan(String kode_Tempat_Pemberhentian, int jumlah_Dermaga) {
        Kode_Tempat_Pemberhentian = kode_Tempat_Pemberhentian;
        Jumlah_Dermaga = jumlah_Dermaga;
    }

    public String getKode_Tempat_Pemberhentian() {
        return Kode_Tempat_Pemberhentian;
    }

    public void setKode_Tempat_Pemberhentian(String kode_Tempat_Pemberhentian) {
        Kode_Tempat_Pemberhentian = kode_Tempat_Pemberhentian;
    }

    public int getJumlah_Dermaga() {
        return Jumlah_Dermaga;
    }

    public void setJumlah_Dermaga(int jumlah_Dermaga) {
        Jumlah_Dermaga = jumlah_Dermaga;
    }
}
