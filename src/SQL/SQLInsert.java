package SQL;

import data.Kota;

import java.sql.Connection;

public class SQLInsert {
    public int KOTA(Connection connection, Kota kota) {}
}

public enum SQLInsert {
    KOTA {
        @Override
        public String toString() {
            return "INSERT INTO KOTA (Kode_Kota, Nama, Luas_Wilayah)"
                    + " VALUES (?, ?, ?)";
        }
    },
    PRODUSEN {
        @Override
        public String toString() {
            return "INSERT INTO PRODUSEN (Kode_Produsen, Kode_Kota, Nama, Email, Alamat, Nomor_Telepon, Website, Kapasitas_Produksi)"
                    + " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        }
    },
    FASILITAS {
        @Override
        public String toString() {
            return "INSERT INTO FASILITAS (Kode_Fasilitas, Nama)"
                    + " VALUES (?, ?)";
        }
    },
    FITUR {
        @Override
        public String toString() {
            return "INSERT INTO FITUR (Kode_Fitur, Nama)"
                    + " VALUES (?, ?)";
        }
    },
    LAYANAN {
        @Override
        public String toString() {
            return "INSERT INTO LAYANAN (Kode_Layanan, Nama)"
                    + " VALUES (?, ?)";
        }
    },
    PEMILIK_INDIVIDU {
        @Override
        public String toString() {
            return "INSERT INTO PEMILIK_INDIVIDU (Kode_Pemilik, Kode_Kota, Nama, Alamat, Email, Nomor_Telepon, Jenis_Kelamin, Tempat_Lahir, Tanggal_Lahir)"
                    + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        }
    },
    PEMILIK_INSTANSI {
        @Override
        public String toString() {
            return "INSERT INTO PEMILIK_INSTANSI (Kode_Pemilik, Kode_Kota, Nama, Alamat, Email, Nomor_Telepon, Website, Negara_Atau_Swasta)"
                    + " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        }
    },
    PESAWAT {
        @Override
        public String toString() {
            return "INSERT INTO PESAWAT (Kode_Kendaraan, Kode_Produsen, Kode_Pemilik, Nama, Kecepatan_Maksimum, Kapasitas_Muatan, Tahun_Pengadaan, Jenis_Mesin, Hotline, Kapasitas_tangki, Berat_kendaraan, Jenis_Bahan_Bakar, Kapasitas_Penumpang, Panjang, Ketinggian_Maksimal, Luas_Sayap, Sudut_Sayap, Tinggi_Ekor, Lebar_Kabin, Bentang_Sayap)"
                    + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        }
    },
    HELIKOPTER {
        @Override
        public String toString() {
            return "INSERT INTO HELIKOPTER (Kode_Kendaraan, Kode_Produsen, Kode_Pemilik, Nama, Kecepatan_Maksimum, Kapasitas_Muatan, Tahun_Pengadaan, Jenis_Mesin, Hotline, Kapasitas_tangki, Berat_kendaraan, Jenis_Bahan_Bakar, Kapasitas_Penumpang, Panjang, Ketinggian_Maksimal, Diameter_Baling_Baling)"
                    + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        }
    },
    BUS {
        @Override
        public String toString() {
            return "INSERT INTO BUS (Kode_Kendaraan, Kode_Produsen, Kode_Pemilik, Nama, Kecepatan_Maksimum, Kapasitas_Muatan, Tahun_Pengadaan, Jenis_Mesin, Hotline, Kapasitas_tangki, Berat_kendaraan, Jenis_Bahan_Bakar, Kapasitas_Penumpang, Panjang, Plat_Nomor, Karoseri, Manual_Atau_Matik)"
                    + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        }
    },
    MOBIL {
        @Override
        public String toString() {
            return "INSERT INTO MOBIL (Kode_Kendaraan, Kode_Produsen, Kode_Pemilik, Nama, Kecepatan_Maksimum, Kapasitas_Muatan, Tahun_Pengadaan, Jenis_Mesin, Hotline, Kapasitas_tangki, Berat_kendaraan, Jenis_Bahan_Bakar, Kapasitas_Penumpang, Panjang, Plat_Nomor, Manual_Atau_Matik)"
                    + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        }
    },
    MOTOR {
        @Override
        public String toString() {
            return "INSERT INTO MOTOR (Kode_Kendaraan, Kode_Produsen, Kode_Pemilik, Nama, Kecepatan_Maksimum, Kapasitas_Muatan, Tahun_Pengadaan, Jenis_Mesin, Hotline, Kapasitas_tangki, Berat_kendaraan, Jenis_Bahan_Bakar, Kapasitas_Penumpang, Panjang, Plat_Nomor, Manual_Atau_Matik)"
                    + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        }
    },
    KERETA {
        @Override
        public String toString() {
            return "INSERT INTO KERETA (Kode_Kendaraan, Kode_Produsen, Kode_Pemilik, Nama, Kecepatan_Maksimum, Kapasitas_Muatan, Tahun_Pengadaan, Jenis_Mesin, Hotline, Kapasitas_tangki, Berat_kendaraan, Jenis_Bahan_Bakar, Kapasitas_Penumpang, Panjang, Plat_Nomor, Jumlah_Lokomotif, Jumlah_Gerbong)"
                    + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        }
    },
    KAPAL {
        @Override
        public String toString() {
            return "INSERT INTO KAPAL (Kode_Kendaraan, Kode_Produsen, Kode_Pemilik, Nama, Kecepatan_Maksimum, Kapasitas_Muatan, Tahun_Pengadaan, Jenis_Mesin, Hotline, Kapasitas_tangki, Berat_kendaraan, Jenis_Bahan_Bakar, Kapasitas_Penumpang, Panjang, Jumlah_Geladak)"
                    + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        }
    },
    BANDARA {
        @Override
        public String toString() {
            return "INSERT INTO BANDARA (Kode_Tempat_Pemberhentian, Kode_Kota, Nama, Alamat, Kapasitas_Alat_Transportasi, Tahun_Operasi, Luas_Area, Kapasitas_Pengunjung, Nomor_Telepon, Email, Jumlah_Gate, Jumlah_Landasan, Klasifikasi_Bandara, Jumlah_Terminal, Jenis_Bandara)"
                    + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        }
    },
    HELIPORT {
        @Override
        public String toString() {
            return "INSERT INTO HELIPORT (Kode_Tempat_Pemberhentian, Kode_Kota, Nama, Alamat, Kapasitas_Alat_Transportasi, Tahun_Operasi, Luas_Area, Kapasitas_Pengunjung, Nomor_Telepon, Email, Jumlah_Helipad)"
                    + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        }
    },
    TERMINAL {
        @Override
        public String toString() {
            return "INSERT INTO TERMINAL (Kode_Tempat_Pemberhentian, Kode_Kota, Nama, Alamat, Kapasitas_Alat_Transportasi, Tahun_Operasi, Luas_Area, Kapasitas_Pengunjung, Nomor_Telepon, Email, Jumlah_Jalur, Klasifikasi)"
                    + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        }
    },
    STASIUN {
        @Override
        public String toString() {
            return "INSERT INTO STASIUN (Kode_Tempat_Pemberhentian, Kode_Kota, Nama, Alamat, Kapasitas_Alat_Transportasi, Tahun_Operasi, Luas_Area, Kapasitas_Pengunjung, Nomor_Telepon, Email, Jumlah_Jalur, Klasifikasi, Jumlah_Peron)"
                    + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        }
    },
    PELABUHAN {
        @Override
        public String toString() {
            return "INSERT INTO PELABUHAN (Kode_Tempat_Pemberhentian, Kode_Kota, Nama, Alamat, Kapasitas_Alat_Transportasi, Tahun_Operasi, Luas_Area, Kapasitas_Pengunjung, Nomor_Telepon, Email, Jumlah_Dermaga)"
                    + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        }
    },
    RUTE {
        @Override
        public String toString() {
            return "INSERT INTO RUTE (Kode_Rute, Kode_Tempat_Pemberhentian_Asal, Kode_Tempat_Pemberhentian_Tujuan, Harga, Jarak, Tanggal_Berangkat, Tanggal_Tiba, Waktu_Berangkat, Waktu_Tiba)"
                    + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        }
    },
    KARYAWAN {
        @Override
        public String toString() {
            return "INSERT INTO KARYAWAN (Kode_Karyawan, Kode_Kota, Nama, Alamat, Jenis_Kelamin, Tempat_Lahir, Tanggal_Lahir, Nomor_Telepon, Email)"
                    + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        }
    },
    CABANG_PRODUSEN {
        @Override
        public String toString() {
            return "INSERT INTO CABANG_PRODUSEN (Kode_Cabang_Produsen, Kode_Produsen, Kode_Kota, Alamat, Kapasitas_Produksi)"
                    + " VALUES (?, ?, ?, ?, ?)";
        }
    },
    MEMILIKI_FITUR {
        @Override
        public String toString() {
            return "INSERT INTO MEMILIKI_FITUR (Kode_Kendaraan, Kode_Fitur)"
                    + " VALUES (?, ?)";
        }
    },
    MEMILIKI_RUTE {
        @Override
        public String toString() {
            return "INSERT INTO MEMILIKI_RUTE (Kode_Kendaraan, Kode_Rute)"
                    + " VALUES (?, ?)";
        }
    },
    MEMILIKI_LAYANAN {
        @Override
        public String toString() {
            return "INSERT INTO MEMILIKI_LAYANAN (Kode_Tempat_Pemberhentian, Kode_Layanan)"
                    + " VALUES (?, ?)";
        }
    },
    MEMILIKI_KARYAWAN {
        @Override
        public String toString() {
            return "INSERT INTO MEMILIKI_KARYAWAN (Kode_Tempat_Pemberhentian, Kode_Produsen, Kode_Karyawan, Tanggal_Mulai_Bekerja)"
                    + " VALUES (?, ?, ?, ?)";
        }
    },
    MEMILIKI_FASILITAS {
        @Override
        public String toString() {
            return "INSERT INTO MEMILIKI_FASILITAS (Kode_Tempat_Pemberhentian, Kode_Kendaraan, Kode_Fasilitas)"
                    + " VALUES (?, ?, ?)";
        }
    };
}
