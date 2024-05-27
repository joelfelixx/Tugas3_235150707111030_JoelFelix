package polymorfisme;
public class pegawaiharian extends pegawai {
    private double upahPerJam;
    private int totalJam;

    public pegawaiharian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    @Override
    public double gaji() {
        if (totalJam <= 40) {
            return upahPerJam * totalJam;
        } else {
            int jamNormal = 40;
            double gajiNormal = upahPerJam * jamNormal;
            int jamLembur = totalJam - jamNormal;
            return gajiNormal + (jamLembur * upahPerJam * 1.5);
        }
    }

    @Override
    public String toString() {
        return "Nama            : " + getNama() + 
               "\nNo. KTP         : " + getNoKTP() + 
               "\nJenis Pegawai   : Pegawai Harian" +
               "\nUpah per Jam    : Rp " + upahPerJam + 
               "\nTotal Jam       : " + totalJam +
               "\nGaji            : Rp " + gaji();
    }
}