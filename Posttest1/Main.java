//Library Import
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

public class Main{
    //Static Declaration for Input and ArrayList
    static InputStreamReader masuk = new InputStreamReader(System.in);
    static BufferedReader masukan = new BufferedReader(masuk);
    static ArrayList<Order> pesan = new ArrayList<>();

    //Main Class
    public static void main(String[] args) throws NumberFormatException, IOException {
        Boolean loop = true;
        int pilihan = 0;
        
        while(loop){
            while (true) {
                try {
                    ClearScreen();
                    System.out.println("|=================================|");
                    System.out.println("|PROGRAM PEMESANAN KUSEN DAN MEBEL|");
                    System.out.println("|           SINAR PUTRA           |");
                    System.out.println("|=================================|");
                    System.out.println("|  [1]  Lihat Daftar Pesanan      |");
                    System.out.println("|  [2]  Tambah Daftar Pesanan     |");
                    System.out.println("|  [3]  Ubah Daftar Pesanan       |");
                    System.out.println("|  [4]  Hapus Daftar Pesanan      |");
                    System.out.println("|  [0]  Keluar                    |");
                    System.out.println("|=================================|");
                    System.out.print("   >> ");
                    pilihan = Integer.parseInt(masukan.readLine());
                    break;
                } catch (Exception e) {
                    ClearScreen();
                    System.out.println(" Masukan Input dengan Benar ! ! !");
                    Wait(1000);
                }
            }
            
    
            switch (pilihan) {
                case 1:
                    ClearScreen();
                    display();
                    break;
                case 2:
                    ClearScreen();
                    isAdd();
                    break;
                case 3:
                    ClearScreen();
                    isChange();
                    break;
                case 4:
                    isDelete();
                    break;
                case 0:
                    ClearScreen();
                    System.out.println(" Adios Amigos~");
                    loop = false;
                    break;
                default:
                    ClearScreen();
                    System.out.println("- Inputan Salah -");
                    Wait(1000);
                    break;
            }
        }
    }

    //CRUD Method/Function
    public static void display() throws IOException{
        int isiArray = pesan.size();
        if (isiArray == 0) {
            System.out.println(" Data Pesanan Masih Kosong ");
        } else{
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("|         Nama            |       No Hp       |           Alamat           |        Barang        |     Panjang     |     Tinggi     |     Banyak     |");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
            for (int i = 0; i < isiArray; i++) {
                pesan.get(i).isDisplay();
            }
        }
        System.out.println("Tekan enter untuk melanjutkan"); masukan.readLine();
    }

    public static void isAdd() throws NumberFormatException, IOException{
        String nama, noHp, alamat, barang;
        Double panjang, tinggi;
        int banyak;
        ClearScreen();

        System.out.println("================================================================");
        System.out.println("|                      Tambah Data Pesanan                     |");
        System.out.println("================================================================");
        System.out.print(" Nama Pemesan           : "); nama = masukan.readLine();
        System.out.print(" No Hp Pemesan          : "); noHp = masukan.readLine();
        System.out.print(" Alamat Pemesan         : "); alamat = masukan.readLine();
        System.out.print(" Nama Barang Pesanan    : "); barang = masukan.readLine();
        System.out.print(" Panjang Barang         : "); panjang = Double.parseDouble(masukan.readLine());
        System.out.print(" Tinggi Barang          : "); tinggi = Double.parseDouble(masukan.readLine());
        System.out.print(" Banyak Barang          : "); banyak = Integer.parseInt(masukan.readLine());
        System.out.println("================================================================");

        Order addOrder = new Order(nama, noHp, alamat, barang, panjang, tinggi, banyak);
        pesan.add(addOrder);
        System.out.println("                   Pesanan Berhasil Ditambahkan                   ");
        System.out.println("================================================================");
        Wait(1000);
    }

    public static void isChange() throws NumberFormatException, IOException{
        System.out.println("================================================================");
        System.out.println("|                       Ubah Data Pesanan                      |");
        System.out.println("================================================================");
        System.out.print("  Masukan Nama Pemesan : "); String cariNama = masukan.readLine();
        System.out.println("================================================================");
        for (Order order : pesan) {
            if (order.nama.equals(cariNama)) {
                System.out.println("  1. Ubah Nama\t\t\t  2. Ubah No Hp\n  3. Ubah Alamat\t\t  4. Ubah Barang\n  5. Ubah Panjang\t\t  6. Ubah Tinggi\n  7. Ubah Banyak Barang\t\t  0. Kembali ke menu Sebelumnya");
                System.out.println("================================================================");
                System.out.print("  >> "); int pilihan = Integer.parseInt(masukan.readLine());
                
                switch (pilihan) {
                    case 1:
                        System.out.print("  Masukan Nama Pemesan Yang Baru : "); String newName = masukan.readLine();
                        order.setNama(newName);
                        System.out.println("\n  Nama Berhasil Diubah!");
                        System.out.println("\n  Tekan Enter untuk Kembali!");masukan.readLine();
                        break;
                    case 2:
                        System.out.print("  Masukan No Hp Yang Baru : "); String newNohp = masukan.readLine();
                        order.setNoHp(newNohp);
                        System.out.println("\n  No Hp Berhasil Diubah!");
                        System.out.println("\n  Tekan Enter untuk Kembali!");masukan.readLine();
                        break;
                    case 3:
                        System.out.print("  Masukan Alamat Yang Baru : "); String newAlamat = masukan.readLine();
                        order.setAlamat(newAlamat);
                        System.out.println("\n  Alamat Berhasil Diubah!");
                        System.out.println("\n  Tekan Enter untuk Kembali!");masukan.readLine();
                        break;
                    case 4:
                        System.out.print("  Masukan Nama barang Yang Baru : "); String newBarang = masukan.readLine();
                        order.setBarang(newBarang);
                        System.out.println("\n  Nama barang Berhasil Diubah!");
                        System.out.println("\n  Tekan Enter untuk Kembali!");masukan.readLine();
                        break;
                    case 5:
                        System.out.print("  Masukan Panjang Barang Yang Baru : "); Double newPanjang = Double.parseDouble(masukan.readLine());
                        order.setPanjang(newPanjang);
                        System.out.println("\n  Panjang Barang Berhasil Diubah!");
                        System.out.println("\n  Tekan Enter untuk Kembali!");masukan.readLine();
                        break;
                    case 6:
                        System.out.print("  Masukan Tinggi Barang Yang Baru : "); Double newTinggi = Double.parseDouble(masukan.readLine());
                        order.setTinggi(newTinggi);
                        System.out.println("\n  Tinggi Barang Berhasil Diubah!");
                        System.out.println("\n  Tekan Enter untuk Kembali!");masukan.readLine();
                        break;
                    case 7:
                        System.out.print("  Masukan Banyak Barang Yang Baru : "); int newBanyak = Integer.parseInt(masukan.readLine());
                        order.setBanyak(newBanyak);
                        System.out.println("\n  Banyak Barang Berhasil Diubah!");
                        System.out.println("\n  Tekan Enter untuk Kembali!");masukan.readLine();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("  Inputan Tidak Tersedia ");
                        break;
                }
            }
        }

    }

    public static void isDelete() throws IOException{
        System.out.println("================================================================");
        System.out.println("|                       Ubah Data Pesanan                      |");
        System.out.println("================================================================");
        System.out.print("  Masukan Nama Pemesan : "); String cariNama = masukan.readLine();
        System.out.println("================================================================");
        for (int i = 0; i < pesan.size(); i++) {
            if (pesan.get(i).nama.equals(cariNama)) {
                pesan.remove(i);
                System.out.println("Pesanan Telah Dihapus"); masukan.readLine();
            }
    }
}

    //Some Other Methods/Function
    public static void Wait(int lama){
        try{
            Thread.sleep(lama);
        }
        catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }

    public static void ClearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else{
                System.out.print("\033\143");
            }
        } catch (Exception ex) {
            System.err.println("Gagal Membersihkan");
        }
    }
}