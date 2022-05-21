import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


public class IPL {
    public static void main(String[] args) throws IOException {
        boolean flag = false;
        String[] row = null;
        String[] col = null;
        int rc=0, vc=0;
        HashMap<String, String> data= null;
        try {
            BufferedReader[] br = new BufferedReader[1];
            br[0] = new BufferedReader(new FileReader("deliveries.csv"));
            while (!flag) {
                for (BufferedReader b : br) {
                    String str = b.readLine();
                    if (str == null) {
                        flag = true;
                        System.out.println("EOF!!");
                        break;
                    }
                    //System.out.println(str);
                    else {
                        if (rc == 0)
                            row = str.split(",");
                        else {
                            col = str.split(",");
                        }
                        rc++;
                    }
                    data = new HashMap<String, String>();
                    while (vc < row.length) {
                        if (col != null) {
                            data.put(row[vc], col[vc]);
                        }
                        vc++;
                    }
                    //System.out.println("see now wmfebdgmfkhjfdd");
                    for (String s : data.keySet()) {
                        System.out.println(s + "" + data.get(s));
                    }
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        BufferedReader[] br1 = new BufferedReader[1];
        br1[0] = new BufferedReader(new FileReader("matches.csv"));
        boolean flag1 = false;
        while (!flag1) {
            for (BufferedReader b1 : br1) {
                String str = b1.readLine();
                if (str == null) {
                    flag1 = true;
                    System.out.println("EOF!!");
                    break;
                }
                System.out.println(str);
            }
        }

    }
}