import java.util.*;
import java.io.*;
public class Modified_Kaprekar_Numbers{
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
    public static int fun(int n)
    {
        String s = Integer.toString(n*n);
        
        int d=s.length()/2;
        int l=Integer.parseInt(s.substring(d));
        int r=Integer.parseInt(s.substring(d+1));
        
        System.out.println(l+" "+r);
        // if(l+r == n*n)
        //     return 1;
        // return 0;
        return 1;
    }
    public static void main(String args[]) {
        FastReader s = new FastReader();
        int p=s.nextInt();
        int q=s.nextInt();
        int f=0;
        for(int i=p;i<=q;i++)
        {
            if(fun(i)==0)
            {
                //System.out.print(i+" ");
                f=1;
            }
        }
        //if(f==0)
            //System.out.println("INVALID RANGE");
    }
}