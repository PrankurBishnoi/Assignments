package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Averages
{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(
                list
                .stream()
                .map(n->n*2)
                .mapToInt(Integer::intValue)
                .average()

        );
    }
}



