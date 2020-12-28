package data;

import entity.Kota;
import java.util.ArrayList;

public class DataDummy {
    private static String[] Kode_Kota = {
            "KT-1",
            "KT-2",
            "KT-3",
            "KT-4",
            "KT-5",
            "KT-6",
            "KT-7",
            "KT-8",
            "KT-9",
            "KT-10"
    };

    private static String[] Nama_Kota = {
            "Medan",
            "Lampung",
            "Banten",
            "Jakarta",
            "Bandung",
            "Semarang",
            "Yogyakarta",
            "Surabaya",
            "Bali",
            "Jayapura"
    };

    private static int[] Luas_Wilayah_Kota = {
            265,
            35375,
            9663,
            661,
            167,
            373,
            3186,
            5780,
            935
    };

    public static ArrayList<Kota> getListKota() {
        ArrayList<Kota> list = new ArrayList<>();
        for (int i = 0; i < Kode_Kota.length; i++) {
            Kota kota = new Kota(
                    Kode_Kota[i],
                    Nama_Kota[i],
                    Luas_Wilayah_Kota[i]
            );
            list.add(kota);
        }
        return list;
    }
}
