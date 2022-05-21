import java.util.HashMap;
import java.util.Map;

public class Task4 {
    Map<String, Integer> map2 = new HashMap<>();
    public void prob4(){
        for(Map.Entry<String,Integer> entry:map2.entrySet())
        {
            String bowler = entry.getKey();
            for(Map.Entry<String,Integer> entry1:map2.entrySet()) {
                if(entry1.getKey().equals(bowler))
                {
                    map2.put(bowler, map2.get(bowler)/entry1.getValue());
                    break;
                }
            }
        }
        for(Map.Entry<String,Integer> entry:map2.entrySet())
            System.out.println(entry.getKey()+" : "+entry.getValue());

    }
}
