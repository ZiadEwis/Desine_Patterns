public class SmartHomeFacade {
    private AC ac;
    private Lights lights;
    private SoundSystem soundSystem;
    public SmartHomeFacade(){
        ac = new AC();
        lights = new Lights();
        soundSystem = new SoundSystem();
    }

    public void turnOnAll(){
        ac.turnOn();
        lights.turnOn();
        soundSystem.trunOn();
    }

    public void turnOffAll(){
        ac.turnOff();
        lights.turnOff();
        soundSystem.trunOff();
    }
}
