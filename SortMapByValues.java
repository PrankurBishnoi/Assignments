import java.util.*;

public class SortMapByValues
{
    public static void main(String[] args)
    {
        HashMap<String,Integer> hashMap = new HashMap<>();

        hashMap.put("PQR", 98);
        hashMap.put("DEF", 85);
        hashMap.put("GHI", 91);
        hashMap.put("ABC", 95);
        hashMap.put("MNO", 79);
        hashMap.put("JKL", 80);

        List<Map.Entry<String,Integer>> list = new LinkedList<>(hashMap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> v1, Map.Entry<String, Integer> v2)
            {
                return (v1.getValue().compareTo(v2.getValue()));
            }
        });

        HashMap<String,Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> aa : list)
        {
            sortedMap.put(aa.getKey(),aa.getValue());
        }
        System.out.println(sortedMap);
    }
}
