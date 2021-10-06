import java.util.*;
import java.io.*;
public class Penalty_Shots{
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
            int p1=0,p2=0;
            for(int i=1;i<=10;i++)
            {
                int n=s.nextInt();
                if(i%2!=0)
                   p1+=n;
                else
                   p2+=n;
            }
            if(p1>p2)
                System.out.println("1");
            else if(p2>p1)
                System.out.println("2");
            else
                System.out.println("0");
        }
    }
}