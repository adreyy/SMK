package cobafungsion;
/**
 *
 * @author audrey
 */
import java.util.Scanner;
public class Cobafungsion {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan = 2;
        
        do{
            System.out.println("Pilih Role");
            System.out.println("1. Penyewa");
            System.out.println("2. Admin");
            
            System.out.print("Masukan Pilihan : ");
            pilihan = input.nextInt();
            switch(pilihan){
                case 1 : Sewa();
                break;
                
                case 2 : Admin();
                break;
            }
        } while(pilihan !=2);
        
    }
        
    private static void Sewa(){
        Scanner input = new Scanner(System.in);
        double harga = 0;
        double bayar;
        var jns = "";

//        Menu
        System.out.println("===HOTEL PBO===");
        System.out.println("Jenis Kamar :");
        System.out.println("1. Single");
        System.out.println("2. Double");
        System.out.println("3. Suite");
        System.out.println("===============");
        
//        Cek Kamar
        System.out.print("Pilih Jenis Kamar untuk Mengecek Harga Kamar Permalam : ");

        var cek_kamar = input.nextLine();
        switch (cek_kamar){
            case "single","Single","1" -> {
                System.out.println("=========================================================");
                System.out.println("Jenis Kamar :");
                System.out.print("Single         ");
                System.out.println("Rp. 175.000,-/Malam");
                System.out.println("Kamar Terisi Penuh!!");
            }
            
            case "double","Double","2" -> {                
                System.out.println("=========================================================");
                System.out.println("Jenis Kamar :");
                System.out.print("Double         ");
                System.out.println("Rp. 225.000,-/Malam");
            }
            
            case "suite","Suite","3" -> {                
                System.out.println("=========================================================");
                System.out.println("Jenis Kamar :");
                System.out.print("Suite          ");
                System.out.println("Rp. 300.000,-/Malam");
            }

            default -> {                
                System.out.println("=========================================================");
                System.out.println("Jenis Kamar Tidak Ada");
                System.exit(0);
            }
        }
        
//        Pemesanan Kamar
        System.out.println("=========================================================");
        System.out.print("Apakah anda ingin memesan kamar ? ");
        System.out.println("ya/tidak");
        var memesan = input.nextLine();
       
        System.out.println("=========================================================");

        var jawaban = memesan;
        
        if(jawaban.equalsIgnoreCase("ya")){
            System.out.println("Pengisian Data Penyewa :");
        }
        else if(jawaban.equalsIgnoreCase("pesan")){
            System.out.println("Pengisian Data Penyewa :");
        }
        else{
            System.exit(0);
        }    
        
//        Data Penyewa    
        Scanner data = new Scanner(System.in);
                        
        System.out.print("No KTP/SIM    : ");
        var ktpsim = data.nextLine();
        System.out.print("Nama          : ");
        var nama = data.nextLine();
        System.out.print("Alamat        : ");
        var alamat = data.nextLine();
        System.out.print("Nomor Telepon : ");
        int tlp = data.nextInt();
        System.out.println("=========================================================");
        
//        Pemilihan Waktu
        Scanner waktu = new Scanner(System.in);

        System.out.print("Pilih Tanggal Chekin : ");
        var tgl = waktu.next();
        
        System.out.print("Berapa Malam : ");
        int malam = waktu.nextInt();
        
        System.out.println("=========================================================");
        
//        Pemilihan jenis kamar yang akan di pesan
        System.out.print("Pilih Jenis Kamar : ");
        var kamar = input.nextLine();
        
        if(kamar.equalsIgnoreCase("1")){
            System.out.println("Kamar Tidak Tersedia");
            System.exit(0);
        }
        else if(kamar.equalsIgnoreCase("2")){
            System.out.println("Kamar Tersedia");
            jns = "Double";
            harga = 225000;
        }
        else if(kamar.equalsIgnoreCase("3")){
            System.out.println("Kamar Tersedia");
            jns = "Suite";
            harga = 300000;
        }
        else{
            System.exit(0);
        }
        
        System.out.println("=========================================================");
        
//        Transaksi Akhir
        System.out.println("===================Transaksi Pemesanan==================="); 
        System.out.println("=========================================================");
        
        double total = malam*harga;

        System.out.println("Tanggal Pemesanan "+tgl);
        System.out.println("Nama Pemesan      : "+nama);
        System.out.println("KTP/SIM           : "+ktpsim);
        System.out.println("Nomor Telepon     : "+tlp);
        System.out.println("Alamat Pemesan    : "+alamat);
        System.out.println("================================================");
        System.out.println("Jenis Kamar       : "+jns+"  "+malam+" Malam");
        System.out.println("Total                    "+total);
        System.out.print  ("Bayar                    ");
        bayar = input.nextDouble();
        
        double kembalian = bayar-total;
        
        if(bayar >= total){
            System.out.println("Kembalian                "+kembalian);
            System.out.println("===================Transaksi Berhasil==================="); 
        }
        else{
            System.out.println("Kembalian               "+kembalian);
            System.out.println("===================Transaksi Gagal===================");  
        }
        
    }
    
    private static void Admin(){
        System.out.println("Ini Admin");
    }
    
}
