import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class Task2 {
    public void prob2(){
        ReadMatches objm = new ReadMatches();
        ArrayList b = objm.reader1();
        HashMap<String,Integer> winnerMap=new HashMap<>();
        for(int i=1;i<b.size();i++){
            ArrayList data = new ArrayList((Collection) b.get(i));
            String winner= (String) data.get(10);
            //System.out.println(winner);
            if(winnerMap.containsKey(winner)){
                winnerMap.put(winner,winnerMap.get(winner)+1);
            }
            else {
                if(winner!=""){
                    winnerMap.put(winner,1);
                    //System.out.println(winner);
                }
            }
        }
        System.out.println(winnerMap);
    }
}
