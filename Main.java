public class Main {
    public static void main(String[] args) {
        // Kitap nesnesi üret
        Kitap kitap1 = new Kitap("12345", "Suç ve Ceza", "Dostoyevski");
        
        // Kitap kopyası üret (İlişki kuruldu: kitap1'in kopyası)
        KitapKopyasi kopya1 = new KitapKopyasi("KOPYA-01", kitap1);
        
        // Kullanıcı üret
        Kullanici kullanici1 = new Kullanici("U01", "Ayşe Yılmaz");
        
        // Ödünç kaydı oluştur ve nesneleri birbirine bağla
        OduncKaydi kayit1 = new OduncKaydi("R01", kullanici1, kopya1);
        
        // Test et / Konsola yazdır
        kayit1.bilgiYazdir();
    }
}