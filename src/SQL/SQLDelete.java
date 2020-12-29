package SQL;

import entity.Kota;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQLDelete {
    public void KOTA(Connection connection, Kota kota) {
        String sql = "DELETE FROM KOTA WHERE Kode_Kota = ?;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, kota.getKode_Kota());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println(kota.getKode_Kota() + " telah terhapus dari tabel KOTA");
        } catch (SQLException e) {
            System.out.println("Tidak bisa menghapus " + kota.getKode_Kota() + " dari tabel KOTA");
        }
    }
}
