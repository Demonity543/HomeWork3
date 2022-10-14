package Task1;

import Utilites.Human;

public class Pilot extends Human {

    private String plane;

    public Pilot(String name, int age, int height, int experiance, String plane) {
        super(name, age, height, experiance);

        this.plane = plane;
    }

    public void setPlane(String newPlane) {
        this.plane = newPlane;
    }

    public String getPlane() {
        return this.plane;
    }

    public String getPilot() {
        return getHuman() + "\nPlane: " + getPlane();
    }

}
