import java.util.*;
import java.io.*;
public class Obtain_the_Sum{
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
        while(t-->0){
            long n=s.nextLong();
            long sum=s.nextLong();
            long total=n*(n+1)/2;

            
            if((total-sum)>=1 && (total-sum)<=n){
                System.out.println(total-sum);
            }
            else{
               System.out.println("-1");
            }
        }
    }

}