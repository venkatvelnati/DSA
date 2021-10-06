import java.util.*;
import java.io.*;
public class Cricket_Ranking{
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
            int a1=s.nextInt();
            int a2=s.nextInt();
            int a3=s.nextInt();
            int b1=s.nextInt();
            int b2=s.nextInt();
            int b3=s.nextInt();
            int c1=0,c2=0;
            if(a1>b1)
                c1++;
            if(a2>b2)
                c1++;
            if(a3>b3)
                c1++;
            if(a1<b1)
                c2++;
            if(a2<b2)
                c2++;
            if(a3<b3)
                c2++;
            
            if(c1>c2)
                System.out.println("A");
            else
                System.out.println("B");
        }
    }
}