import java.util.*;
import java.io.*;
public class Coin_Flip{
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
            int g=s.nextInt();
            for(int k=0;k<g;k++)
            {
                int i,n,q;
                i=s.nextInt();
                n=s.nextInt();
                q=s.nextInt();
        
                if((i==1 && q==1)||(i==2 && q==2))
                    System.out.println((int)Math.floorDiv(n, 2));
                else 
                    System.out.println((int)Math.ceil(n/2.0));
            }
        }
    }
}