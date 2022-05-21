import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadMatches {
    List<List<String>> data = new ArrayList<>();
    public void reader1(){

        try(BufferedReader br = new BufferedReader(new FileReader("matches.csv")))
        {
//            BufferedReader br = new BufferedReader(new FileReader("matches.csv"));

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
//            {
//                for(String s : list)
//                    System.out.print(s + " ");
//                System.out.println();
//            }
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
    }
}
