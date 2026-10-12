public class Kitap {
    private String isbn;
    private String baslik;
    private String yazar;

    public Kitap(String isbn, String baslik, String yazar) {
        this.isbn = isbn;
        this.baslik = baslik;
        this.yazar = yazar;
    }

    public String getBaslik() {
        return baslik;
    }
}