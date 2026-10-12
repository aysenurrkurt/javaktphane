import java.util.ArrayList;
import java.util.List;

public class Kullanici {
    private String kullaniciId;
    private String ad;
    private List<OduncKaydi> oduncGecmisi; // İlişki: Kullanıcının aldığı kitaplar

    public Kullanici(String kullaniciId, String ad) {
        this.kullaniciId = kullaniciId;
        this.ad = ad;
        this.oduncGecmisi = new ArrayList<>();
    }

    public void oduncEkle(OduncKaydi kayit) {
        this.oduncGecmisi.add(kayit);
    }

    public String getAd() {
        return ad;
    }
}