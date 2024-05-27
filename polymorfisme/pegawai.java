package polymorfisme;
public class pegawai {
    private String nama;
    private String noKTP;

    public pegawai(String nama, String noKTP) {
        this.nama = nama;
        this.noKTP = noKTP;
    }

    public String getNama() {
        return nama;
    }

    public String getNoKTP() {
        return noKTP;
    }

    @Override
    public String toString() {
        return "Nama          : " + getNama() + 
               "\nNo. KTP       : " + getNoKTP();
    }

    public double gaji() {
        return 0;
    }
}