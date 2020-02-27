package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstEven
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        Optional<Integer> optional =
                list
                .stream()
                .filter((i) ->i%2==0)
                .filter((i) -> i>3)
                .findFirst();
        if (optional.isPresent())
            System.out.println(optional.get());
        else
            System.out.println("Even number greater than 3 doesn't exist.");

    }
}
