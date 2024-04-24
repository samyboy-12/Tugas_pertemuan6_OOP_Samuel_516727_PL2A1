class Pembeli {
    private String nama;
    private TipeBarang barangDibeli;
    private int jumlahBarang;

    public Pembeli(String nama, TipeBarang barangDibeli, int jumlahBarang) {
        this.nama = nama;
        this.barangDibeli = barangDibeli;
        this.jumlahBarang = jumlahBarang;
    }

    public String getNama() {
        return nama;
    }

    public TipeBarang getBarangDibeli() {
        return barangDibeli;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    @Override
    public String toString() {
        return "Antrian ke 1, nama: " + nama + ", barang dibeli: " + barangDibeli.toString() + ", jumlah barang dibeli: " + jumlahBarang;
    }
}