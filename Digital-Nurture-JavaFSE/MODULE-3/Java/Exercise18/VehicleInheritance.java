class LivingThing {
    void noise() {
        System.out.println("LivingThing makes a noise");
    }
}

class Puppy extends LivingThing {
    void woof() {
        System.out.println("Puppy woofs");
    }
}

public class AnimalInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.noise();
        p.woof();
    }
}
