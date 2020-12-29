package SQL;

import entity.*;
import entity.alatransportasi.*;
import entity.produsen.CabangProdusen;
import entity.produsen.Produsen;
import entity.tempatpemberhentian.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQLUpdate {
    public void KOTA(Connection connection, Kota kota) {
        String sql = "UPDATE KOTA SET Nama = ?, Luas_Wilayah = ? WHERE Kode_Kota = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, kota.getNama());
            preparedStatement.setInt(2, kota.getLuas_Wilayah());
            preparedStatement.setString(3, kota.getKode_Kota());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println(kota.getKode_Kota() + " telah terupdate pada tabel KOTA");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + kota.getKode_Kota() + " pada tabel KOTA");
        }
    }
    public void FASILITAS(Connection connection, Fasilitas fasilitas) {
        String sql = "";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.close();
            System.out.println(fasilitas.getKode_Fasilitas() + " telah terupdate pada tabel FASILITAS");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + fasilitas.getKode_Fasilitas() + " pada tabel FASILITAS");
        }
    }
    public void FITUR(Connection connection, Fitur fitur) {
        String sql = "";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.close();
            System.out.println(fitur.getKode_Fitur() + " telah terupdate pada tabel FITUR");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + fitur.getKode_Fitur() + " pada tabel FITUR");
        }
    }
    public void LAYANAN(Connection connection, Layanan layanan) {
        String sql = "";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.close();
            System.out.println(layanan.getKode_Layanan() + " telah terupdate pada tabel LAYANAN");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + layanan.getKode_Layanan() + " pada tabel LAYANAN");
        }
    }
    public void PRODUSEN(Connection connection, Produsen produsen) {
        String sql = "";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.close();
            System.out.println(produsen.getKode_Produsen() + " telah terupdate pada tabel PRODUSEN");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + produsen.getKode_Produsen() + " pada tabel PRODUSEN");
        }
    }
    public void CABANG_PRODUSEN(Connection connection, CabangProdusen cabangProdusen) {
        String sql = "";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.close();
            System.out.println(cabangProdusen.getKode_Cabang_Produsen() + " telah terupdate pada tabel CABANG_PRODUSEN");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + cabangProdusen.getKode_Cabang_Produsen() + " pada tabel CABANG_PRODUSEN");
        }
    }
    public void PEMILIK(Connection connection, Pemilik pemilik) {
        String sql = "";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.close();
            System.out.println(pemilik.getKode_Pemilik() + " telah terupdate pada tabel PEMILIK");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + pemilik.getKode_Pemilik() + " pada tabel PEMILIK");
        }
    }
    public void ALAT_TRANSPORTASI(Connection connection, AlatTransportasi alatTransportasi) {
        String sql = "";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.close();
            System.out.println(alatTransportasi.getKode_Kendaraan() + " telah terupdate pada tabel ALAT_TRANSPORTASI");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + alatTransportasi.getKode_Kendaraan() + " pada tabel ALAT_TRANSPORTASI");
        }
    }
    public void PESAWAT(Connection connection, Pesawat pesawat) {
        String sql = "";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.close();
            System.out.println(pesawat.getKode_Kendaraan() + " telah terupdate pada tabel PESAWAT");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + pesawat.getKode_Kendaraan() + " pada tabel PESAWAT");
        }
    }
    public void HELIKOPTER(Connection connection, Helikopter helikopter) {
        String sql = "";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.close();
            System.out.println(helikopter.getKode_Kendaraan() + " telah terupdate pada tabel HELIKOPTER");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + helikopter.getKode_Kendaraan() + " pada tabel HELIKOPTER");
        }
    }
    public void MOBIL_BUS(Connection connection, MobilBus mobilBus) {
        String sql = "";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.close();
            System.out.println(mobilBus.getKode_Kendaraan() + " telah terupdate pada tabel MOBIL_BUS");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + mobilBus.getKode_Kendaraan() + " pada tabel MOBIL_BUS");
        }
    }
    public void MOBIL_PENUMPANG(Connection connection, MobilPenumpang mobilPenumpang) {
        String sql = "";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.close();
            System.out.println(mobilPenumpang.getKode_Kendaraan() + " telah terupdate pada tabel MOBIL_PENUMPANG");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + mobilPenumpang.getKode_Kendaraan() + " pada tabel MOBIL_PENUMPANG");
        }
    }
    public void KERETA(Connection connection, Kereta kereta) {
        String sql = "";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.close();
            System.out.println(kereta.getKode_Kendaraan() + " telah terupdate pada tabel KERETA");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + kereta.getKode_Kendaraan() + " pada tabel KERETA");
        }
    }
    public void KAPAL(Connection connection, Kapal kapal) {
        String sql = "";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.close();
            System.out.println(kapal.getKode_Kendaraan() + " telah terupdate pada tabel KAPAL");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + kapal.getKode_Kendaraan() + " pada tabel KAPAL");
        }
    }
    public void TEMPAT_PEMBERHENTIAN(Connection connection, TempatPemberhentian tempatPemberhentian) {
        String sql = "";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.close();
            System.out.println(tempatPemberhentian.getKode_Tempat_Pemberhentian() + " telah terupdate pada tabel TEMPAT_PEMBERHENTIAN");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + tempatPemberhentian.getKode_Tempat_Pemberhentian() + " pada tabel TEMPAT_PEMBERHENTIAN");
        }
    }
    public void BANDARA(Connection connection, Bandara bandara) {
        String sql = "";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.close();
            System.out.println(bandara.getKode_Tempat_Pemberhentian() + " telah terupdate pada tabel BANDARA");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + bandara.getKode_Tempat_Pemberhentian() + " pada tabel BANDARA");
        }
    }
    public void HELIPORT(Connection connection, Heliport heliport) {
        String sql = "";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.close();
            System.out.println(heliport.getKode_Tempat_Pemberhentian() + " telah terupdate pada tabel HELIPORT");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + heliport.getKode_Tempat_Pemberhentian() + " pada tabel HELIPORT");
        }
    }
    public void TERMINAL(Connection connection, Terminal terminal) {
        String sql = "";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.close();
            System.out.println(terminal.getKode_Tempat_Pemberhentian() + " telah terupdate pada tabel TERMINAL");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + terminal.getKode_Tempat_Pemberhentian() + " pada tabel TERMINAL");
        }
    }
    public void STASIUN(Connection connection, Stasiun stasiun) {
        String sql = "";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.close();
            System.out.println(stasiun.getKode_Tempat_Pemberhentian() + " telah terupdate pada tabel STASIUN");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + stasiun.getKode_Tempat_Pemberhentian() + " pada tabel STASIUN");
        }
    }
    public void PELABUHAN(Connection connection, Pelabuhan pelabuhan) {
        String sql = "";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.close();
            System.out.println(pelabuhan.getKode_Tempat_Pemberhentian() + " telah terupdate pada tabel PELABUHAN");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + pelabuhan.getKode_Tempat_Pemberhentian() + " pada tabel PELABUHAN");
        }
    }
    public void RUTE(Connection connection, Rute rute) {
        String sql = "";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.close();
            System.out.println(rute.getKode_Rute() + " telah terupdate pada tabel RUTE");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + rute.getKode_Rute() + " pada tabel RUTE");
        }
    }
    public void TIKET(Connection connection, Tiket tiket) {
        String sql = "";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.close();
            System.out.println(tiket.getKode_Tiket() + " telah terupdate pada tabel TIKET");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + tiket.getKode_Tiket() + " pada tabel TIKET");
        }
    }
    public void MEMILIKI_FITUR(Connection connection, MemilikiFitur memilikiFitur, int i) {
        String sql;
        switch (i) {
            case 1 :
                sql = "";
                try {
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);

                    preparedStatement.close();
                    System.out.println(memilikiFitur.getKode_Kendaraan() + " telah terupdate pada tabel MEMILIKI_FITUR");
                } catch (SQLException e) {
                    System.out.println("Tidak bisa mengupdate " + memilikiFitur.getKode_Kendaraan() + " pada tabel MEMILIKI_FITUR");
                }
                break;
            case 2 :
                sql = "";
                try {
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);

                    preparedStatement.close();
                    System.out.println(memilikiFitur.getKode_Fitur() + " telah terupdate pada tabel MEMILIKI_FITUR");
                } catch (SQLException e) {
                    System.out.println("Tidak bisa mengupdate " + memilikiFitur.getKode_Fitur() + " pada tabel MEMILIKI_FITUR");
                }
                break;
        }
    }
    public void MEMILIKI_RUTE(Connection connection, MemilikiRute memilikiRute, int i) {
        String sql;
        switch (i) {
            case 1 :
                sql = "";
                try {
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);

                    preparedStatement.close();
                    System.out.println(memilikiRute.getKode_Kendaraan() + " telah terupdate pada tabel MEMILIKI_FITUR");
                } catch (SQLException e) {
                    System.out.println("Tidak bisa mengupdate " + memilikiRute.getKode_Kendaraan() + " pada tabel MEMILIKI_FITUR");
                }
                break;
            case 2 :
                sql = "";
                try {
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);

                    preparedStatement.close();
                    System.out.println(memilikiRute.getKode_Rute() + " telah terupdate pada tabel MEMILIKI_FITUR");
                } catch (SQLException e) {
                    System.out.println("Tidak bisa mengupdate " + memilikiRute.getKode_Rute() + " pada tabel MEMILIKI_FITUR");
                }
                break;
        }
    }
    public void MEMILIKI_LAYANAN(Connection connection, MemilikiLayanan memilikiLayanan, int i) {
        String sql;
        switch (i) {
            case 1 :
                sql = "";
                try {
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);

                    preparedStatement.close();
                    System.out.println(memilikiLayanan.getKode_Tempat_Pemberhentian() + " telah terupdate pada tabel MEMILIKI_FITUR");
                } catch (SQLException e) {
                    System.out.println("Tidak bisa mengupdate " + memilikiLayanan.getKode_Tempat_Pemberhentian() + " pada tabel MEMILIKI_FITUR");
                }
                break;
            case 2 :
                sql = "";
                try {
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);

                    preparedStatement.close();
                    System.out.println(memilikiLayanan.getKode_Layanan() + " telah terupdate pada tabel MEMILIKI_FITUR");
                } catch (SQLException e) {
                    System.out.println("Tidak bisa mengupdate " + memilikiLayanan.getKode_Layanan() + " pada tabel MEMILIKI_FITUR");
                }
                break;
        }
    }
    public void MEMILIKI_FASILITAS(Connection connection, MemilikiFasilitas memilikiFasilitas, int i) {
        String sql;
        switch (i) {
            case 1 :
                sql = "";
                try {
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);

                    preparedStatement.close();
                    System.out.println(memilikiFasilitas.getKode_Tempat_Pemberhentian() + " telah terupdate pada tabel MEMILIKI_FASILITAS");
                } catch (SQLException e) {
                    System.out.println("Tidak bisa mengupdate " + memilikiFasilitas.getKode_Tempat_Pemberhentian() + " pada tabel MEMILIKI_FASILITAS");
                }
                break;
            case 2 :
                sql = "";
                try {
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);

                    preparedStatement.close();
                    System.out.println(memilikiFasilitas.getKode_Kendaraan() + " telah terupdate pada tabel MEMILIKI_FASILITAS");
                } catch (SQLException e) {
                    System.out.println("Tidak bisa mengupdate " + memilikiFasilitas.getKode_Kendaraan() + " pada tabel MEMILIKI_FASILITAS");
                }
                break;
            case 3 :
                sql = "";
                try {
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);

                    preparedStatement.close();
                    System.out.println(memilikiFasilitas.getKode_Fasilitas() + " telah terupdate pada tabel MEMILIKI_FASILITAS");
                } catch (SQLException e) {
                    System.out.println("Tidak bisa mengupdate " + memilikiFasilitas.getKode_Fasilitas() + " pada tabel MEMILIKI_FASILITAS");
                }
                break;
        }
    }
}
