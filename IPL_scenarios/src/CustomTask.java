import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class CustomTask {
    public static void prob5() {

        try (BufferedReader br = new BufferedReader(new FileReader("matches.csv"))) {
            String str = br.readLine();
            while ((str = br.readLine()) != null)       //Reading until we run out of lines
            {
                String[] current = str.split(",");      //creating a string to splitting lines
                ReadMatches.rm.add(Arrays.asList(current));                       //passing the string to arraylist
            }
        } catch (Exception e) {
            System.out.print("oh my god");
        }


        HashMap<String, Integer> matchInYear = new HashMap<>();
        for (int i = 1; i < ReadMatches.rm.size(); i++) {
            ArrayList city = new ArrayList((Collection) ReadMatches.rm.get(i));
            //System.out.println(data.get(2).getClass());
            String year = (String) city.get(2);
            if (matchInYear.containsKey(year)) {
                matchInYear.put(year, matchInYear.get(year) + 1);
            } else {
                matchInYear.put(year, 1);
            }
        }
        System.out.println(matchInYear);

    }
}
