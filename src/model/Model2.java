package model;

public class Model2 {

    public static int hitungStok(int[] data, int kategori) {
        int index = 0;
        int layer = 1;
        int total = 0;

        while (index < data.length) {
            int jumlahElemen = layer;

            if (layer == kategori) {
                for (int i = 0; i < jumlahElemen && index < data.length; i++) {
                    total += data[index];
                    index++;
                }
                break;
            } else {
                index += jumlahElemen;
            }

            layer++;
        }

        return total;
    }
}
