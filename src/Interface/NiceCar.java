package Interface;

public class NiceCar {
    private Engine engine ;
    private CDplayer player ;

    NiceCar(){
        engine = new PowerEngine() ;
        player = new CDplayer() ;
    }

    public void upgadeEngine(){
        engine = new ElectricEngine() ;
    }

    public void startEngine(){
        engine.start();
    }

    public void stopEngine(){
        engine.stop();
    }

    public void startMusic(){
        player.start();
    }

    public void stopMusic(){
        player.stop() ;
    }






}
