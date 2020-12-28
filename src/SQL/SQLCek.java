package SQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLCek {
    public int KOTA(Connection connection) {
        int hasil = 0;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT CASE WHEN EXISTS(SELECT 1 FROM KOTA) THEN 0 ELSE 1 END AS IsEmpty;");
            if (resultSet.next()) {
                hasil = resultSet.getInt("IsEmpty");
            }
        } catch (SQLException e) {
            System.out.println("Terjadi error saat cek apakah tabel KOTA kosong atau tidak");
        }
        return hasil;
    }
    public int FASILITAS(Connection connection) {
        int hasil = 0;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT CASE WHEN EXISTS(SELECT 1 FROM FASILITAS) THEN 0 ELSE 1 END AS IsEmpty;");
            if (resultSet.next()) {
                hasil = resultSet.getInt("IsEmpty");
            }
        } catch (SQLException e) {
            System.out.println("Terjadi error saat cek apakah tabel FASILITAS kosong atau tidak");
        }
        return hasil;
    }
    public int FITUR(Connection connection) {
        int hasil = 0;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT CASE WHEN EXISTS(SELECT 1 FROM FITUR) THEN 0 ELSE 1 END AS IsEmpty;");
            if (resultSet.next()) {
                hasil = resultSet.getInt("IsEmpty");
            }
        } catch (SQLException e) {
            System.out.println("Terjadi error saat cek apakah tabel FITUR kosong atau tidak");
        }
        return hasil;
    }
    public int LAYANAN(Connection connection) {
        int hasil = 0;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT CASE WHEN EXISTS(SELECT 1 FROM LAYANAN) THEN 0 ELSE 1 END AS IsEmpty;");
            if (resultSet.next()) {
                hasil = resultSet.getInt("IsEmpty");
            }
        } catch (SQLException e) {
            System.out.println("Terjadi error saat cek apakah tabel LAYANAN kosong atau tidak");
        }
        return hasil;
    }
    public int PRODUSEN(Connection connection) {
        int hasil = 0;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT CASE WHEN EXISTS(SELECT 1 FROM PRODUSEN) THEN 0 ELSE 1 END AS IsEmpty;");
            if (resultSet.next()) {
                hasil = resultSet.getInt("IsEmpty");
            }
        } catch (SQLException e) {
            System.out.println("Terjadi error saat cek apakah tabel PRODUSEN kosong atau tidak");
        }
        return hasil;
    }
    public int CABANG_PRODUSEN(Connection connection) {
        int hasil = 0;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT CASE WHEN EXISTS(SELECT 1 FROM CABANG_PRODUSEN) THEN 0 ELSE 1 END AS IsEmpty;");
            if (resultSet.next()) {
                hasil = resultSet.getInt("IsEmpty");
            }
        } catch (SQLException e) {
            System.out.println("Terjadi error saat cek apakah tabel CABANG_PRODUSEN kosong atau tidak");
        }
        return hasil;
    }
    public int PEMILIK(Connection connection) {
        int hasil = 0;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT CASE WHEN EXISTS(SELECT 1 FROM PEMILIK) THEN 0 ELSE 1 END AS IsEmpty;");
            if (resultSet.next()) {
                hasil = resultSet.getInt("IsEmpty");
            }
        } catch (SQLException e) {
            System.out.println("Terjadi error saat cek apakah tabel PEMILIK kosong atau tidak");
        }
        return hasil;
    }
    public int ALAT_TRANSPORTASI(Connection connection) {
        int hasil = 0;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT CASE WHEN EXISTS(SELECT 1 FROM ALAT_TRANSPORTASI) THEN 0 ELSE 1 END AS IsEmpty;");
            if (resultSet.next()) {
                hasil = resultSet.getInt("IsEmpty");
            }
        } catch (SQLException e) {
            System.out.println("Terjadi error saat cek apakah tabel ALAT_TRANSPORTASI kosong atau tidak");
        }
        return hasil;
    }
    public int PESAWAT(Connection connection) {
        int hasil = 0;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT CASE WHEN EXISTS(SELECT 1 FROM PESAWAT) THEN 0 ELSE 1 END AS IsEmpty;");
            if (resultSet.next()) {
                hasil = resultSet.getInt("IsEmpty");
            }
        } catch (SQLException e) {
            System.out.println("Terjadi error saat cek apakah tabel PESAWAT kosong atau tidak");
        }
        return hasil;
    }
    public int HELIKOPTER(Connection connection) {
        int hasil = 0;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT CASE WHEN EXISTS(SELECT 1 FROM HELIKOPTER) THEN 0 ELSE 1 END AS IsEmpty;");
            if (resultSet.next()) {
                hasil = resultSet.getInt("IsEmpty");
            }
        } catch (SQLException e) {
            System.out.println("Terjadi error saat cek apakah tabel HELIKOPTER kosong atau tidak");
        }
        return hasil;
    }
    public int MOBIL_BUS(Connection connection) {
        int hasil = 0;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT CASE WHEN EXISTS(SELECT 1 FROM MOBIL_BUS) THEN 0 ELSE 1 END AS IsEmpty;");
            if (resultSet.next()) {
                hasil = resultSet.getInt("IsEmpty");
            }
        } catch (SQLException e) {
            System.out.println("Terjadi error saat cek apakah tabel MOBIL_BUS kosong atau tidak");
        }
        return hasil;
    }
    public int MOBIL_PENUMPANG(Connection connection) {
        int hasil = 0;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT CASE WHEN EXISTS(SELECT 1 FROM MOBIL_PENUMPANG) THEN 0 ELSE 1 END AS IsEmpty;");
            if (resultSet.next()) {
                hasil = resultSet.getInt("IsEmpty");
            }
        } catch (SQLException e) {
            System.out.println("Terjadi error saat cek apakah tabel MOBIL_PENUMPANG kosong atau tidak");
        }
        return hasil;
    }
    public int KERETA(Connection connection) {
        int hasil = 0;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT CASE WHEN EXISTS(SELECT 1 FROM KERETA) THEN 0 ELSE 1 END AS IsEmpty;");
            if (resultSet.next()) {
                hasil = resultSet.getInt("IsEmpty");
            }
        } catch (SQLException e) {
            System.out.println("Terjadi error saat cek apakah tabel KERETA kosong atau tidak");
        }
        return hasil;
    }
    public int KAPAL(Connection connection) {
        int hasil = 0;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT CASE WHEN EXISTS(SELECT 1 FROM KAPAL) THEN 0 ELSE 1 END AS IsEmpty;");
            if (resultSet.next()) {
                hasil = resultSet.getInt("IsEmpty");
            }
        } catch (SQLException e) {
            System.out.println("Terjadi error saat cek apakah tabel KAPAL kosong atau tidak");
        }
        return hasil;
    }
    public int TEMPAT_PEMBERHENTIAN(Connection connection) {
        int hasil = 0;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT CASE WHEN EXISTS(SELECT 1 FROM TEMPAT_PEMBERHENTIAN) THEN 0 ELSE 1 END AS IsEmpty;");
            if (resultSet.next()) {
                hasil = resultSet.getInt("IsEmpty");
            }
        } catch (SQLException e) {
            System.out.println("Terjadi error saat cek apakah tabel TEMPAT_PEMBERHENTIAN kosong atau tidak");
        }
        return hasil;
    }
    public int BANDARA(Connection connection) {
        int hasil = 0;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT CASE WHEN EXISTS(SELECT 1 FROM BANDARA) THEN 0 ELSE 1 END AS IsEmpty;");
            if (resultSet.next()) {
                hasil = resultSet.getInt("IsEmpty");
            }
        } catch (SQLException e) {
            System.out.println("Terjadi error saat cek apakah tabel BANDARA kosong atau tidak");
        }
        return hasil;
    }
    public int HELIPORT(Connection connection) {
        int hasil = 0;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT CASE WHEN EXISTS(SELECT 1 FROM HELIPORT) THEN 0 ELSE 1 END AS IsEmpty;");
            if (resultSet.next()) {
                hasil = resultSet.getInt("IsEmpty");
            }
        } catch (SQLException e) {
            System.out.println("Terjadi error saat cek apakah tabel HELIPORT kosong atau tidak");
        }
        return hasil;
    }
    public int TERMINAL(Connection connection) {
        int hasil = 0;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT CASE WHEN EXISTS(SELECT 1 FROM TERMINAL) THEN 0 ELSE 1 END AS IsEmpty;");
            if (resultSet.next()) {
                hasil = resultSet.getInt("IsEmpty");
            }
        } catch (SQLException e) {
            System.out.println("Terjadi error saat cek apakah tabel TERMINAL kosong atau tidak");
        }
        return hasil;
    }
    public int STASIUN(Connection connection) {
        int hasil = 0;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT CASE WHEN EXISTS(SELECT 1 FROM STASIUN) THEN 0 ELSE 1 END AS IsEmpty;");
            if (resultSet.next()) {
                hasil = resultSet.getInt("IsEmpty");
            }
        } catch (SQLException e) {
            System.out.println("Terjadi error saat cek apakah tabel STASIUN kosong atau tidak");
        }
        return hasil;
    }
    public int PELABUHAN(Connection connection) {
        int hasil = 0;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT CASE WHEN EXISTS(SELECT 1 FROM PELABUHAN) THEN 0 ELSE 1 END AS IsEmpty;");
            if (resultSet.next()) {
                hasil = resultSet.getInt("IsEmpty");
            }
        } catch (SQLException e) {
            System.out.println("Terjadi error saat cek apakah tabel PELABUHAN kosong atau tidak");
        }
        return hasil;
    }
    public int RUTE(Connection connection) {
        int hasil = 0;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT CASE WHEN EXISTS(SELECT 1 FROM RUTE) THEN 0 ELSE 1 END AS IsEmpty;");
            if (resultSet.next()) {
                hasil = resultSet.getInt("IsEmpty");
            }
        } catch (SQLException e) {
            System.out.println("Terjadi error saat cek apakah tabel RUTE kosong atau tidak");
        }
        return hasil;
    }
    public int TIKET(Connection connection) {
        int hasil = 0;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT CASE WHEN EXISTS(SELECT 1 FROM TIKET) THEN 0 ELSE 1 END AS IsEmpty;");
            if (resultSet.next()) {
                hasil = resultSet.getInt("IsEmpty");
            }
        } catch (SQLException e) {
            System.out.println("Terjadi error saat cek apakah tabel TIKET kosong atau tidak");
        }
        return hasil;
    }
    public int MEMILIKI_FITUR(Connection connection) {
        int hasil = 0;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT CASE WHEN EXISTS(SELECT 1 FROM MEMILIKI_FITUR) THEN 0 ELSE 1 END AS IsEmpty;");
            if (resultSet.next()) {
                hasil = resultSet.getInt("IsEmpty");
            }
        } catch (SQLException e) {
            System.out.println("Terjadi error saat cek apakah tabel MEMILIKI_FITUR kosong atau tidak");
        }
        return hasil;
    }
    public int MEMILIKI_RUTE(Connection connection) {
        int hasil = 0;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT CASE WHEN EXISTS(SELECT 1 FROM MEMILIKI_RUTE) THEN 0 ELSE 1 END AS IsEmpty;");
            if (resultSet.next()) {
                hasil = resultSet.getInt("IsEmpty");
            }
        } catch (SQLException e) {
            System.out.println("Terjadi error saat cek apakah tabel MEMILIKI_RUTE kosong atau tidak");
        }
        return hasil;
    }
    public int MEMILIKI_LAYANAN(Connection connection) {
        int hasil = 0;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT CASE WHEN EXISTS(SELECT 1 FROM MEMILIKI_LAYANAN) THEN 0 ELSE 1 END AS IsEmpty;");
            if (resultSet.next()) {
                hasil = resultSet.getInt("IsEmpty");
            }
        } catch (SQLException e) {
            System.out.println("Terjadi error saat cek apakah tabel MEMILIKI_LAYANAN kosong atau tidak");
        }
        return hasil;
    }
    public int MEMILIKI_FASILITAS(Connection connection) {
        int hasil = 0;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT CASE WHEN EXISTS(SELECT 1 FROM MEMILIKI_FASILITAS) THEN 0 ELSE 1 END AS IsEmpty;");
            if (resultSet.next()) {
                hasil = resultSet.getInt("IsEmpty");
            }
        } catch (SQLException e) {
            System.out.println("Terjadi error saat cek apakah tabel MEMILIKI_FASILITAS kosong atau tidak");
        }
        return hasil;
    }
}