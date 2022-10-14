package Task6;

import java.util.Arrays;
import java.util.Collections;

public class Array implements IMath {

    private Integer[] array;

    public Array(Integer[] array) {
        this.array = array;
    }

    @Override
    public int Max() {
        int max = Collections.max(Arrays.asList(array));
        return max;
    }

    @Override
    public int Min() {
        int min = Collections.min(Arrays.asList(array));
        return min;
    }

    @Override
    public float Avg() {
        float total = 0.0f;
        for (int i = 0; i < array.length; i++) {
            total = total + (float) array[i];
        }
        return total / array.length;
    }

}
