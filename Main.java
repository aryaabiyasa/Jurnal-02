import java.util.Collections;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ListBarang<Atk> Atkbarang = new ListBarang<Atk>();
        ListBarang<Bag> Bagbarang = new ListBarang<Bag>();

        Atkbarang.addItem(new Atk("A001", "Spidol", "Snowman", 10));
        Atkbarang.addItem(new Atk("A002", "pensil", "faber castel", 10));
        Atkbarang.addItem(new Atk("A003", "pulpen", "standar", 10));
        Atkbarang.addItem(new Atk("B001", "buku tulis", "oxford", 10));
        Atkbarang.addItem(new Atk("B002", "kertas", "gambar", 10));

        Bagbarang.addItem(new Bag("C001", "Kotak Pensil", "Bitcoin", 10));
        Bagbarang.addItem(new Bag("C002", "tas", "barbie", 10));
        Bagbarang.addItem(new Bag("C003", "Kotak Pensil", "joyko", 10));
        Bagbarang.addItem(new Bag("C004", "tas", "spiderman", 10));
        Bagbarang.addItem(new Bag("C005", "tas", "batman", 10));

        Atkbarang.sorting();
        for (int i = 0; i < Atkbarang.size(); i++) {
            System.out.println("Barang " + (i + 1) + " : ");
            System.out.println(" kode barang = " + Atkbarang.getIndex(i).getKodeBarang());
            System.out.println(" jenis barang = " + Atkbarang.getIndex(i).getJenisBarang());
            System.out.println(" Nama barang = " + Atkbarang.getIndex(i).getNamaBarang());
            System.out.println(" Stok barang = " + Atkbarang.getIndex(i).getStok());
        }
        for (int i = 0; i < Bagbarang.size(); i++) {
            System.out.println("Barang " + (i + 1) + (" : "));
            System.out.println(" kode barang = " + Bagbarang.getIndex(i).getKodeBarang());
            System.out.println(" jenis barang = " + Bagbarang.getIndex(i).getJenisBarang());
            System.out.println(" Nama barang = " + Bagbarang.getIndex(i).getNamaBarang());
            System.out.println(" Stok barang = " + Bagbarang.getIndex(i).getStok());
        }
    }
}