package be.pxl.inner.opgave2;

public class Musician {

    public void play() {
        class Instrument {
            public void makeNoise() {
                System.out.println("toedelledoe");
            }
        }

        new Instrument().makeNoise();
    }
}
