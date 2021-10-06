import java.util.*;
import java.io.*;
public class Carvans{
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
            int count=0;
            int [] a = new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=s.nextInt();
            }
            if(n==1)
                System.out.println(1);
            else
            {
                for(int i=1;i<n;i++)
                {
                    if(a[i-1]>=a[i])
                        count++;
                    else
                    {
                        a[i]=a[i-1];
                    }
                }
                System.out.println(count+1);
            }
        }
    }
}