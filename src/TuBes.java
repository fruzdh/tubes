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
            System.out.println("Connected to SQL Server");
            tuBes.prepare(connection);
            System.out.println("tes");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void prepare(Connection connection) {
        SQLCek sqlCek = new SQLCek();
        SQLInsert sqlInsert = new SQLInsert();
        if (sqlCek.KOTA(connection) == 1 && sqlCek.FASILITAS(connection) == 1 && sqlCek.FITUR(connection) == 1 &&
                sqlCek.LAYANAN(connection) == 1 && sqlCek.PRODUSEN(connection) == 1 && sqlCek.CABANG_PRODUSEN(connection) == 1 &&
                sqlCek.PEMILIK(connection) == 1 && sqlCek.ALAT_TRANSPORTASI(connection) == 1 && sqlCek.PESAWAT(connection) == 1 &&
                sqlCek.HELIKOPTER(connection) == 1 && sqlCek.MOBIL_BUS(connection) == 1 && sqlCek.MOBIL_PENUMPANG(connection) == 1 &&
                sqlCek.KERETA(connection) == 1 && sqlCek.KAPAL(connection) == 1 && sqlCek.TEMPAT_PEMBERHENTIAN(connection) == 1 &&
                sqlCek.BANDARA(connection) == 1 && sqlCek.HELIPORT(connection) == 1 && sqlCek.TERMINAL(connection) == 1 &&
                sqlCek.STASIUN(connection) == 1 && sqlCek.PELABUHAN(connection) == 1 && sqlCek.RUTE(connection) == 1 &&
                sqlCek.TIKET(connection) == 1 && sqlCek.MEMILIKI_FITUR(connection) == 1 && sqlCek.MEMILIKI_RUTE(connection) == 1 &&
                sqlCek.MEMILIKI_LAYANAN(connection) == 1 && sqlCek.MEMILIKI_FASILITAS(connection) == 1) {
            for (int i=0; i<DataDummy.getListKota().size(); i++) {
                int row = sqlInsert.KOTA(connection, DataDummy.getListKota().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListFasilitas().size(); i++) {
                int row = sqlInsert.FASILITAS(connection, DataDummy.getListFasilitas().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListFitur().size(); i++) {
                int row = sqlInsert.FITUR(connection, DataDummy.getListFitur().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListLayanan().size(); i++) {
                int row = sqlInsert.LAYANAN(connection, DataDummy.getListLayanan().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListProdusen().size(); i++) {
                int row = sqlInsert.PRODUSEN(connection, DataDummy.getListProdusen().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListCabangProdusen().size(); i++) {
                int row = sqlInsert.CABANG_PRODUSEN(connection, DataDummy.getListCabangProdusen().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListPemilik().size(); i++) {
                int row = sqlInsert.PEMILIK(connection, DataDummy.getListPemilik().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListAlatTransportasi().size(); i++) {
                int row = sqlInsert.ALAT_TRANSPORTASI(connection, DataDummy.getListAlatTransportasi().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListPesawat().size(); i++) {
                int row = sqlInsert.PESAWAT(connection, DataDummy.getListPesawat().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListHelikopter().size(); i++) {
                int row = sqlInsert.HELIKOPTER(connection, DataDummy.getListHelikopter().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListMobilBus().size(); i++) {
                int row = sqlInsert.MOBIL_BUS(connection, DataDummy.getListMobilBus().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListMobilPenumpang().size(); i++) {
                int row = sqlInsert.MOBIL_PENUMPANG(connection, DataDummy.getListMobilPenumpang().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListKereta().size(); i++) {
                int row = sqlInsert.KERETA(connection, DataDummy.getListKereta().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListKapal().size(); i++) {
                int row = sqlInsert.KAPAL(connection, DataDummy.getListKapal().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListTempatPemberhentian().size(); i++) {
                int row = sqlInsert.TEMPAT_PEMBERHENTIAN(connection, DataDummy.getListTempatPemberhentian().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListBandara().size(); i++) {
                int row = sqlInsert.BANDARA(connection, DataDummy.getListBandara().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListHeliport().size(); i++) {
                int row = sqlInsert.HELIPORT(connection, DataDummy.getListHeliport().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListTerminal().size(); i++) {
                int row = sqlInsert.TERMINAL(connection, DataDummy.getListTerminal().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListStasiun().size(); i++) {
                int row = sqlInsert.STASIUN(connection, DataDummy.getListStasiun().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListPelabuhan().size(); i++) {
                int row = sqlInsert.PELABUHAN(connection, DataDummy.getListPelabuhan().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListRute().size(); i++) {
                int row = sqlInsert.RUTE(connection, DataDummy.getListRute().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListTiket().size(); i++) {
                int row = sqlInsert.TIKET(connection, DataDummy.getListTiket().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListMemilikiFitur().size(); i++) {
                int row = sqlInsert.MEMILIKI_FITUR(connection, DataDummy.getListMemilikiFitur().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListMemilikiRute().size(); i++) {
                int row = sqlInsert.MEMILIKI_RUTE(connection, DataDummy.getListMemilikiRute().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListMemilikiLayanan().size(); i++) {
                int row = sqlInsert.MEMILIKI_LAYANAN(connection, DataDummy.getListMemilikiLayanan().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListMemilikiFasilitas().size(); i++) {
                int row = sqlInsert.MEMILIKI_FASILITAS(connection, DataDummy.getListMemilikiFasilitas().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
        }
    }
}
