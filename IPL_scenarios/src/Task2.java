import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class Task2 {
    public static void prob2() {
        HashMap<String, Integer> winCount = new HashMap<>();
        for (int i = 1; i < ReadMatches.rm.size(); i++) {
            ArrayList win = new ArrayList((Collection) ReadMatches.rm.get(i));
            String w = (String) win.get(10);
            //System.out.println(winner);
            if (winCount.containsKey(w)) {
                winCount.put(w, winCount.get(w) + 1);
            } else {
                if (w != "") {
                    winCount.put(w, 1);
                    //System.out.println(winner);
                }

            }
        }
        System.out.println(winCount);
    }
}
