import java.util.Scanner;

public class Main {

    public static tokoGame tokoGame = new tokoGame();
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        inittokogame();
        String lanjut = "n";

        do {
            int pilihan = pilihMenu();
            System.out.println("Anda memilih opsi " + pilihan);

            if (pilihan == 1) {
                tambahGame();
            } else if (pilihan == 2) {
                beliGame();
            } else if (pilihan == 3) {
                daftarPelanggan();
            } else {
                System.out.println("Tidak ada opsi " + pilihan);
            }

            System.out.println("Lanjut? (y/n)");
            lanjut = scan.next();
        } while (lanjut.equals("y"));
    }

    public static void inittokogame() {
        game game1 = new game("Final Fantasy", 1200000);
        game game2 = new game("Gran Turismo", 1000000);
        game game3 = new game("Call of Duty", 1500000);
        tokoGame.games.add(game1);
        tokoGame.games.add(game2);
        tokoGame.games.add(game3);
    }

    public static void tampilkanKursi() {
        System.out.println("--------------Daftar Game--------------\n");
        System.out.println("Kode Barang" + "\tNama" + "\t\tHarga\n");
        for (int i = 0; i < tokoGame.games.size(); i++) {
            System.out.println("Game " + (i + 1) + "\t\t" + tokoGame.games.get(i).getNama() + "\t\t" + tokoGame.games.get(i).getHarga());
        }
    }

    public static int pilihMenu() {
        tampilkanKursi();
        System.out.println("\nOpsi :");
        System.out.println("1. Tambah Game");
        System.out.println("2. Pembelian Game");
        System.out.println("3. Daftar Pelanggan");
        System.out.println("");
        System.out.print("Masukkan Opsi: ");
        int pilih = 0;

        try {
            pilih = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Inputan salah, mohon masukkan angka");
        }

        return pilih;
    }

    public static void tambahGame() {
        game game = new game();

        System.out.println("Masukkan nama game dan harga game");
        scan.nextLine();
        System.out.println("Nama Game : ");
        String nama = scan.nextLine();
        game.setNama(nama);
        
        System.out.println("harga : ");
        int harga = scan.nextInt();
        game.setHarga(harga);

        tokoGame.addGames(game);
    }

    public static void beliGame(){
        System.out.println("Masukkan pembeli beserta game yang dibeli");

        pelanggan pelanggan = new pelanggan();
        game game = new game();

        scan.nextLine();
        System.out.println("Nama Pelanggan : ");
        String namap = scan.nextLine();
        pelanggan.setNama(namap);

        System.out.println("Nama Game : ");
        String namag = scan.nextLine();
        game.setNama(namag);

        tokoGame.pelanggans.add(pelanggan);
        tokoGame.buyingGame(namap, namag);
    }

    public static void daftarPelanggan() {
        if (tokoGame.pelanggans.size() == 0) {
            System.out.println("Belum ada yang membeli game saat ini");
        } else {
            System.out.println("Berikut merupakan daftar pelanggan toko game Jaya Yes :");
            System.out.println("--------------Daftar Pelanggan--------------\n");
            System.out.println("No. " + "\tNama Pelanggan" + "\t\tNama Game" + "\t\tHarga Game\n");
        for (int i = 0; i < tokoGame.pelanggans.size(); i++) {
            System.out.println((i + 1) + "\t\t" + tokoGame.pelanggans.get(i).getNama() + "\t\t" + tokoGame.buyedGames.get(i).getNama() + "\t\t" +tokoGame.buyedGames.get(i).getHarga());

        }
    }
    }
}