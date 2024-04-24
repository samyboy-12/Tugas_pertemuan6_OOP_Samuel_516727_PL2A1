import java.util.ArrayList;
import java.util.List;

class Toko {
    private Gudang gudangBarang;
    private List<Pembeli> antrian;
    public Toko() {
        gudangBarang = new Gudang();
        antrian = new ArrayList<>();
    }
    public Gudang getGudangBarang() {
        return gudangBarang;
    }

    public void tambahAntrian(Pembeli pembeli) {
        antrian.add(pembeli);
        System.out.println("berhasil menambah antrian");
    }

    public void selesaikanAntrian() {
        if (!antrian.isEmpty()) {
            Pembeli pembeli = antrian.remove(0);
            TipeBarang barangDibeli = pembeli.getBarangDibeli();
            int jumlahBarang = pembeli.getJumlahBarang();
            gudangBarang.buatBarang(barangDibeli, jumlahBarang); // Mengubah metode yang dipanggil menjadi buatBarang
            System.out.println("antrian terdepan berhasil diselesaikan");
        } else {
            System.out.println("antrian kosong");
        }
    }

    // Method untuk mengecek isi antrian
    public void cekIsiAntrian() {
        System.out.println("LIST ANTRIAN :");
        for (int i = 0; i < antrian.size(); i++) {
            Pembeli pembeli = antrian.get(i);
            System.out.println("antrian ke " + (i + 1) + ", nama : " + pembeli.getNama() + // Menambahkan getter untuk nama di kelas Pembeli
                    ", barang dibeli : " + pembeli.getBarangDibeli() +
                    ", jumlah barang dibeli : " + pembeli.getJumlahBarang());
        }
    }
}