import java.util.*;
import java.io.*;
public class Multiple_of_3{
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
            long k=s.nextLong();
            int d0=s.nextInt();
            int d1=s.nextInt();
            long sum=d0+d1;
            for(int i=2;i<k;i++)
            {
                sum+= (sum)%10;
            }
            if(sum%3==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}