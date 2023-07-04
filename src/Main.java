import java.util.Scanner;

public class Main {

    public static tokoGame tokoGame = new tokoGame();
    public static Scanner scan = new Scanner(System.in);
    public static noticeMenu pemberitahuan = new noticeMenu();
    public static warningNotice peringatan = new warningNotice();

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        inittokogame();
        String lanjut = "n";
        pemberitahuan.opening();
        do {
            int pilihan = pilihMenu();
            System.out.println("Anda memilih opsi " + pilihan + "...");
            System.out.println("");

            if (pilihan == 1) {
                tambahGame();
            } else if (pilihan == 2) {
                updateGame();
            } else if (pilihan == 3) {
                deletegame();
            } else if (pilihan == 4) {
                beliGame();
            } else if (pilihan == 5) {
                daftarPelanggan();
            } else {
                System.out.println("Tidak ada opsi " + pilihan);
            }

            System.out.println("");
            System.out.println("Lanjut? (ketik y untuk lanjut)");
            lanjut = scan.next();
        } while (lanjut.equals("y"));
    }

    public static void inittokogame() {
        game game1 = new game("Final Fantasy", 120000);
        game game2 = new game("Gran Turismo", 100000);
        game game3 = new game("Call of Duty", 150000);
        pelanggan pelanggan1 = new pelanggan("asep");
        tokoGame.pelanggans.add(pelanggan1);
        tokoGame.games.add(game1);
        tokoGame.games.add(game2);
        tokoGame.games.add(game3);
    }

    public static void tampilkanMenu() {
        System.out.println("--------------Daftar Game--------------\n");
        System.out.println("Kode Game" + "\tNama" + "\t\t\tHarga\n");
        for (int i = 0; i < tokoGame.games.size(); i++) {
            System.out.println("Game " + (i + 1) + "\t\t" + tokoGame.games.get(i).getNama() + "\t\t" + tokoGame.games.get(i).getHarga());
        }
    }

    public static int pilihMenu() {
        tampilkanMenu();
        System.out.println("\nOpsi :");
        System.out.println("1. Tambah Game");
        System.out.println("2. Ganti Game");
        System.out.println("3. Hapus Game");
        System.out.println("4. Pembelian Game");
        System.out.println("5. Daftar Pelanggan");
        System.out.println(tokoGame.pelanggans.get(0).getNama());
        System.out.println("");
        System.out.print("Masukkan Opsi: ");

        int pilih = 0;
        try {
            pilih = scan.nextInt();
        } catch (Exception e) {
            peringatan.warning("Salah input");
        }
        return pilih;
    }

    public static void tambahGame() {
        game game = new game();

        pemberitahuan.notice();

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

        pemberitahuan.notice("2");

        System.out.println("Masukkan nama pelanggan beserta game yang dibeli");

        pelanggan pelanggan = new pelanggan();
        game game = new game();

        scan.nextLine();
        System.out.println("Nama Pelanggan : ");
        String namap = scan.nextLine();
        pelanggan.setNama(namap);

        System.out.println("Nama Game : ");
        String namag = scan.nextLine();
        game.setNama(namag);

        tokoGame.buyingGame(namap, namag);
    }

    public static void daftarPelanggan() {

        pemberitahuan.notice(3);

        if (tokoGame.pelanggans.size() == 0) {
            peringatan.warning();
        } else {
            System.out.println("Berikut merupakan daftar pelanggan toko game Jaya Yes :");
            System.out.println("------------------Daftar Pelanggan------------------\n");
            System.out.println("No. " + "\tNama Pelanggan" + "\t\tNama Game" + "\t\tHarga Game");
        for (int i = 0; i < tokoGame.pelanggans.size(); i++) {
            System.out.println((i + 1) + "\t\t" + tokoGame.pelanggans.get(i).getNama() + "\t\t" + tokoGame.buyedGames.get(i).getNama() + "\t\t" +tokoGame.buyedGames.get(i).getHarga());

        }
    }
    }

    public static void deletegame() {
        pemberitahuan.noticeDelet();
        System.out.println("apakah anda yakin ingin menghapus game? (ketik 1 untuk konfirmasi)");
        System.out.print("Jawab : ");
        int jawab = scan.nextInt();

        if (jawab == 1) {
            System.out.println("Silakan masukkan nomor yang tertera pada daftar game yang ingin di hapus..");
            System.out.print("Game no. : ");
            int a = scan.nextInt();
            if (a <= tokoGame.games.size()) {
                System.out.println("Menghapus game " + tokoGame.games.get(a - 1).getNama() + " dengan harga " + tokoGame.games.get(a - 1).getHarga() + " Rupiah...");
                tokoGame.games.remove(a - 1);
                System.out.println("Game berhasil dihapus.");
            } else {
                System.out.println("Game memang tidak ada");
            }
        } else {
            System.out.println("Keluar dari menu delete...");
            System.out.println("Beralih ke menu utama.");
        }
    }

    public static void updateGame() {
        pemberitahuan.noticeUpdate();
        System.out.println("apakah anda yakin ingin mengganti game? (ketik 1 untuk konfirmasi)");
        System.out.print("Jawab : ");
        int jawab = scan.nextInt();

        if (jawab == 1) {
            System.out.println("Silakan masukkan nomor yang tertera pada daftar game yang ingin di ganti..");
            System.out.print("Game no. : ");
            int a = scan.nextInt();

            if (a <= tokoGame.games.size()) {
                System.out.println("Mengganti game " + tokoGame.games.get(a - 1).getNama() + " seharga " + tokoGame.games.get(a - 1).getHarga() + " Rupiah...");
                System.out.println("Masukkan nama game dan harga game");

                scan.nextLine();
                System.out.print("Nama game : ");
                String namag = scan.nextLine();

                System.out.print("harga : ");
                int harga = scan.nextInt();
                System.out.println("");
                game game = new game(namag, harga);

                if (!tokoGame.isGameExist(game.getNama())) {
                    tokoGame.games.set(a - 1, game);
                    System.out.println("Game berhasil diganti");
                } else {
                    System.out.println("Game sudah ada");
                }
            } else {
                System.out.println("Game tidak ada");
            }
        } else {
            System.out.println("Keluar dari menu delete...");
            System.out.println("Beralih ke menu utama.");        }
    }

}