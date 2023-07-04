public class noticeMenu extends notice {

    public void opening() {
        System.out.println("\nMenu Toko Game Jaya Yes (Khusus Admin)");
        System.out.println("List game yang dijual tersedia dibawah\n");
    }
    @Override
    public void notice() {
        System.out.println("Menu Tambah Game");
    }

    public void notice(String n) {
        System.out.println("Menu Pembelian Game");
    }

    public void notice(int n) {
        System.out.println("Menu Daftar Pelanggan");
    }

    public void noticeUpdate() {
        System.out.println("Menu Ganti Game");
    }

    public void noticeDelet() {
        System.out.println("Menu Hapus Game");
    }

    public void warning() {
        System.out.println("Belum ada yang membeli game saat ini");
    }

    public void warning(String a) {
        super.warning();
    }
}
