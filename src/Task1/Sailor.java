package Task1;

import Utilites.Human;

public class Sailor extends Human {
    private String position;
    private String ship;

    public Sailor(String name, int age, int height, int experience, String position, String ship) {
        super(name, age, height, experience);
        this.position = position;
        this.ship = ship;

    }

    public void setPosition(String newPosition) {
        this.position = newPosition;
    }

    public void setShip(String newShip) {
        this.ship = newShip;
    }

    public String getShip() {
        return this.ship;
    }

    public String getPosition() {
        return this.position;
    }

    public String getSailor() {
        return getHuman() + "\nPosition: " + getPosition() + "\nShip: " + getShip();
    }

}
