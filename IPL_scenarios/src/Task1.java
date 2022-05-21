import java.util.*;

//Number of matches played per year of all the years in IPL.
public class Task1 {
    public static Set<String>  yearSet = new HashSet<String>();
    public static void prob1(){
        Map<List<String>, Integer> map = new HashMap<>();
        ReadMatches obj = new ReadMatches();
        ListIterator<List<String>> t = obj.data.listIterator();
        while(t.hasNext()){
            List<String> y = obj.data.get(1);
            if(map.containsKey(y)){
                  map.put(y, map.get(y)+1);
            }
            else map.put(y, 1);
        }
          map.forEach((k, v) -> {
            System.out.println(k+":"+v);
        });
    }
}
