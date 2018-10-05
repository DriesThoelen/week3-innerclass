package be.pxl.inner.opdracht2;

public interface Monster {
    default void menace() {
        System.out.println("You smell like a wet dog.");
    };
}
