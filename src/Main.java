import java.util.*;
enum TipeBarang {
    KURSI,
    MEJA,
    LEMARI
}
public class Main {
    public static void main(String[] args) {
        Toko mebel1 = new Toko();
        mebel1.getGudangBarang().tambahBahan("KAYU", 20);
        mebel1.getGudangBarang().tambahBahan("BAUT", 100);
        mebel1.getGudangBarang().tambahBahan("CAT", 15);
        mebel1.getGudangBarang().buatBarang(TipeBarang.KURSI, 3);
        mebel1.getGudangBarang().cekStokBahan();
        mebel1.getGudangBarang().buatBarang(TipeBarang.KURSI, 5);
        mebel1.getGudangBarang().buatBarang(TipeBarang.MEJA, 5);
        mebel1.getGudangBarang().tambahBahan("KAYU", 20);
        mebel1.getGudangBarang().tambahBahan("BAUT", 100);
        mebel1.getGudangBarang().tambahBahan("CAT", 15);
        mebel1.getGudangBarang().cekStokBahan();
        mebel1.getGudangBarang().buatBarang(TipeBarang.KURSI, 5);
        mebel1.getGudangBarang().cekIsiGudang();
        Pembeli pembeli1 = new Pembeli("hanif", TipeBarang.KURSI, 10);
        Pembeli pembeli2 = new Pembeli("muflih", TipeBarang.MEJA, 5);
        Pembeli pembeli3 = new Pembeli("fabih", TipeBarang.LEMARI, 3);
        mebel1.tambahAntrian(pembeli1);
        mebel1.tambahAntrian(pembeli2);
        mebel1.tambahAntrian(pembeli3);
        mebel1.cekIsiAntrian();
        mebel1.selesaikanAntrian();
        mebel1.cekIsiAntrian();
        mebel1.getGudangBarang().cekIsiGudang();
    }
}