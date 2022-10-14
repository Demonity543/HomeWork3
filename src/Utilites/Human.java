package Utilites;

public class Human {
    private String _name;
    private int _age;
    private int _height;
    private int _experience;

    public Human(String name, int age, int height, int experience) {
        _name = name;
        _age = age;
        _height = height;
        _experience = experience;
    }

    public String getName() {
        return _name;
    }

    public String getAge() {
        return Integer.toString(_age);
    }

    public String getHeight() {
        return Integer.toString(_height);
    }

    public String getExperience() {
        return Integer.toString(_experience);
    }

    public void Speak(String worlds) {
        System.out.println(worlds);
    }

    public void setName(String newName) {
        _name = newName;
    }

    public void setExperience(int newExperience) {
        _experience = newExperience;
    }

    public void setHeight(int newHeigth) {
        _height = newHeigth;
    }

    public void setAge(int age) {
        _age = age;
    }

    public String getHuman() {
        return "\nName: " + getName() + "\nAge: " + getAge() + "\nHeight " + getHeight();
    }

}
