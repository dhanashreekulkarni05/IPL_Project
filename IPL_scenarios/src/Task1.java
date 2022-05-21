import java.util.*;

//Number of matches played per year of all the years in IPL.
public class Task1 {
    public static Set<String>  year = new HashSet<String>();
    public static void prob1(){
        Map<String, Integer> map = new HashMap<>();
        ReadMatches obj = new ReadMatches();
        ListIterator<List<String>> t = obj.data1.listIterator();
        while(t.hasNext()){
//            List<String> y = obj.data1.get(1);
            String y = (String) obj.data1.get(1);
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
