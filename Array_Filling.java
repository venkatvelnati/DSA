import java.util.*;
import java.io.*;
public class Array_Filling{
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        
        public FastReader()
        {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        
        int nextInt() { return Integer.parseInt(next()); }
        
        long nextLong() { return Long.parseLong(next()); }
        
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
        
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm)
    {
        
        List<Map.Entry<Integer, Integer> > list =
               new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet());
 
               Collections.sort(
                list,
                (i1,
                 i2) -> i1.getValue().compareTo(i2.getValue()));
         

        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
    public static void main(String args[]) {
        FastReader s = new FastReader();
        int t= s.nextInt();
        while(t-->0)
        {
            int n=s.nextInt();
            int m=s.nextInt();
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<m;i++)
            {
                int x=s.nextInt();
                int y=s.nextInt();
                if(map.containsValue(y) && map.getValue(x)>y)
                    map.replace(x, y);
                else
                    map.put(x,y);
            }
            System.out.println(map);
        }
    }
}