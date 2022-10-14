package Task2;

public class Animal {
    private String name;
    private String ration;
    private int age;
    private float height;

    public Animal(String name, int age, float height, String ration) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.ration = ration;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setHeight(float newHeight) {
        this.height = newHeight;
    }

    public void setRation(String newRation) {
        this.ration = newRation;
    }

    public String getName() {
        return this.name;
    }

    public String getRation() {
        return this.ration;
    }

    public String getAge() {
        return Integer.toString(this.age);
    }

    public String getHeight() {
        return Float.toString(this.height);
    }

    public String getAnimal() {
        return "\nName: " + getName() + "\nAge: " + getAge() + "\nHeight: " + getHeight() + "\nRation: " + getRation();
    }

    public void Sound(String sound) {
        System.out.println(sound);
    }

}
