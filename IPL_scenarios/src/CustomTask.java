import java.util.*;

public class CustomTask {
    Map<String, Integer> map3 = new HashMap<>();
    public void prob5(){

//Toss winner for the year 2017.
            Set<String> year = new HashSet<String>();
                Map<String, Integer> map = new HashMap<>();
                ReadMatches obj = new ReadMatches();
                ListIterator<List<String>> t1 = obj.data1.listIterator();
                while(t1.hasNext()){
//            List<String> y = obj.data1.get(1);

                    String y = (String) obj.data1.get(6);
                    if (y[1] == 2017)
                        if (t1.next() != null) {
                            if (map.containsKey(y)) {
                                map.put(y, map.get(y) + 1);
                            } else map.put(y, 1);
                        }
                map.forEach((k, v) -> {
                    System.out.println(k+":"+v);
                });
            }
        }


    }
}
