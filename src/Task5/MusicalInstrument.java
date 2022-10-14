package Task5;

import java.util.Scanner;

public class MusicalInstrument {
    private String name;
    private String sound;
    private String descript;
    private String history;

    public MusicalInstrument(String name, String descript, String history) {
        this.name = name;
        this.descript = descript;
        this.history = history;
    }

    public void Sound() {
        System.out.println("Enter sound instrument ");
        try (Scanner sc = new Scanner(System.in)) {
            sound = sc.nextLine();
        }
        System.out.println(sound);
    }

    public void Dect() {
        System.out.println("\nName: " + name + "\nDescript: " + descript);
    }

    public void History() {
        System.out.println("\nHistory:\n" + history);
    }

}
