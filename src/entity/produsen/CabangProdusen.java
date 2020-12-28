package entity.produsen;

public class CabangProdusen {
    private String Kode_Cabang_Produsen;
    private String Kode_Produsen;
    private String Kode_Kota;
    private String Alamat_Cabang;
    private int Kapasitas_Produksi;

    public CabangProdusen(String kode_Cabang_Produsen, String kode_Produsen, String kode_Kota, String alamat_Cabang, int kapasitas_Produksi) {
        Kode_Cabang_Produsen = kode_Cabang_Produsen;
        Kode_Produsen = kode_Produsen;
        Kode_Kota = kode_Kota;
        Alamat_Cabang = alamat_Cabang;
        Kapasitas_Produksi = kapasitas_Produksi;
    }

    public String getKode_Cabang_Produsen() {
        return Kode_Cabang_Produsen;
    }

    public void setKode_Cabang_Produsen(String kode_Cabang_Produsen) {
        Kode_Cabang_Produsen = kode_Cabang_Produsen;
    }

    public String getKode_Produsen() {
        return Kode_Produsen;
    }

    public void setKode_Produsen(String kode_Produsen) {
        Kode_Produsen = kode_Produsen;
    }

    public String getKode_Kota() {
        return Kode_Kota;
    }

    public void setKode_Kota(String kode_Kota) {
        Kode_Kota = kode_Kota;
    }

    public String getAlamat_Cabang() {
        return Alamat_Cabang;
    }

    public void setAlamat_Cabang(String alamat_Cabang) {
        Alamat_Cabang = alamat_Cabang;
    }

    public int getKapasitas_Produksi() {
        return Kapasitas_Produksi;
    }

    public void setKapasitas_Produksi(int kapasitas_Produksi) {
        Kapasitas_Produksi = kapasitas_Produksi;
    }
}
