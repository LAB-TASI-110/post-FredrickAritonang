package model;

public class Model1 {

    public static int getOngkir(String kode) {
        switch (kode) {
            case "MDN": return 8000;
            case "BLG": return 5000;
            case "JKT": return 12000;
            case "SBY": return 13000;
            default: return 0;
        }
    }

    public static String getKategori(String kode) {
        if (kode.equals("JKT") || kode.equals("SBY")) {
            return "Luar Pulau";
        } else {
            return "Dalam Pulau";
        }
    }

    public static String getNamaKota(String kode) {
        switch (kode) {
            case "MDN": return "Medan";
            case "BLG": return "Balige";
            case "JKT": return "Jakarta";
            case "SBY": return "Surabaya";
            default: return "-";
        }
    }
}
