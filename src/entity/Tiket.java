package entity;

public class Tiket {
    private String Kode_Tiket;
    private String Kode_Rute;
    private int Harga;
    private String Kelas;
    private String Posisi_Duduk;
    private int Telah_Terbeli;

    public Tiket(String kode_Tiket, String kode_Rute, int harga, String kelas, String posisi_Duduk, int telah_Terbeli) {
        Kode_Tiket = kode_Tiket;
        Kode_Rute = kode_Rute;
        Harga = harga;
        Kelas = kelas;
        Posisi_Duduk = posisi_Duduk;
        Telah_Terbeli = telah_Terbeli;
    }

    public String getKode_Tiket() {
        return Kode_Tiket;
    }

    public void setKode_Tiket(String kode_Tiket) {
        Kode_Tiket = kode_Tiket;
    }

    public String getKode_Rute() {
        return Kode_Rute;
    }

    public void setKode_Rute(String kode_Rute) {
        Kode_Rute = kode_Rute;
    }

    public int getHarga() {
        return Harga;
    }

    public void setHarga(int harga) {
        Harga = harga;
    }

    public String getKelas() {
        return Kelas;
    }

    public void setKelas(String kelas) {
        Kelas = kelas;
    }

    public String getPosisi_Duduk() {
        return Posisi_Duduk;
    }

    public void setPosisi_Duduk(String posisi_Duduk) {
        Posisi_Duduk = posisi_Duduk;
    }

    public int getTelah_Terbeli() {
        return Telah_Terbeli;
    }

    public void setTelah_Terbeli(int telah_Terbeli) {
        Telah_Terbeli = telah_Terbeli;
    }
}
