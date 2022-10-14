package Task2;

public class Crocodail extends Animal {
    private float lenght;

    public Crocodail(String name, int age, float height, String ration, float lenght) {
        super(name, age, height, ration);
        this.lenght = lenght;
    }

    public void setLenght(float newLenght) {
        this.lenght = newLenght;
    }

    public String getLenght() {
        return Float.toString(this.lenght);
    }

    public String getCrocodial() {
        return getAnimal() + "\nLenght: " + getLenght();
    }
}
