import java.util.*;
import java.io.*;
public class Problem_Difficulties{
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
        while(t-->0)
        {
            HashMap<Integer,Integer> a = new HashMap<>();
            int n=0;
            for(int i=0;i<4;i++)
            {
                n= s.nextInt();
                if(a.containsKey(n))
                    a.replace(n, a.get(n)+1);
                else
                    a.put(n, 1);
            }
            if(a.size()==4 || a.size()==1)
                System.out.println(a.size()/2);
            else if(a.size()==3)
                System.out.println("2");
            else if(a.size()==2)
            {
                if(a.get(n)==1 || a.get(n)==3)
                    System.out.println("1");
                else
                    System.out.println("2");
            }
        }
    }
}