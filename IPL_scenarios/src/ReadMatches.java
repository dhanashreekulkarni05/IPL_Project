import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ReadMatches {
    ArrayList data1 = new ArrayList<>();
    public ArrayList reader1(){
        try(BufferedReader br = new BufferedReader(new FileReader("matches.csv")))
        {
            //Reading until we run out of lines
            String str="";
            br.readLine();
            while((str = br.readLine()) != null)
            {
                String[] current = str.split(",");//splitting lines

                data1.add(current);
                str = br.readLine();
            }
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
        return null;
    }
}
