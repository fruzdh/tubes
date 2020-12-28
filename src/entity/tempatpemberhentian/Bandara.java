package entity.tempatpemberhentian;

public class Bandara {
    private String Kode_Tempat_Pemberhentian;
    private String Klasifikasi_Bandara;
    private int Jumlah_Landasan;
    private int Jumlah_Gate;
    private int Jumlah_Terminal;
    private int Jenis_Bandara;

    public Bandara(String kode_Tempat_Pemberhentian, String klasifikasi_Bandara, int jumlah_Landasan, int jumlah_Gate, int jumlah_Terminal, int jenis_Bandara) {
        Kode_Tempat_Pemberhentian = kode_Tempat_Pemberhentian;
        Klasifikasi_Bandara = klasifikasi_Bandara;
        Jumlah_Landasan = jumlah_Landasan;
        Jumlah_Gate = jumlah_Gate;
        Jumlah_Terminal = jumlah_Terminal;
        Jenis_Bandara = jenis_Bandara;
    }

    public String getKode_Tempat_Pemberhentian() {
        return Kode_Tempat_Pemberhentian;
    }

    public void setKode_Tempat_Pemberhentian(String kode_Tempat_Pemberhentian) {
        Kode_Tempat_Pemberhentian = kode_Tempat_Pemberhentian;
    }

    public String getKlasifikasi_Bandara() {
        return Klasifikasi_Bandara;
    }

    public void setKlasifikasi_Bandara(String klasifikasi_Bandara) {
        Klasifikasi_Bandara = klasifikasi_Bandara;
    }

    public int getJumlah_Landasan() {
        return Jumlah_Landasan;
    }

    public void setJumlah_Landasan(int jumlah_Landasan) {
        Jumlah_Landasan = jumlah_Landasan;
    }

    public int getJumlah_Gate() {
        return Jumlah_Gate;
    }

    public void setJumlah_Gate(int jumlah_Gate) {
        Jumlah_Gate = jumlah_Gate;
    }

    public int getJumlah_Terminal() {
        return Jumlah_Terminal;
    }

    public void setJumlah_Terminal(int jumlah_Terminal) {
        Jumlah_Terminal = jumlah_Terminal;
    }

    public int getJenis_Bandara() {
        return Jenis_Bandara;
    }

    public void setJenis_Bandara(int jenis_Bandara) {
        Jenis_Bandara = jenis_Bandara;
    }
}
