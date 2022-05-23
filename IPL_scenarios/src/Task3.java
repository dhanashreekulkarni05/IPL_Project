import java.util.*;

public class Task3 {
    static Map<String, Integer> map1 = new HashMap<>();

    public static void prob3() {
        ArrayList data = new ArrayList((Collection) ReadDeliveries.rd.get(17));
        ListIterator itr = ReadDeliveries.rd.listIterator();
        String s = (String) ReadMatches.rm.get(1);
        while (itr.hasNext()) {
            ReadMatches em = (ReadMatches) itr.next();
            if (s == "2016") data.add(ReadMatches.rm.get(1));
            for (int i = 0; i < data.size(); i++) {
                // System.out.println(matchIdList.get(i));
                int matchId = (int) data.get(i);
                int r = (int) ReadDeliveries.rd.get(1);
                ListIterator it = ReadDeliveries.deliveriesReader().listIterator();
                while (it.hasNext()) {
                    ReadDeliveries deliveries = (ReadDeliveries) it.next();
                    if (r == matchId) {
                        if (map1.containsKey(ReadDeliveries.rd.get(4))) {
                            map1.put((String) deliveries.rd.get(4), (map1.get(ReadDeliveries.rd.get(4))));
                        } else map1.put((String) deliveries.rd.get(4), (Integer) ReadDeliveries.rd.get(17));
                    }
                }
            }
        }
        System.out.println(map1);
    }
}
