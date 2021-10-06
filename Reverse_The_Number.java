import java.util.*;
import java.io.*;
public class Reverse_The_Number{
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
            String st=s.next();
            int r=0,rev=0;
            if(st.charAt(st.length()-1)!='0')
            {
                StringBuffer sb = new StringBuffer(st);
                System.out.println(sb.reverse());
            }
            else
            {
                int n=Integer.parseInt(st);
                while(n!=0)
                {
                    r=n%10;
                    rev=rev*10+r;
                    n=n/10;
                }
                System.out.println(rev);
            }
        }
    }
}