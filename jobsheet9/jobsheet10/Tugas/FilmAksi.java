public class FilmAksi extends Film implements Bersuara, Subtitle {
    private String pemeranUtama;

    public FilmAksi(String judul, String sutradara, double rating, String pemeranUtama) {
        super(judul, sutradara, rating);
        this.pemeranUtama = pemeranUtama;
    }

    public String getPemeranUtama() {
        return pemeranUtama;
    }

    public void setPemeranUtama(String pemeranUtama) {
        this.pemeranUtama = pemeranUtama;
    }

    @Override
    public void putarSuara() {
        System.out.println("Efek ledakan dan tembakan diputar!");
    }

    @Override
    public void tampilkanSubtitle(String bahasa) {
        System.out.println("Subtitle (" + bahasa + "): 'Serang markas musuh sekarang!'");
    }

    @Override
    public String getInfo() {
        return "Film Aksi [" + super.getInfo() + ", Pemeran Utama: " + pemeranUtama + "]";
    }
}
