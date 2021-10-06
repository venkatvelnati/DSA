import java.util.*;
import java.io.*;
public class Chef_and_Street_Food{
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
            int n=s.nextInt();
            int max=0;
            for(int i=0;i<n;i++)
            {
                int st=s.nextInt();
                int v=s.nextInt();
                int p=s.nextInt();
                int temp=p%(st+1)==0?(p/(st+1))*v:Math.floorDiv(p,st+1)*v;
                max=Math.max(temp,max);
            }
            System.out.println(max);
        }
    }
}