public class noticeMenu extends notice {
    @Override
    public void notice() {
        super.notice();
        System.out.println("Menu Tambah Game");
    }

    public void notice(String n) {
        System.out.println("Menu Pembelian Game");
    }

    public void notice(int n) {
        System.out.println("Menu Daftar Pelanggan");
    }

    public void warning() {
        System.out.println("Belum ada yang membeli game saat ini");
    }

    public void warning(String a) {
        super.warning();
    }
}
