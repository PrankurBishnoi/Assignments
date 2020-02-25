import java.util.*;

public class Frequency2
{
    public static void main(String[] args) {
        Integer[] array = {4,4,2,2,2,2,3,3,1,1,6,7,5};
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int n : array)
        {
            int count =map.getOrDefault(n,0);
            map.put(n,count+1);
            list.add(n);
        }

        SortComparator compare = new SortComparator(map);

        Collections.sort(list,compare);

        System.out.println(list);

    }
}

class SortComparator implements Comparator<Integer>
{
    private Map<Integer, Integer> freqMap;
    SortComparator(Map<Integer,Integer> freqMap)
    {
        this.freqMap = freqMap;
    }

    public int compare(Integer k1,Integer k2)
    {
        int freqCompare = freqMap.get(k2).compareTo(freqMap.get(k1));

        int valueCompare = k1.compareTo(k2);

        if (freqCompare == 0)
            return valueCompare;
        else
            return freqCompare;

    }
}
