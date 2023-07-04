import java.util.ArrayList;

public class tokoGame {
    public static ArrayList<game> games = new ArrayList<game>();
    public ArrayList<game> buyedGames = new ArrayList<game>();
    public ArrayList<pelanggan> pelanggans = new ArrayList<pelanggan>();

    public void addPelanggan(pelanggan pelanggan) {
        this.pelanggans.add(pelanggan);
    }

    public void addGames(game game) {
        if (!isGameExist(game.getNama())) {
            this.games.add(game);
        } else {
            System.out.println("Game sudah ada");
        }
    }

    public void buyingGame(String namap, String namag) {
        game game = this.getNameGame(namag);
        pelanggan pelanggan = this.getPelangganName(namap);
        if (game == null) {
            System.out.println("game tidak ditemukan");
        } else if (pelanggan == null) {
            System.out.println("pelanggan tidak ditemukan");
        } else {
            this.pelanggans.add(pelanggan);
            this.buyedGames.add(game);
        }
    }

    private game getNameGame(String nama) {
        for (game game : this.games) {
            if (game.getNama().equals(nama)) {
                return game;
            }
        }
        return null;
    }

    private pelanggan getPelangganName(String nama) {
        for (pelanggan pelanggan : this.pelanggans) {
                return pelanggan;
        }
        return null;
    }

    public Boolean isGameExist(String nama) {
        Boolean isExist = false;
        for (game game : this.games) {
            if (game.getNama().equals(nama)) {
                isExist = true;
            }
        }
        return isExist;
    }
}



