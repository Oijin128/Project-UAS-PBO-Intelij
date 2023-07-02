import java.util.ArrayList;

public class pelanggan {
    private String namap;
    public ArrayList<game> buyedGames = new ArrayList<game>();

    public pelanggan(String namap){
        this.namap = namap;
    }

    public pelanggan() {

    }

    public  String getNama() {
        return namap;
    }

    public void setNama(String namap) {
        this.namap = namap;
    }

    public void buyingGame(game game) {
        this.buyedGames.add(game);
    }
}
