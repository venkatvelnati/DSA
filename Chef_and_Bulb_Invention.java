import java.util.*;
import java.io.*;
public class Chef_and_Bulb_Invention{
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
            int p=s.nextInt();
            int k=s.nextInt();
            int a=p%k,c=0;
            int b=((n-1)-(n-1)/k*k);
            if(a>b)
                c=((n-1)/k)*(a)+(b+1);
            else
                c=(((n-1)/k)+1)*a;
            c+=1+(p/k);
            System.out.println(c);
        }
    }
}