package facade;

/**
 * Created by sakhtar on 01/04/14.
 */
public class HomeTheaterFacade {
    Tv tv;
    Cdplayer cdplayer;
    Lights lights;

    public HomeTheaterFacade(Tv tv, Cdplayer cdplayer, Lights lights){
        this.tv = tv;
        this.cdplayer = cdplayer;
        this.lights = lights;
    }

    public void switchOnMovie(){
        tv.on();
        cdplayer.on();
        lights.off();
    }

    public void switchOffMovie(){
        tv.off();
        cdplayer.off();
        lights.on();
    }

}
