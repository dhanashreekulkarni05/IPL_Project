import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadDeliveries {
    public void reader2()
    {
        try(BufferedReader br = new BufferedReader(new FileReader("deliveries.csv")))
        {
            List<List<String>> data = new ArrayList<>();

            //Reading until we run out of lines
            String str="";
            br.readLine();
            while((str = br.readLine()) != null)
            {
                List<String> current = Arrays.asList(str.split(","));//splitting lines

                data.add(current);
                str = br.readLine();
            }

//            //printing the fetched data
//            for(List<String> list : data)
           {
//                for(String s : list)
//                    System.out.print(s + " ");
//                    System.out.println();
               int c=0;
               for (int i=0;i<data.size();i++){
                   System.out.println(data.get(1));
                   c++;
               }
               System.out.println(c);
      }
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
    }
}
