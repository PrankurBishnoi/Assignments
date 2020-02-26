package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumGreaterThan5
{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
        System.out.println(
                list
                        .stream()
                        .filter((i)->i>5)
                        .mapToInt(Integer::intValue)
                        .sum()
        );
    }
}
