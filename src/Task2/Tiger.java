package Task2;

public class Tiger extends Animal {
    private String residence;

    public Tiger(String name, int age, float height, String ration, String residence) {
        super(name, age, height, ration);
        this.residence = residence;
    }

    public String getResidence() {
        return this.residence;
    }

    public void setResidence(String newResidence) {
        this.residence = newResidence;
    }

    public String getTiger() {
        return getAnimal() + "\nResidence: " + getResidence();
    }

}
