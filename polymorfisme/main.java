package polymorfisme;

class main {
    public static void main(String[] args) {
        pegawaitetap pegawaiTetap = new pegawaitetap("Joel Felix", "3507281271283", 5000000);
        pegawaiharian pegawaiHarian = new pegawaiharian("Nia", "3507288727271", 10000, 50);
        sales sales = new sales("Sandi", "3507281271283", 500, 5000);

        System.out.println(pegawaiTetap);
        System.out.println();

        System.out.println(pegawaiHarian);
        System.out.println();

        System.out.println(sales);
    }
}

