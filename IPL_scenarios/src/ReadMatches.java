import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadMatches {
    static ArrayList rm = new ArrayList<>();

    public static ArrayList matchesReader() {
        try (BufferedReader br = new BufferedReader(new FileReader("matches.csv"))) {
            String str = br.readLine();
            while ((str = br.readLine()) != null)       //Reading until we run out of lines
            {
                String[] current = str.split(",");      //creating a string to splitting lines
                rm.add(Arrays.asList(current));                       //passing the string to arraylist
            }
        } catch (Exception e) {
            System.out.print(e);
        }
        return rm;
    }
}
