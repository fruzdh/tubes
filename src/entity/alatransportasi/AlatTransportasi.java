package entity.alatransportasi;

public class AlatTransportasi {
    private String Kode_Kendaraan;
    private String Kode_Produsen;
    private String Kode_Pemilik;
    private String Nama;
    private int Kecepatan_Maksimum;
    private int Kapasitas_Muatan;
    private String Tahun_Pengadaan;
    private String Jenis_Mesin;
    private String Hotline;
    private int Kapasitas_tangki;
    private int Berat_kendaraan;
    private String Jenis_Bahan_Bakar;
    private int Kapasitas_Penumpang;
    private int Panjang;
    private String Tahun_Mulai_Dimiliki;

    public AlatTransportasi(String kode_Kendaraan, String kode_Produsen, String kode_Pemilik, String nama, int kecepatan_Maksimum, int kapasitas_Muatan, String tahun_Pengadaan, String jenis_Mesin, String hotline, int kapasitas_tangki, int berat_kendaraan, String jenis_Bahan_Bakar, int kapasitas_Penumpang, int panjang, String tahun_Mulai_Dimiliki) {
        Kode_Kendaraan = kode_Kendaraan;
        Kode_Produsen = kode_Produsen;
        Kode_Pemilik = kode_Pemilik;
        Nama = nama;
        Kecepatan_Maksimum = kecepatan_Maksimum;
        Kapasitas_Muatan = kapasitas_Muatan;
        Tahun_Pengadaan = tahun_Pengadaan;
        Jenis_Mesin = jenis_Mesin;
        Hotline = hotline;
        Kapasitas_tangki = kapasitas_tangki;
        Berat_kendaraan = berat_kendaraan;
        Jenis_Bahan_Bakar = jenis_Bahan_Bakar;
        Kapasitas_Penumpang = kapasitas_Penumpang;
        Panjang = panjang;
        Tahun_Mulai_Dimiliki = tahun_Mulai_Dimiliki;
    }

    public String getKode_Kendaraan() {
        return Kode_Kendaraan;
    }

    public void setKode_Kendaraan(String kode_Kendaraan) {
        Kode_Kendaraan = kode_Kendaraan;
    }

    public String getKode_Produsen() {
        return Kode_Produsen;
    }

    public void setKode_Produsen(String kode_Produsen) {
        Kode_Produsen = kode_Produsen;
    }

    public String getKode_Pemilik() {
        return Kode_Pemilik;
    }

    public void setKode_Pemilik(String kode_Pemilik) {
        Kode_Pemilik = kode_Pemilik;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public int getKecepatan_Maksimum() {
        return Kecepatan_Maksimum;
    }

    public void setKecepatan_Maksimum(int kecepatan_Maksimum) {
        Kecepatan_Maksimum = kecepatan_Maksimum;
    }

    public int getKapasitas_Muatan() {
        return Kapasitas_Muatan;
    }

    public void setKapasitas_Muatan(int kapasitas_Muatan) {
        Kapasitas_Muatan = kapasitas_Muatan;
    }

    public String getTahun_Pengadaan() {
        return Tahun_Pengadaan;
    }

    public void setTahun_Pengadaan(String tahun_Pengadaan) {
        Tahun_Pengadaan = tahun_Pengadaan;
    }

    public String getJenis_Mesin() {
        return Jenis_Mesin;
    }

    public void setJenis_Mesin(String jenis_Mesin) {
        Jenis_Mesin = jenis_Mesin;
    }

    public String getHotline() {
        return Hotline;
    }

    public void setHotline(String hotline) {
        Hotline = hotline;
    }

    public int getKapasitas_tangki() {
        return Kapasitas_tangki;
    }

    public void setKapasitas_tangki(int kapasitas_tangki) {
        Kapasitas_tangki = kapasitas_tangki;
    }

    public int getBerat_kendaraan() {
        return Berat_kendaraan;
    }

    public void setBerat_kendaraan(int berat_kendaraan) {
        Berat_kendaraan = berat_kendaraan;
    }

    public String getJenis_Bahan_Bakar() {
        return Jenis_Bahan_Bakar;
    }

    public void setJenis_Bahan_Bakar(String jenis_Bahan_Bakar) {
        Jenis_Bahan_Bakar = jenis_Bahan_Bakar;
    }

    public int getKapasitas_Penumpang() {
        return Kapasitas_Penumpang;
    }

    public void setKapasitas_Penumpang(int kapasitas_Penumpang) {
        Kapasitas_Penumpang = kapasitas_Penumpang;
    }

    public int getPanjang() {
        return Panjang;
    }

    public void setPanjang(int panjang) {
        Panjang = panjang;
    }

    public String getTahun_Mulai_Dimiliki() {
        return Tahun_Mulai_Dimiliki;
    }

    public void setTahun_Mulai_Dimiliki(String tahun_Mulai_Dimiliki) {
        Tahun_Mulai_Dimiliki = tahun_Mulai_Dimiliki;
    }
}
