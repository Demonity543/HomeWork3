package Task7;

public class Test {

    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 4, 5, 67, 8, 8, 9, 10 };
        Array test = new Array(arr);
        System.out.println("\nWithout sort: " + test.toString());
        test.SortAsc();
        System.out.println("\nSortAsc: " + test.toString());
        test.SortDesc();
        System.out.println("\nSortDesc: " + test.toString());
    }

}
