package Task1;

import Utilites.Human;

public class Builder extends Human {

    private String position;
    private int experienceYear;

    public Builder(String name, int age, int height, String position, int experienceYear) {
        super(name, age, height, experienceYear);
        this.position = position;
    }

    public String getExperience() {
        return Integer.toString(experienceYear);
    }

    public void setExperienceYear(int newExperience) {
        experienceYear = newExperience;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String newposition) {
        position = newposition;
    }

    public String getBuilder() {
        return getHuman() + "\nPosition: "
                + getPosition()
                + "\nExperience: " + getExperience();
    }

}
