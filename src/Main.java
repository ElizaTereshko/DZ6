public class Main {
    public static void main(String[] args) {
        Cosmodrome cosmodrome = new Cosmodrome();
        Shuttle shuttle = new Shuttle();
        SpaceX spaceX = new SpaceX();
        Ratata ratata = new Ratata();
        cosmodrome.launch(shuttle);
        cosmodrome.launch(spaceX);
        cosmodrome.launch(ratata);
    }
}
