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
        String sql = "UPDATE FASILITAS SET Nama = ? WHERE Kode_Fasilitas = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, fasilitas.getNama());
            preparedStatement.setString(2, fasilitas.getKode_Fasilitas());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println(fasilitas.getKode_Fasilitas() + " telah terupdate pada tabel FASILITAS");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + fasilitas.getKode_Fasilitas() + " pada tabel FASILITAS");
        }
    }
    public void FITUR(Connection connection, Fitur fitur) {
        String sql = "UPDATE FITUR SET Nama = ? WHERE Kode_Fitur = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, fitur.getNama());
            preparedStatement.setString(2, fitur.getKode_Fitur());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println(fitur.getKode_Fitur() + " telah terupdate pada tabel FITUR");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + fitur.getKode_Fitur() + " pada tabel FITUR");
        }
    }
    public void LAYANAN(Connection connection, Layanan layanan) {
        String sql = "UPDATE LAYANAN SET Nama = ? WHERE Kode_Layanan = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, layanan.getNama());
            preparedStatement.setString(2, layanan.getKode_Layanan());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println(layanan.getKode_Layanan() + " telah terupdate pada tabel LAYANAN");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + layanan.getKode_Layanan() + " pada tabel LAYANAN");
        }
    }
    public void PRODUSEN(Connection connection, Produsen produsen) {
        String sql = "UPDATE PRODUSEN SET Kode_Kota = ?, Nama = ?, Alamat_Pusat = ?, Email = ?, Nomor_Telepon = ?, Website = ?, Kapasitas_Produksi = ?, Jumlah_Karyawan = ? WHERE Kode_Produsen = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, produsen.getKode_Kota());
            preparedStatement.setString(2, produsen.getNama());
            preparedStatement.setString(3, produsen.getAlamat_Pusat());
            preparedStatement.setString(4, produsen.getEmail());
            preparedStatement.setString(5, produsen.getNomor_Telepon());
            preparedStatement.setString(6, produsen.getWebsite());
            preparedStatement.setInt(7, produsen.getKapasitas_Produksi());
            preparedStatement.setInt(8, produsen.getJumlah_Karyawan());
            preparedStatement.setString(9, produsen.getKode_Produsen());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println(produsen.getKode_Produsen() + " telah terupdate pada tabel PRODUSEN");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + produsen.getKode_Produsen() + " pada tabel PRODUSEN");
        }
    }
    public void CABANG_PRODUSEN(Connection connection, CabangProdusen cabangProdusen) {
        String sql = "UPDATE CABANG_PRODUSEN SET Kode_Produsen = ?, Kode_Kota = ?, Alamat_Cabang = ?, Kapasitas_Produksi = ? WHERE Kode_Cabang_Produsen = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, cabangProdusen.getKode_Produsen());
            preparedStatement.setString(2, cabangProdusen.getKode_Kota());
            preparedStatement.setString(3, cabangProdusen.getAlamat_Cabang());
            preparedStatement.setInt(4, cabangProdusen.getKapasitas_Produksi());
            preparedStatement.setString(5, cabangProdusen.getKode_Cabang_Produsen());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println(cabangProdusen.getKode_Cabang_Produsen() + " telah terupdate pada tabel CABANG_PRODUSEN");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + cabangProdusen.getKode_Cabang_Produsen() + " pada tabel CABANG_PRODUSEN");
        }
    }
    public void PEMILIK(Connection connection, Pemilik pemilik) {
        String sql = "UPDATE PEMILIK SET Kode_Kota = ?, Nama = ?, Alamat = ?, Email = ?, Nomor_Telepon = ?, Website = ? WHERE Kode_Pemilik = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, pemilik.getKode_Kota());
            preparedStatement.setString(2, pemilik.getNama());
            preparedStatement.setString(3, pemilik.getAlamat());
            preparedStatement.setString(4, pemilik.getEmail());
            preparedStatement.setString(5, pemilik.getNomor_Telepon());
            preparedStatement.setString(6, pemilik.getWebsite());
            preparedStatement.setString(7, pemilik.getKode_Pemilik());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println(pemilik.getKode_Pemilik() + " telah terupdate pada tabel PEMILIK");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + pemilik.getKode_Pemilik() + " pada tabel PEMILIK");
        }
    }
    public void ALAT_TRANSPORTASI(Connection connection, AlatTransportasi alatTransportasi) {
        String sql = "UPDATE ALAT_TRANSPORTASI SET Kode_Produsen = ?, Kode_Pemilik = ?, Nama = ?, Kecepatan_Maksimum = ?, Kapasitas_Muatan = ?, Tahun_Pengadaan = ?, Jenis_Mesin = ?, Hotline = ?, Kapasitas_tangki = ?, Berat_kendaraan = ?, Jenis_Bahan_Bakar = ?, Kapasitas_Penumpang = ?, Panjang = ?, Tahun_Mulai_Dimiliki = ? WHERE Kode_Kendaraan = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, alatTransportasi.getKode_Produsen());
            preparedStatement.setString(2, alatTransportasi.getKode_Pemilik());
            preparedStatement.setString(3, alatTransportasi.getNama());
            preparedStatement.setInt(4, alatTransportasi.getKecepatan_Maksimum());
            preparedStatement.setInt(5, alatTransportasi.getKapasitas_Muatan());
            preparedStatement.setString(6, alatTransportasi.getTahun_Pengadaan());
            preparedStatement.setString(7, alatTransportasi.getJenis_Mesin());
            preparedStatement.setString(8, alatTransportasi.getHotline());
            preparedStatement.setInt(9, alatTransportasi.getKapasitas_tangki());
            preparedStatement.setInt(10, alatTransportasi.getBerat_kendaraan());
            preparedStatement.setString(11, alatTransportasi.getJenis_Bahan_Bakar());
            preparedStatement.setInt(12, alatTransportasi.getKapasitas_Penumpang());
            preparedStatement.setInt(13, alatTransportasi.getPanjang());
            preparedStatement.setString(14, alatTransportasi.getTahun_Mulai_Dimiliki());
            preparedStatement.setString(15, alatTransportasi.getKode_Kendaraan());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println(alatTransportasi.getKode_Kendaraan() + " telah terupdate pada tabel ALAT_TRANSPORTASI");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + alatTransportasi.getKode_Kendaraan() + " pada tabel ALAT_TRANSPORTASI");
        }
    }
    public void PESAWAT(Connection connection, Pesawat pesawat) {
        String sql = "UPDATE PESAWAT SET Ketinggian_Maksimal = ?, Luas_Sayap = ?, Sudut_Sayap = ?, Tinggi_Ekor = ?, Lebar_Kabin = ?, Bentang_Sayap = ? WHERE Kode_Kendaraan = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, pesawat.getKetinggian_Maksimal());
            preparedStatement.setInt(2, pesawat.getLuas_Sayap());
            preparedStatement.setInt(3, pesawat.getSudut_Sayap());
            preparedStatement.setInt(4, pesawat.getTinggi_Ekor());
            preparedStatement.setInt(5, pesawat.getLebar_Kabin());
            preparedStatement.setInt(6, pesawat.getBentang_Sayap());
            preparedStatement.setString(7, pesawat.getKode_Kendaraan());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println(pesawat.getKode_Kendaraan() + " telah terupdate pada tabel PESAWAT");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + pesawat.getKode_Kendaraan() + " pada tabel PESAWAT");
        }
    }
    public void HELIKOPTER(Connection connection, Helikopter helikopter) {
        String sql = "UPDATE HELIKOPTER SET Ketinggian_Maksimal = ?, Diameter_Baling_Baling = ? WHERE Kode_Kendaraan = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, helikopter.getKetinggian_Maksimal());
            preparedStatement.setInt(2, helikopter.getDiameter_Baling_Baling());
            preparedStatement.setString(3, helikopter.getKode_Kendaraan());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println(helikopter.getKode_Kendaraan() + " telah terupdate pada tabel HELIKOPTER");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + helikopter.getKode_Kendaraan() + " pada tabel HELIKOPTER");
        }
    }
    public void MOBIL_BUS(Connection connection, MobilBus mobilBus) {
        String sql = "UPDATE MOBIL_BUS SET Jumlah_Roda = ?, Plat_Nomor = ?, Karoseri = ?, Manual_Atau_Matik = ? WHERE Kode_Kendaraan = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, mobilBus.getJumlah_Roda());
            preparedStatement.setString(2, mobilBus.getPlat_Nomor());
            preparedStatement.setString(3, mobilBus.getKaroseri());
            preparedStatement.setInt(4, mobilBus.getManual_Atau_Matik());
            preparedStatement.setString(5, mobilBus.getKode_Kendaraan());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println(mobilBus.getKode_Kendaraan() + " telah terupdate pada tabel MOBIL_BUS");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + mobilBus.getKode_Kendaraan() + " pada tabel MOBIL_BUS");
        }
    }
    public void MOBIL_PENUMPANG(Connection connection, MobilPenumpang mobilPenumpang) {
        String sql = "UPDATE MOBIL_PENUMPANG SET Jumlah_Roda = ?, Plat_Nomor = ?, Manual_Atau_Matik = ? WHERE Kode_Kendaraan = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, mobilPenumpang.getJumlah_Roda());
            preparedStatement.setString(2, mobilPenumpang.getPlat_Nomor());
            preparedStatement.setInt(3, mobilPenumpang.getManual_Atau_Matik());
            preparedStatement.setString(4, mobilPenumpang.getKode_Kendaraan());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println(mobilPenumpang.getKode_Kendaraan() + " telah terupdate pada tabel MOBIL_PENUMPANG");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + mobilPenumpang.getKode_Kendaraan() + " pada tabel MOBIL_PENUMPANG");
        }
    }
    public void KERETA(Connection connection, Kereta kereta) {
        String sql = "UPDATE KERETA SET Jumlah_Roda = ?, Plat_Nomor = ?, Jumlah_Lokomotif = ?, Jumlah_Gerbong = ? WHERE Kode_Kendaraan = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, kereta.getJumlah_Roda());
            preparedStatement.setString(2, kereta.getPlat_Nomor());
            preparedStatement.setInt(3, kereta.getJumlah_Lokomotif());
            preparedStatement.setInt(4, kereta.getJumlah_Gerbong());
            preparedStatement.setString(5, kereta.getKode_Kendaraan());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println(kereta.getKode_Kendaraan() + " telah terupdate pada tabel KERETA");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + kereta.getKode_Kendaraan() + " pada tabel KERETA");
        }
    }
    public void KAPAL(Connection connection, Kapal kapal) {
        String sql = "UPDATE KAPAL SET Jumlah_Geladak = ? WHERE Kode_Kendaraan = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, kapal.getJumlah_Geladak());
            preparedStatement.setString(2, kapal.getKode_Kendaraan());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println(kapal.getKode_Kendaraan() + " telah terupdate pada tabel KAPAL");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + kapal.getKode_Kendaraan() + " pada tabel KAPAL");
        }
    }
    public void TEMPAT_PEMBERHENTIAN(Connection connection, TempatPemberhentian tempatPemberhentian) {
        String sql = "UPDATE TEMPAT_PEMBERHENTIAN SET Kode_Kota = ?, Nama = ?, Alamat = ?, Kapasitas_Alat_Transportasi = ?, Tahun_Operasi = ?, Jumlah_Karyawan = ?, Luas_Area = ?, Kapasitas_Pengunjung = ?, Nomor_Telepon = ? WHERE Kode_Tempat_Pemberhentian = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, tempatPemberhentian.getKode_Kota());
            preparedStatement.setString(2, tempatPemberhentian.getNama());
            preparedStatement.setString(3, tempatPemberhentian.getAlamat());
            preparedStatement.setInt(4, tempatPemberhentian.getKapasitas_Alat_Transportasi());
            preparedStatement.setString(5, tempatPemberhentian.getTahun_Operasi());
            preparedStatement.setInt(6, tempatPemberhentian.getJumlah_Karyawan());
            preparedStatement.setInt(7, tempatPemberhentian.getLuas_Area());
            preparedStatement.setInt(8, tempatPemberhentian.getKapasitas_Pengunjung());
            preparedStatement.setString(9, tempatPemberhentian.getNomor_Telepon());
            preparedStatement.setString(10, tempatPemberhentian.getKode_Tempat_Pemberhentian());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println(tempatPemberhentian.getKode_Tempat_Pemberhentian() + " telah terupdate pada tabel TEMPAT_PEMBERHENTIAN");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + tempatPemberhentian.getKode_Tempat_Pemberhentian() + " pada tabel TEMPAT_PEMBERHENTIAN");
        }
    }
    public void BANDARA(Connection connection, Bandara bandara) {
        String sql = "UPDATE BANDARA SET Klasifikasi_Bandara = ?, Jumlah_Landasan = ?, Jumlah_Gate = ?, Jumlah_Terminal = ?, Jenis_Bandara = ? WHERE Kode_Tempat_Pemberhentian = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, bandara.getKlasifikasi_Bandara());
            preparedStatement.setInt(2, bandara.getJumlah_Landasan());
            preparedStatement.setInt(3, bandara.getJumlah_Gate());
            preparedStatement.setInt(4, bandara.getJumlah_Terminal());
            preparedStatement.setInt(5, bandara.getJenis_Bandara());
            preparedStatement.setString(6, bandara.getKode_Tempat_Pemberhentian());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println(bandara.getKode_Tempat_Pemberhentian() + " telah terupdate pada tabel BANDARA");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + bandara.getKode_Tempat_Pemberhentian() + " pada tabel BANDARA");
        }
    }
    public void HELIPORT(Connection connection, Heliport heliport) {
        String sql = "UPDATE HELIPORT SET Jumlah_Helipad = ? WHERE Kode_Tempat_Pemberhentian = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, heliport.getJumlah_Helipad());
            preparedStatement.setString(2, heliport.getKode_Tempat_Pemberhentian());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println(heliport.getKode_Tempat_Pemberhentian() + " telah terupdate pada tabel HELIPORT");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + heliport.getKode_Tempat_Pemberhentian() + " pada tabel HELIPORT");
        }
    }
    public void TERMINAL(Connection connection, Terminal terminal) {
        String sql = "UPDATE TERMINAL SET Jumlah_Jalur = ?, Klasifikasi = ? WHERE Kode_Tempat_Pemberhentian = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, terminal.getJumlah_Jalur());
            preparedStatement.setString(2, terminal.getKlasifikasi());
            preparedStatement.setString(3, terminal.getKode_Tempat_Pemberhentian());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println(terminal.getKode_Tempat_Pemberhentian() + " telah terupdate pada tabel TERMINAL");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + terminal.getKode_Tempat_Pemberhentian() + " pada tabel TERMINAL");
        }
    }
    public void STASIUN(Connection connection, Stasiun stasiun) {
        String sql = "UPDATE STASIUN SET Jumlah_Jalur = ?, Klasifikasi = ?, Jumlah_Peron = ? WHERE Kode_Tempat_Pemberhentian = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, stasiun.getJumlah_Jalur());
            preparedStatement.setString(2, stasiun.getKlasifikasi());
            preparedStatement.setInt(3, stasiun.getJumlah_Peron());
            preparedStatement.setString(4, stasiun.getKode_Tempat_Pemberhentian());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println(stasiun.getKode_Tempat_Pemberhentian() + " telah terupdate pada tabel STASIUN");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + stasiun.getKode_Tempat_Pemberhentian() + " pada tabel STASIUN");
        }
    }
    public void PELABUHAN(Connection connection, Pelabuhan pelabuhan) {
        String sql = "UPDATE PELABUHAN SET Jumlah_Dermaga = ? WHERE Kode_Tempat_Pemberhentian = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, pelabuhan.getJumlah_Dermaga());
            preparedStatement.setString(2, pelabuhan.getKode_Tempat_Pemberhentian());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println(pelabuhan.getKode_Tempat_Pemberhentian() + " telah terupdate pada tabel PELABUHAN");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + pelabuhan.getKode_Tempat_Pemberhentian() + " pada tabel PELABUHAN");
        }
    }
    public void RUTE(Connection connection, Rute rute) {
        String sql = "UPDATE RUTE SET Kode_Tempat_Pemberhentian_Asal = ?, Kode_Tempat_Pemberhentian_Tujuan = ?, Jarak = ?, Waktu_Berangkat = ?, Waktu_Tiba = ?, Tanggal_Berangkat = ?, Tanggal_Tiba = ? WHERE Kode_Rute = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, rute.getKode_Tempat_Pemberhentian_Asal());
            preparedStatement.setString(2, rute.getKode_Tempat_Pemberhentian_Tujuan());
            preparedStatement.setInt(3, rute.getJarak());
            preparedStatement.setString(4, rute.getWaktu_Berangkat());
            preparedStatement.setString(5, rute.getWaktu_Tiba());
            preparedStatement.setString(6, rute.getTanggal_Berangkat());
            preparedStatement.setString(7, rute.getTanggal_Tiba());
            preparedStatement.setString(8, rute.getKode_Rute());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println(rute.getKode_Rute() + " telah terupdate pada tabel RUTE");
        } catch (SQLException e) {
            System.out.println("Tidak bisa mengupdate " + rute.getKode_Rute() + " pada tabel RUTE");
        }
    }
    public void TIKET(Connection connection, Tiket tiket) {
        String sql = "UPDATE TIKET SET Kode_Rute = ?, Harga = ?, Kelas = ?, Posisi_Duduk = ?, Telah_Terbeli = ? WHERE Kode_Tiket = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, tiket.getKode_Rute());
            preparedStatement.setInt(2, tiket.getHarga());
            preparedStatement.setString(3, tiket.getKelas());
            preparedStatement.setString(4, tiket.getPosisi_Duduk());
            preparedStatement.setInt(5, tiket.getTelah_Terbeli());
            preparedStatement.setString(6, tiket.getKode_Tiket());
            preparedStatement.executeUpdate();
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
                sql = "UPDATE MEMILIKI_FITUR SET Kode_Fitur = ? WHERE Kode_Kendaraan = ?";
                try {
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setString(1, memilikiFitur.getKode_Fitur());
                    preparedStatement.setString(2, memilikiFitur.getKode_Kendaraan());
                    preparedStatement.executeUpdate();
                    preparedStatement.close();
                    System.out.println(memilikiFitur.getKode_Kendaraan() + " telah terupdate pada tabel MEMILIKI_FITUR");
                } catch (SQLException e) {
                    System.out.println("Tidak bisa mengupdate " + memilikiFitur.getKode_Kendaraan() + " pada tabel MEMILIKI_FITUR");
                }
                break;
            case 2 :
                sql = "UPDATE MEMILIKI_FITUR SET Kode_Kendaraan = ? WHERE Kode_Fitur = ?";
                try {
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setString(1, memilikiFitur.getKode_Kendaraan());
                    preparedStatement.setString(2, memilikiFitur.getKode_Fitur());
                    preparedStatement.executeUpdate();
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
                sql = "UPDATE MEMILIKI_RUTE SET Kode_Rute = ? WHERE Kode_Kendaraan = ?";
                try {
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setString(1, memilikiRute.getKode_Rute());
                    preparedStatement.setString(2, memilikiRute.getKode_Kendaraan());
                    preparedStatement.executeUpdate();
                    preparedStatement.close();
                    System.out.println(memilikiRute.getKode_Kendaraan() + " telah terupdate pada tabel MEMILIKI_FITUR");
                } catch (SQLException e) {
                    System.out.println("Tidak bisa mengupdate " + memilikiRute.getKode_Kendaraan() + " pada tabel MEMILIKI_FITUR");
                }
                break;
            case 2 :
                sql = "UPDATE MEMILIKI_RUTE SET Kode_Kendaraan = ? WHERE Kode_Rute = ?";
                try {
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setString(1, memilikiRute.getKode_Kendaraan());
                    preparedStatement.setString(2, memilikiRute.getKode_Rute());
                    preparedStatement.executeUpdate();
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
                sql = "UPDATE MEMILIKI_LAYANAN SET Kode_Layanan = ? WHERE Kode_Tempat_Pemberhentian = ?";
                try {
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setString(1, memilikiLayanan.getKode_Layanan());
                    preparedStatement.setString(2, memilikiLayanan.getKode_Tempat_Pemberhentian());
                    preparedStatement.executeUpdate();
                    preparedStatement.close();
                    System.out.println(memilikiLayanan.getKode_Tempat_Pemberhentian() + " telah terupdate pada tabel MEMILIKI_FITUR");
                } catch (SQLException e) {
                    System.out.println("Tidak bisa mengupdate " + memilikiLayanan.getKode_Tempat_Pemberhentian() + " pada tabel MEMILIKI_FITUR");
                }
                break;
            case 2 :
                sql = "UPDATE MEMILIKI_LAYANAN SET Kode_Tempat_Pemberhentian = ? WHERE Kode_Layanan = ?";
                try {
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setString(1, memilikiLayanan.getKode_Tempat_Pemberhentian());
                    preparedStatement.setString(2, memilikiLayanan.getKode_Layanan());
                    preparedStatement.executeUpdate();
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
                sql = "UPDATE MEMILIKI_FASILITAS SET Kode_Fasilitas = ?, Kode_Kendaraan = ? WHERE Kode_Tempat_Pemberhentian = ?";
                try {
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setString(1, memilikiFasilitas.getKode_Fasilitas());
                    preparedStatement.setString(2, memilikiFasilitas.getKode_Kendaraan());
                    preparedStatement.setString(3, memilikiFasilitas.getKode_Tempat_Pemberhentian());
                    preparedStatement.executeUpdate();
                    preparedStatement.close();
                    System.out.println(memilikiFasilitas.getKode_Tempat_Pemberhentian() + " telah terupdate pada tabel MEMILIKI_FASILITAS");
                } catch (SQLException e) {
                    System.out.println("Tidak bisa mengupdate " + memilikiFasilitas.getKode_Tempat_Pemberhentian() + " pada tabel MEMILIKI_FASILITAS");
                }
                break;
            case 2 :
                sql = "UPDATE MEMILIKI_FASILITAS SET Kode_Tempat_Pemberhentian = ?, Kode_Fasilitas = ? WHERE Kode_Kendaraan = ?";
                try {
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setString(1, memilikiFasilitas.getKode_Tempat_Pemberhentian());
                    preparedStatement.setString(2, memilikiFasilitas.getKode_Fasilitas());
                    preparedStatement.setString(3, memilikiFasilitas.getKode_Kendaraan());
                    preparedStatement.executeUpdate();
                    preparedStatement.close();
                    System.out.println(memilikiFasilitas.getKode_Kendaraan() + " telah terupdate pada tabel MEMILIKI_FASILITAS");
                } catch (SQLException e) {
                    System.out.println("Tidak bisa mengupdate " + memilikiFasilitas.getKode_Kendaraan() + " pada tabel MEMILIKI_FASILITAS");
                }
                break;
            case 3 :
                sql = "UPDATE MEMILIKI_FASILITAS SET Kode_Kendaraan = ?, Kode_Tempat_Pemberhentian = ? WHERE Kode_Fasilitas = ?";
                try {
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setString(1, memilikiFasilitas.getKode_Kendaraan());
                    preparedStatement.setString(2, memilikiFasilitas.getKode_Tempat_Pemberhentian());
                    preparedStatement.setString(3, memilikiFasilitas.getKode_Fasilitas());
                    preparedStatement.executeUpdate();
                    preparedStatement.close();
                    System.out.println(memilikiFasilitas.getKode_Fasilitas() + " telah terupdate pada tabel MEMILIKI_FASILITAS");
                } catch (SQLException e) {
                    System.out.println("Tidak bisa mengupdate " + memilikiFasilitas.getKode_Fasilitas() + " pada tabel MEMILIKI_FASILITAS");
                }
                break;
        }
    }
}
