public class Order {
    public String nama, noHp, alamat, barang;
    public Double panjang, tinggi;
    public int banyak;

    public Order(String isNama, String isNohp, String isAlamat, String isBarang, Double isPanjang, Double isTinggi, int isBanyak){
        this.nama = isNama;
        this.noHp = isNohp;
        this.alamat = isAlamat;
        this.barang = isBarang;
        this.panjang = isPanjang;
        this.tinggi = isTinggi;
        this.banyak = isBanyak;
    };

    public void isDisplay(){
        System.out.println("=====================================");
        System.out.println("| Nama Pemesan      : " + this.nama);
        System.out.println("| No HP Pemesan     : " + this.noHp);
        System.out.println("| Alamat Pemesan    : " + this.alamat);
        System.out.println("| Barang Pesanan    : " + this.barang);
        System.out.println("| Panjang Barang    : " + this.panjang);
        System.out.println("| Tinggi Barang     : " + this.tinggi);
        System.out.println("| Banyak Barang     : " + this.banyak);
        System.out.println("=====================================");
    }

    public void isDisplayNama() {
        System.out.println(" - " + this.nama);
    }

    public void setNama(String isNama) {        
        this.nama = isNama;
    }
    public void setNoHp(String isNohp) {
        this.noHp = isNohp;
    }
    public void setAlamat(String isAlamat) {
        this.alamat = isAlamat;
    }
    public void setBarang(String isBarang) {
        this.barang = isBarang;
    }
    public void setPanjang(Double isPanjang) {
        this.panjang = isPanjang;
    }
    public void setTinggi(Double isTinggi) {
        this.tinggi = isTinggi;
    }
    public void setBanyak(int isBanyak) {
        this.banyak = isBanyak;
    }
}