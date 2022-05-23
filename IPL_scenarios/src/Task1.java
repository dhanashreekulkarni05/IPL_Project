import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

//Number of matches played per year of all the years in IPL.
public class Task1 {
    public static Set<String> year = new HashSet<String>();

    public static void prob1() {
        HashMap<String, Integer> matchInYear = new HashMap<>();
        for (int i = 1; i < ReadMatches.rm.size(); i++) {
            ArrayList data = new ArrayList((Collection) ReadMatches.rm.get(i));
            //System.out.println(data.get(2).getClass());
            String year = (String) data.get(1);
            if (matchInYear.containsKey(year)) {
                matchInYear.put(year, matchInYear.get(year) + 1);
            } else {
                matchInYear.put(year, 2);
            }
        }
        System.out.println(matchInYear);
    }
}
