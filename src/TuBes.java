import SQL.SQLCek;
import SQL.SQLInsert;

import java.sql.*;

public class TuBes {
    public static void main(String[] args) {
        String serverName = "DESKTOP-14NOJVT";
        String databaseName = "TRANSPORTASI_PUBLIK_DB";
        String user = "tubesdong";
        String password = "pertubesanmania";
        String url = "jdbc:sqlserver://" + serverName + ";databaseName=" + databaseName;


        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void prepare(Connection connection) {
        SQLCek sqlCek = new SQLCek();
        int kosong = sqlCek.KOTA(connection);
        if (kosong == 1) {
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(SQLInsert.KOTA.toString());
                preparedStatement.setString(1, "KT--1");
                preparedStatement.setString(2, "-1");
                preparedStatement.setInt(3, -1);
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                System.out.println("Terjadi error saat insert ke tabel KOTA");
            }
        }
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQLCek.KOTA.toString());
            if (resultSet.next()) {
                if (resultSet.getInt("IsEmpty") == 1) {

                }
            }
            resultSet = statement.executeQuery(SQLCek.PRODUSEN.toString());
            if (resultSet.next()) {
                if (resultSet.getInt("IsEmpty") == 1) {
                    PreparedStatement preparedStatement = connection.prepareStatement(SQLInsert.PRODUSEN.toString());
                    preparedStatement.setString(1, "PRDSN--1");
                    preparedStatement.setString(2, "KT--1");
                    preparedStatement.setString(3, "-1");
                    preparedStatement.setString(4, "-1");
                    preparedStatement.setString(5, "-1");
                    preparedStatement.setString(6, "-1");
                    preparedStatement.setString(7, "-1");
                    preparedStatement.setInt(8, -1);
                    preparedStatement.executeUpdate();
                }
            }
            resultSet = statement.executeQuery(SQLCek.FASILITAS.toString());
            if (resultSet.next()) {
                if (resultSet.getInt("IsEmpty") == 1) {
                    PreparedStatement preparedStatement = connection.prepareStatement(SQLInsert.FASILITAS.toString());
                    preparedStatement.setString(1, "FSLTS--1");
                    preparedStatement.setString(2, "-1");
                    preparedStatement.executeUpdate();
                }
            }
            resultSet = statement.executeQuery(SQLCek.FITUR.toString());
            if (resultSet.next()) {
                if (resultSet.getInt("IsEmpty") == 1) {
                    PreparedStatement preparedStatement = connection.prepareStatement(SQLInsert.FITUR.toString());
                    preparedStatement.setString(1, "FTR--1");
                    preparedStatement.setString(2, "-1");
                    preparedStatement.executeUpdate();
                }
            }
            resultSet = statement.executeQuery(SQLCek.LAYANAN.toString());
            if (resultSet.next()) {
                if (resultSet.getInt("IsEmpty") == 1) {
                    PreparedStatement preparedStatement = connection.prepareStatement(SQLInsert.LAYANAN.toString());
                    preparedStatement.setString(1, "LYNN--1");
                    preparedStatement.setString(2, "-1");
                    preparedStatement.executeUpdate();
                }
            }
            resultSet = statement.executeQuery(SQLCek.PEMILIK_INDIVIDU.toString());
            if (resultSet.next()) {
                if (resultSet.getInt("IsEmpty") == 1) {
                    PreparedStatement preparedStatement = connection.prepareStatement(SQLInsert.PEMILIK_INDIVIDU.toString());
                    preparedStatement.setString(1, "PMLK_NDVD--1");
                    preparedStatement.setString(2, "KT--1");
                    preparedStatement.setString(3, "-1");
                    preparedStatement.setString(4, "-1");
                    preparedStatement.setString(5, "-1");
                    preparedStatement.setString(6, "-1");
                    preparedStatement.setInt(7, -1);
                    preparedStatement.setString(8, "-1");
                    preparedStatement.setString(9, "-1");
                    preparedStatement.executeUpdate();
                }
            }
            resultSet = statement.executeQuery(SQLCek.PEMILIK_INSTANSI.toString());
            if (resultSet.next()) {
                if (resultSet.getInt("IsEmpty") == 1) {
                    PreparedStatement preparedStatement = connection.prepareStatement(SQLInsert.PEMILIK_INSTANSI.toString());
                    preparedStatement.setString(1, "PMLK_NSTNS--1");
                    preparedStatement.setString(2, "KT--1");
                    preparedStatement.setString(3, "-1");
                    preparedStatement.setString(4, "-1");
                    preparedStatement.setString(5, "-1");
                    preparedStatement.setString(6, "-1");
                    preparedStatement.setString(7, "-1");
                    preparedStatement.setInt(8, 1);
                    preparedStatement.executeUpdate();
                }
            }
            resultSet = statement.executeQuery(SQLCek.PESAWAT.toString());
            if (resultSet.next()) {
                if (resultSet.getInt("IsEmpty") == 1) {
                    PreparedStatement preparedStatement = connection.prepareStatement(SQLInsert.PESAWAT.toString());
                    preparedStatement.setString(1, "KNDRN_PSWT--1");
                    preparedStatement.setString(2, "PRDSN--1");
                    preparedStatement.setString(3, "PMLK_NSTNS--1");
                    preparedStatement.setString(4, "-1");
                    preparedStatement.setInt(5, -1);
                    preparedStatement.setInt(6, -1);
                    preparedStatement.setString(7, "-1");
                    preparedStatement.setString(8, "-1");
                    preparedStatement.setString(9, "-1");
                    preparedStatement.setInt(10, -1);
                    preparedStatement.setInt(11, -1);
                    preparedStatement.setString(12, "-1");
                    preparedStatement.setInt(13, -1);
                    preparedStatement.setInt(14, -1);
                    preparedStatement.setInt(15, -1);
                    preparedStatement.setInt(16, -1);
                    preparedStatement.setInt(17, -1);
                    preparedStatement.setInt(18, -1);
                    preparedStatement.setInt(19, -1);
                    preparedStatement.setInt(20, -1);
                    preparedStatement.executeUpdate();
                }
            }
            resultSet = statement.executeQuery(SQLCek.HELIKOPTER.toString());
            if (resultSet.next()) {
                if (resultSet.getInt("IsEmpty") == 1) {
                    PreparedStatement preparedStatement = connection.prepareStatement(SQLInsert.HELIKOPTER.toString());
                    preparedStatement.setString(1, "KNDRN_HLKPTR--1");
                    preparedStatement.setString(2, "PRDSN--1");
                    preparedStatement.setString(3, "PMLK_NSTNS--1");
                    preparedStatement.setString(4, "-1");
                    preparedStatement.setInt(5, -1);
                    preparedStatement.setInt(6, -1);
                    preparedStatement.setString(7, "-1");
                    preparedStatement.setString(8, "-1");
                    preparedStatement.setString(9, "-1");
                    preparedStatement.setInt(10, -1);
                    preparedStatement.setInt(11, -1);
                    preparedStatement.setString(12, "-1");
                    preparedStatement.setInt(13, -1);
                    preparedStatement.setInt(14, -1);
                    preparedStatement.setInt(15, -1);
                    preparedStatement.setInt(16, -1);
                    preparedStatement.executeUpdate();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
