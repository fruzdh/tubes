package entity.tempatpemberhentian;

public class Heliport {
    private String Kode_Tempat_Pemberhentian;
    private int Jumlah_Helipad;

    public Heliport(String kode_Tempat_Pemberhentian, int jumlah_Helipad) {
        Kode_Tempat_Pemberhentian = kode_Tempat_Pemberhentian;
        Jumlah_Helipad = jumlah_Helipad;
    }

    public String getKode_Tempat_Pemberhentian() {
        return Kode_Tempat_Pemberhentian;
    }

    public void setKode_Tempat_Pemberhentian(String kode_Tempat_Pemberhentian) {
        Kode_Tempat_Pemberhentian = kode_Tempat_Pemberhentian;
    }

    public int getJumlah_Helipad() {
        return Jumlah_Helipad;
    }

    public void setJumlah_Helipad(int jumlah_Helipad) {
        Jumlah_Helipad = jumlah_Helipad;
    }
}
