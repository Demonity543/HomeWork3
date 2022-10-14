package Task2;

public class Kangaroo extends Animal {
    private boolean haveChild;

    public Kangaroo(String name, int age, float height, String ration, boolean haveChild) {
        super(name, age, height, ration);
        this.haveChild = haveChild;
    }

    public String getChild() {
        return Boolean.toString(haveChild);
    }

    public void setHaveChild(boolean newChecker) {
        this.haveChild = newChecker;
    }

    public String getKangaroo() {
        return getAnimal() + "\nHave child: " + getChild();
    }

}
