import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task3 {
    Map<String, Integer> map1 = new HashMap<>();
    ArrayList deliveriesList = new ArrayList();
    public void prob3(){
        ReadDeliveries objd = new ReadDeliveries();
        long extras = deliveriesList.stream().filter(p -> Integer.parseInt(map1.get("match_id"))>=577 && Integer.parseInt(map1.get("match_id"))<=636 && Integer.parseInt(map1.get("extra_runs"))>0).map(map1 -> map1.getClass("extra_runs")).count();
        System.out.println(extras);
    }
}
