public class game {
    private String namag;
    private int harga;

    public game(String namag, int harga) {
        this.namag = namag;
        this.harga = harga;
    }

    public game() {
    }

    public String getNama() {
        return this.namag;
    }

    public int getHarga() {
        return this.harga;
    }

    public void setNama(String namag) {
        this.namag = namag;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
