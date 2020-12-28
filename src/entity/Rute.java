package entity;

public class Rute {
    private String Kode_Rute;
    private String Kode_Tempat_Pemberhentian_Asal;
    private String Kode_Tempat_Pemberhentian_Tujuan;
    private int Jarak;
    private String Waktu_Berangkat;
    private String Waktu_Tiba;
    private String Tanggal_Berangkat;
    private String Tanggal_Tiba;

    public Rute(String kode_Rute, String kode_Tempat_Pemberhentian_Asal, String kode_Tempat_Pemberhentian_Tujuan, int jarak, String waktu_Berangkat, String waktu_Tiba, String tanggal_Berangkat, String tanggal_Tiba) {
        Kode_Rute = kode_Rute;
        Kode_Tempat_Pemberhentian_Asal = kode_Tempat_Pemberhentian_Asal;
        Kode_Tempat_Pemberhentian_Tujuan = kode_Tempat_Pemberhentian_Tujuan;
        Jarak = jarak;
        Waktu_Berangkat = waktu_Berangkat;
        Waktu_Tiba = waktu_Tiba;
        Tanggal_Berangkat = tanggal_Berangkat;
        Tanggal_Tiba = tanggal_Tiba;
    }

    public String getKode_Rute() {
        return Kode_Rute;
    }

    public void setKode_Rute(String kode_Rute) {
        Kode_Rute = kode_Rute;
    }

    public String getKode_Tempat_Pemberhentian_Asal() {
        return Kode_Tempat_Pemberhentian_Asal;
    }

    public void setKode_Tempat_Pemberhentian_Asal(String kode_Tempat_Pemberhentian_Asal) {
        Kode_Tempat_Pemberhentian_Asal = kode_Tempat_Pemberhentian_Asal;
    }

    public String getKode_Tempat_Pemberhentian_Tujuan() {
        return Kode_Tempat_Pemberhentian_Tujuan;
    }

    public void setKode_Tempat_Pemberhentian_Tujuan(String kode_Tempat_Pemberhentian_Tujuan) {
        Kode_Tempat_Pemberhentian_Tujuan = kode_Tempat_Pemberhentian_Tujuan;
    }

    public int getJarak() {
        return Jarak;
    }

    public void setJarak(int jarak) {
        Jarak = jarak;
    }

    public String getWaktu_Berangkat() {
        return Waktu_Berangkat;
    }

    public void setWaktu_Berangkat(String waktu_Berangkat) {
        Waktu_Berangkat = waktu_Berangkat;
    }

    public String getWaktu_Tiba() {
        return Waktu_Tiba;
    }

    public void setWaktu_Tiba(String waktu_Tiba) {
        Waktu_Tiba = waktu_Tiba;
    }

    public String getTanggal_Berangkat() {
        return Tanggal_Berangkat;
    }

    public void setTanggal_Berangkat(String tanggal_Berangkat) {
        Tanggal_Berangkat = tanggal_Berangkat;
    }

    public String getTanggal_Tiba() {
        return Tanggal_Tiba;
    }

    public void setTanggal_Tiba(String tanggal_Tiba) {
        Tanggal_Tiba = tanggal_Tiba;
    }
}
