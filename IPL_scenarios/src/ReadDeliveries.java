import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadDeliveries {
    ArrayList data2 = new ArrayList<>();
    public void reader2() {
        try(BufferedReader br = new BufferedReader(new FileReader("deliveries.csv")))
        {

            //Reading until we run out of lines
            String str="";
            br.readLine();
            while((str = br.readLine()) != null)
            {
                List<String> current = Arrays.asList(str.split(","));//splitting lines

                data2.add(current);
                str = br.readLine();
            }
               int c=0;
               for (int i=0;i<data2.size();i++){
                   System.out.println(data2.get(1));
                   c++;
               }
               System.out.println(c);

        }
        catch(Exception e)
        {
            System.out.print(e);
        }
    }
}
