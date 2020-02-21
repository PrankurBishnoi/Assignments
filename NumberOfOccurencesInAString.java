import java.util.*;

public class NumberOfOccurencesInAString
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String Strings = new String(sc.nextLine());
        ArrayList<Character> list = new ArrayList<>();
        for ( int i = 0 ; i < Strings.length() ; i++)
        {
            list.add(Strings.charAt(i));
        }
        int count = 1;
        Collections.sort(list);
        list.add(null);
        for ( int i = 0 ; i < (list.size() - 1); i++)
        {
            if ( list.get(i)==list.get(i+1) )
                count++;
            else
            {
                System.out.println(list.get(i) + " Appears " + count + " times");
                count=1;
            }
        }

    }
}
