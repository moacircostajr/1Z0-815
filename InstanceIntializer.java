class Chick {
    public String name = "Fluffy";

    public Chick() {
        name = "Tiny";
        System.out.println("setting constructor");
    }

    {
        System.out.println("setting field");
    }

}

public class InstanceIntializer {
    public static void main(String[] args) {
        Chick chick = new Chick();
        System.out.println(chick.name);
    }
}

/*
 * RUN AND COMPILE: $ javac InstanceIntializer.java && java InstanceIntializer
 */