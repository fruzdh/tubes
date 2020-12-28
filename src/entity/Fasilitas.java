package entity;

public class Fasilitas {
    private String Kode_Fasilitas;
    private String Nama;

    public Fasilitas(String kode_Fasilitas, String nama) {
        Kode_Fasilitas = kode_Fasilitas;
        Nama = nama;
    }

    public String getKode_Fasilitas() {
        return Kode_Fasilitas;
    }

    public void setKode_Fasilitas(String kode_Fasilitas) {
        Kode_Fasilitas = kode_Fasilitas;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }
}
