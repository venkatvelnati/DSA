import java.util.*;
import java.io.*;
public class ATM{
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
        int m=s.nextInt();
        double b=s.nextDouble(),bt=b;
        if(m%5==0)
        {
            b-=(m+0.50);
            if(b<0)
                System.out.println(String.format("%.2f",bt));
            else
                System.out.println(String.format("%.2f",b));
        }
        else
            System.out.println(String.format("%.2f",bt));
    }
}