package entity;

public class Pemilik {
    private String Kode_Pemilik;
    private String Kode_Kota;
    private String Nama;
    private String Alamat;
    private String Email;
    private String Nomor_Telepon;
    private String Website;

    public Pemilik(String kode_Pemilik, String kode_Kota, String nama, String alamat, String email, String nomor_Telepon, String website) {
        Kode_Pemilik = kode_Pemilik;
        Kode_Kota = kode_Kota;
        Nama = nama;
        Alamat = alamat;
        Email = email;
        Nomor_Telepon = nomor_Telepon;
        Website = website;
    }

    public String getKode_Pemilik() {
        return Kode_Pemilik;
    }

    public void setKode_Pemilik(String kode_Pemilik) {
        Kode_Pemilik = kode_Pemilik;
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

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
        Alamat = alamat;
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
}
