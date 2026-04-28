package model;

public class Model3 {

    public static String getNamaMenu(int kode) {
        switch (kode) {
            case 1: return "Nasi Goreng";
            case 2: return "Mie Goreng";
            case 3: return "Teh";
            case 4: return "Kopi";
            default: return "-";
        }
    }

    public static int getHarga(int kode) {
        switch (kode) {
            case 1: return 15000;
            case 2: return 12000;
            case 3: return 5000;
            case 4: return 7000;
            default: return 0;
        }
    }

    public static int hitungTotal(int harga, int jumlah) {
        return harga * jumlah;
    }

    public static double hitungDiskon(int total) {
        if (total > 50000) {
            return total * 0.1; // diskon 10%
        }
        return 0;
    }

    public static double hitungPajak(double total) {
        return total * 0.1; // pajak 10%
    }
}
