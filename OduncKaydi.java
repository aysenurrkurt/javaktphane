import java.time.LocalDate;

public class OduncKaydi {
    private String kayitId;
    private LocalDate oduncTarihi;
    private Kullanici kullanici;
    private KitapKopyasi kopya;

    public OduncKaydi(String kayitId, Kullanici kullanici, KitapKopyasi kopya) {
        this.kayitId = kayitId;
        this.kullanici = kullanici;
        this.kopya = kopya;
        this.oduncTarihi = LocalDate.now();
        
        // İşlem yapıldığında kopya artık ödünç verilemez olsun ve kullanıcıya eklensin
        kopya.setOduncVerilebilir(false);
        kullanici.oduncEkle(this);
    }

    public void bilgiYazdir() {
        System.out.println(kullanici.getAd() + " adlı kullanıcı, '" + 
                           kopya.getKitap().getBaslik() + "' kitabını ödünç aldı.");
    }
}