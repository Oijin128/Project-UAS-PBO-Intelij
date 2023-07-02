import java.util.ArrayList;

public class tokoGame {
    public static ArrayList<game> games = new ArrayList<game>();
    public ArrayList<game> buyedGames = new ArrayList<game>();
    public ArrayList<pelanggan> pelanggans = new ArrayList<pelanggan>();

    public void addPelanggan(pelanggan pelanggan) {
        this.pelanggans.add(pelanggan);
    }

    public void addGames(game game) {
        String namap;
        namap = game.getNama();
        int harga = game.getHarga();
        this.games.add(game);
    }

    public void buyGame(pelanggan pelanggan, game game) {
        String namap = pelanggan.getNama();
        String namag = game.getNama();
        int harga = game.getHarga();
        this.pelanggans.add(pelanggan);
        this.buyedGames.add(game);
    }

    private game getGamebyname(String nama) {
        for (game game : this.games) {
            if (game.getNama().equals(nama)) {
                return game;
            }
        }
        return null;
    }

}

