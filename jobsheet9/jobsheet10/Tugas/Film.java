public class Film {
    private String judul;
    private String sutradara;
    private double rating;

    public Film(String judul, String sutradara, double rating) {
        this.judul = judul;
        this.sutradara = sutradara;
        this.rating = rating;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getSutradara() {
        return sutradara;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getInfo() {
        return "Judul: " + judul + ", Sutradara: " + sutradara + ", Rating: " + rating;
    }
}
