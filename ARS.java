import java.util.*;
import java.io.*;
public class ARS{
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
    public static void main(String args[]) {
        FastReader s = new FastReader();
        int t=s.nextInt();
        while(t-->0){
            int n=s.nextInt();
            HashMap<Integer,Integer> a = new HashMap<>();
            for(int i=0;i<n;i++){
                a.put(s.nextInt(),i);
            }
            int x=s.nextInt();
            if(a.containsKey(x))
                System.out.println(a.get(s.nextInt()));
            else
                System.out.println("-1");
        }
    }
}