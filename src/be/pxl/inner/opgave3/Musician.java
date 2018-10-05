package be.pxl.inner.opgave3;

public class Musician {

    public void play() {

        Instrument instrument = new Instrument() {
            @Override
            public void makeNoise() {
                System.out.println("reteketet");
            }
        };
        instrument.makeNoise();
    }
}
