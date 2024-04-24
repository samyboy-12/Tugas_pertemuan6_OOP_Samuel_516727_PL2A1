import java.util.HashMap;
import java.util.Map;

class Gudang {
    private Map<String, Integer> stokBahan = new HashMap<>();
    private Map<TipeBarang, Integer> stokBarang = new HashMap<>();

    public Gudang() {
        stokBahan.put("KAYU", 0);
        stokBahan.put("BAUT", 0);
        stokBahan.put("CAT", 0);
        stokBarang.put(TipeBarang.KURSI, 0);
        stokBarang.put(TipeBarang.MEJA, 0);
        stokBarang.put(TipeBarang.LEMARI, 0);
    }

    public void tambahBahan(String jenis, int jumlah) {
        stokBahan.put(jenis, stokBahan.getOrDefault(jenis, 0) + jumlah);
        System.out.println(jumlah + " " + jenis + " berhasil ditambahkan ke gudang");
    }

    public void buatBarang(TipeBarang barang, int jumlah) {
        int kayuNeeded = 0, bautNeeded = 0, catNeeded = 0;
        switch (barang) {
            case KURSI:
                kayuNeeded = 2 * jumlah;
                bautNeeded = 10 * jumlah;
                catNeeded = jumlah;
                break;
            case MEJA:
                kayuNeeded = 3 * jumlah;
                bautNeeded = 20 * jumlah;
                catNeeded = 2 * jumlah;
                break;
            case LEMARI:
                kayuNeeded = 5 * jumlah;
                bautNeeded = 30 * jumlah;
                catNeeded = 3 * jumlah;
                break;
        }

        if (stokBahan.get("KAYU") >= kayuNeeded && stokBahan.get("BAUT") >= bautNeeded && stokBahan.get("CAT") >= catNeeded) {
            stokBarang.put(barang, stokBarang.get(barang) + jumlah);
            stokBahan.put("KAYU", stokBahan.get("KAYU") - kayuNeeded);
            stokBahan.put("BAUT", stokBahan.get("BAUT") - bautNeeded);
            stokBahan.put("CAT", stokBahan.get("CAT") - catNeeded);
            System.out.println(jumlah + " " + barang.toString() + " berhasil ditambahkan ke gudang");
        } else {
            System.out.println(jumlah + " " + barang.toString() + " tidak berhasil ditambahkan ke gudang, bahan tidak cukup");
        }
    }

    public void cekStokBahan() {
        System.out.println("STOK BAHAN:");
        for (Map.Entry<String, Integer> entry : stokBahan.entrySet()) {
            System.out.println("Jumlah " + entry.getKey() + ", saat ini adalah: " + entry.getValue() + " buah");
        }
    }

    public int getStokBarang(TipeBarang barang) {
        return stokBarang.getOrDefault(barang, 0);
    }

    public void cekIsiGudang() {
        System.out.println("ISI GUDANG:");
        for (Map.Entry<TipeBarang, Integer> entry : stokBarang.entrySet()) {
            System.out.println("Jumlah " + entry.getKey().toString() + ", saat ini adalah: " + entry.getValue() + " buah");
        }
    }
}