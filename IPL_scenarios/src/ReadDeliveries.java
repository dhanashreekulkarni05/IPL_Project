import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadDeliveries {
    static ArrayList rd = new ArrayList<>();

    public static ArrayList deliveriesReader() {
        try (BufferedReader br = new BufferedReader(new FileReader("deliveries.csv"))) {
            String str = br.readLine();
            while ((str = br.readLine()) != null)       //Reading until we run out of lines
            {
                String[] current = str.split(",");      //creating a string to splitting lines
                rd.add(Arrays.asList(current));                       //passing the string to arraylist
            }
        } catch (Exception e) {
            System.out.print(e);
        }
        return rd;
    }
}
