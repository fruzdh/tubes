import SQL.SQLCek;
import SQL.SQLInsert;
import data.DataDummy;

import java.sql.*;

public class TuBes {
    public static void main(String[] args) {
        String serverName = "DESKTOP-14NOJVT";
        String databaseName = "TRANSPORTASI_PUBLIK_DB";
        String user = "tubesdong";
        String password = "pertubesanmania";
        String url = "jdbc:sqlserver://" + serverName + ";databaseName=" + databaseName;
        TuBes tuBes = new TuBes();

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            tuBes.prepare(connection);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void prepare(Connection connection) {
        SQLCek sqlCek = new SQLCek();
        SQLInsert sqlInsert = new SQLInsert();
        int kosong = sqlCek.KOTA(connection);
        if (kosong == 1) {
            for (int i=0; i<DataDummy.getListKota().size(); i++) {
                int row = sqlInsert.KOTA(connection, DataDummy.getListKota().get(i));
            }
        }
        kosong = sqlCek.FASILITAS(connection);
        if (kosong == 1) {
            for (int i=0; i<DataDummy.getListFasilitas().size(); i++) {
                int row = sqlInsert.FASILITAS(connection, DataDummy.getListFasilitas().get(i));
            }
        }
        kosong = sqlCek.FITUR(connection);
        if (kosong == 1) {

        }
        kosong = sqlCek.LAYANAN(connection);
        if (kosong == 1) {

        }
        kosong = sqlCek.PRODUSEN(connection);
        if (kosong == 1) {

        }
        kosong = sqlCek.CABANG_PRODUSEN(connection);
        if (kosong == 1) {

        }
        kosong = sqlCek.PEMILIK(connection);
        if (kosong == 1) {

        }
        kosong = sqlCek.ALAT_TRANSPORTASI(connection);
        if (kosong == 1) {

        }
        kosong = sqlCek.PESAWAT(connection);
        if (kosong == 1) {

        }
        kosong = sqlCek.HELIKOPTER(connection);
        if (kosong == 1) {

        }
        kosong = sqlCek.MOBIL_BUS(connection);
        if (kosong == 1) {

        }
        kosong = sqlCek.MOBIL_PENUMPANG(connection);
        if (kosong == 1) {

        }
        kosong = sqlCek.KERETA(connection);
        if (kosong == 1) {

        }
        kosong = sqlCek.KAPAL(connection);
        if (kosong == 1) {

        }
        kosong = sqlCek.TEMPAT_PEMBERHENTIAN(connection);
        if (kosong == 1) {

        }
        kosong = sqlCek.BANDARA(connection);
        if (kosong == 1) {

        }
        kosong = sqlCek.HELIPORT(connection);
        if (kosong == 1) {

        }
        kosong = sqlCek.TERMINAL(connection);
        if (kosong == 1) {

        }
        kosong = sqlCek.STASIUN(connection);
        if (kosong == 1) {

        }
        kosong = sqlCek.PELABUHAN(connection);
        if (kosong == 1) {

        }
        kosong = sqlCek.RUTE(connection);
        if (kosong == 1) {

        }
        kosong = sqlCek.TIKET(connection);
        if (kosong == 1) {

        }
        kosong = sqlCek.MEMILIKI_FITUR(connection);
        if (kosong == 1) {

        }
        kosong = sqlCek.MEMILIKI_RUTE(connection);
        if (kosong == 1) {

        }
        kosong = sqlCek.MEMILIKI_LAYANAN(connection);
        if (kosong == 1) {

        }
        kosong = sqlCek.MEMILIKI_FASILITAS(connection);
        if (kosong == 1) {

        }
    }
}
