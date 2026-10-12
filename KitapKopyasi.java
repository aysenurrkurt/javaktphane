public class KitapKopyasi {
    private String barkod;
    private boolean oduncVerilebilir;
    private Kitap kitap; // İlişki: Hangi kitaba ait?

    public KitapKopyasi(String barkod, Kitap kitap) {
        this.barkod = barkod;
        this.kitap = kitap;
        this.oduncVerilebilir = true;
    }

    public boolean isOduncVerilebilir() {
        return oduncVerilebilir;
    }

    public void setOduncVerilebilir(boolean oduncVerilebilir) {
        this.oduncVerilebilir = oduncVerilebilir;
    }

    public Kitap getKitap() {
        return kitap;
    }
}