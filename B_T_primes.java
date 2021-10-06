import java.util.*;
import java.io.*;
public class B_T_primes{
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
        int n=s.nextInt();
        while(n-->0){
            long x=s.nextLong();
            if(isTPrime(x))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
    public static boolean isTPrime(long x){
        int c=2;
        for(int i=2;i*i<=x;i++){
            if(x%i==0)
                c++;
            if(c>3)
                return false;
        }
        if(c==3)
            return true;
        return false;
    }
}