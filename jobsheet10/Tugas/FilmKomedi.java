public class FilmKomedi extends Film implements Bersuara, Subtitle {
    private String jenisHumor;

    public FilmKomedi(String judul, String sutradara, double rating, String jenisHumor) {
        super(judul, sutradara, rating);
        this.jenisHumor = jenisHumor;
    }

    public String getJenisHumor() {
        return jenisHumor;
    }

    public void setJenisHumor(String jenisHumor) {
        this.jenisHumor = jenisHumor;
    }

    @Override
    public void putarSuara() {
        System.out.println(" Suara tawa penonton dan efek lucu diputar!");
    }

    @Override
    public void tampilkanSubtitle(String bahasa) {
        System.out.println(" Subtitle (" + bahasa + "): 'Aduh, salah ambil sepatu lagi!'");
    }

    @Override
    public String getInfo() {
        return "Film Komedi [" + super.getInfo() + ", Jenis Humor: " + jenisHumor + "]";
    }
}
