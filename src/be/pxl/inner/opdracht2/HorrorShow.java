package be.pxl.inner.opdracht2;

public class HorrorShow {

    public static void main(String[] args) {
         class Vampire implements Monster {

            @Override
            public void menace() {
                System.out.println("I'll drink your blood!!");
            }
        }

        class Werewolf implements DangerousMonster {

            @Override
            public void destroy(Monster monster) {
                monster.menace();
                this.menace();
                System.out.println("Big fight...");
                System.out.println(getClass().getSimpleName() + " killed one " + monster.getClass().getSimpleName());
                monster = null;
            }

            @Override
            public void menace() {
                System.out.println("I'll destroy you.");
            }
        }

        Vampire vampire = new Vampire();
        Werewolf werewolf = new Werewolf();

        werewolf.destroy(vampire);
        System.out.println();
        werewolf.destroy(new Monster() {
            @Override
            public void menace() {
                System.out.println("You smell like a wet dog.");
            }
        });
    }
}
