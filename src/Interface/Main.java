package Interface;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car() ;
//
//        car.start();
//        car.accelerate();
//        car.stop();
//
//
//        //reference variable of type Interface , is it possible ?
//        Engine eng = new Car() ; /// yes possible
//        eng.accelerate();

        /// if you try to stop the music then engine will stop -> how to deal with this
        /// for this i have created separate classes(ElectricEngine, PowerEngine, CDplayer) which will
        /// implement Engine and Media Interfaces

        NiceCar car = new NiceCar() ;
        car.startEngine();
        car.stopEngine();

        car.startMusic();
        car.stopMusic();

        car.upgadeEngine();

        car.startEngine();
        car.stopEngine();



    }
}
