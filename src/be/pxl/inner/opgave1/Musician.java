package be.pxl.inner.opgave1;

public class Musician {

    public void play() {
        new Instrument().makeNoise();
    }

    public class Instrument {
        public void makeNoise() {
            System.out.println("tadadada");
        }
    }

}
