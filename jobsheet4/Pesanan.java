import java.util.ArrayList;

public class Pesanan {
    private String idPesanan;
    private Pelanggan pelanggan;  
    private ArrayList<Item> daftarItem;  

    public Pesanan(String idPesanan, Pelanggan pelanggan) {
        this.idPesanan = idPesanan;
        this.pelanggan = pelanggan;
        this.daftarItem = new ArrayList<>(); 
    }

    public void tambahItem(Item item) {
        daftarItem.add(item);
    }

    public int hitungTotal() {
        int total = 0;
        for (Item item : daftarItem) {
            total += item.getSubtotal();
        }
        return total;
    }

    public String getInfo() {
        String info = "ID Pesanan: " + idPesanan + 
                      ", Pelanggan: " + pelanggan.getNama() + "\n";

        if (daftarItem.isEmpty()) {
            info += "Belum ada item dalam pesanan.";
        } else {
            info += "Daftar Item:\n";
            for (Item item : daftarItem) {
                info += "- " + item.getInfo() + "\n";
            }
            info += "Total Harga: Rp" + hitungTotal();
        }
        return info;
    }
}
