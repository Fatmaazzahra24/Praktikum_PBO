public class MainFilm {
    public static void main(String[] args) {
        FilmAksi filmAksi = new FilmAksi("Mission Impossible", "Christopher McQuarrie", 8.7, "Tom Cruise");
        FilmKomedi filmKomedi = new FilmKomedi("Mr. Bean Holiday", "Steve Bendelack", 7.2, "Humor Visual");

        System.out.println(filmAksi.getInfo());
        filmAksi.putarSuara();
        filmAksi.tampilkanSubtitle("Indonesia");

        System.out.println("\n" + filmKomedi.getInfo());
        filmKomedi.putarSuara();
        filmKomedi.tampilkanSubtitle("English");
    }
}
