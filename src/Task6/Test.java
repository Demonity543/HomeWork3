package Task6;

public class Test {
    public static void main(String[] args) {
        Integer[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Array test = new Array(array);

        System.out.println("\nMax: " + test.Max());
        System.out.println("\nMin: " + test.Min());
        System.out.println("\nAvg: " + test.Avg());
    }
}
