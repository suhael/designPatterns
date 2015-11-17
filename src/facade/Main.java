package facade;

/**
 * Created by sakhtar on 01/04/14.
 */
public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(new Tv(), new Cdplayer(), new Lights());
        homeTheater.switchOnMovie();
        homeTheater.switchOffMovie();
    }
}
