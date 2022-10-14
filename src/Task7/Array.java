package Task7;

import java.util.Arrays;
import java.util.Collections;

public class Array implements ISort {

    private Integer[] array;

    public Array(Integer[] array) {
        this.array = array;
    }

    @Override
    public void SortAsc() {
        Arrays.sort(array);

    }

    @Override
    public void SortDesc() {
        Arrays.sort(array, Collections.reverseOrder());
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

}
