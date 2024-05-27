package polymorfisme;

public class sales extends pegawai {
    private int penjualan;
    private double komisi;

    public sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    public double getKomisi() {
        return komisi;
    }

    @Override
    public double gaji() {
        return penjualan * komisi;
    }

    @Override
    public String toString() {
        return "Nama            : " + getNama() + 
               "\nNo. KTP         : " + getNoKTP() + 
               "\nJenis Pegawai   : Sales" +
               "\nTotal Penjualan : " + penjualan +
               "\nKomisi          : Rp " + komisi +
               "\nGaji            : Rp " + gaji();
    }
}
