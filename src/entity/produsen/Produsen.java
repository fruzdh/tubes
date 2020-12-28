package entity.produsen;

public class Produsen {
    private String Kode_Produsen;
    private String Kode_Kota;
    private String Nama;
    private String Alamat_Pusat;
    private String Email;
    private String Nomor_Telepon;
    private String Website;
    private int Kapasitas_Produksi;
    private int Jumlah_Karyawan;

    public Produsen(String kode_Produsen, String kode_Kota, String nama, String alamat_Pusat, String email, String nomor_Telepon, String website, int kapasitas_Produksi, int jumlah_Karyawan) {
        Kode_Produsen = kode_Produsen;
        Kode_Kota = kode_Kota;
        Nama = nama;
        Alamat_Pusat = alamat_Pusat;
        Email = email;
        Nomor_Telepon = nomor_Telepon;
        Website = website;
        Kapasitas_Produksi = kapasitas_Produksi;
        Jumlah_Karyawan = jumlah_Karyawan;
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

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getAlamat_Pusat() {
        return Alamat_Pusat;
    }

    public void setAlamat_Pusat(String alamat_Pusat) {
        Alamat_Pusat = alamat_Pusat;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getNomor_Telepon() {
        return Nomor_Telepon;
    }

    public void setNomor_Telepon(String nomor_Telepon) {
        Nomor_Telepon = nomor_Telepon;
    }

    public String getWebsite() {
        return Website;
    }

    public void setWebsite(String website) {
        Website = website;
    }

    public int getKapasitas_Produksi() {
        return Kapasitas_Produksi;
    }

    public void setKapasitas_Produksi(int kapasitas_Produksi) {
        Kapasitas_Produksi = kapasitas_Produksi;
    }

    public int getJumlah_Karyawan() {
        return Jumlah_Karyawan;
    }

    public void setJumlah_Karyawan(int jumlah_Karyawan) {
        Jumlah_Karyawan = jumlah_Karyawan;
    }
}
