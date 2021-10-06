import java.util.*;
import java.io.*;
public class Longest_AND_Subarray{
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
            int n=s.nextInt();
            
            int r=(int)(Math.log(n) / Math.log(2));
            int sum1 = Math.abs(n-((int)Math.pow(2,r))) +1;

            int sum2 = Math.abs((int)Math.pow(2,r-1)-((int)Math.pow(2,r)-1)) +1;

            System.out.println(Math.max(sum1,sum2));
            
        }
    }
    static boolean fun(int n)
    {
        return (int)(Math.ceil((Math.log(n) / Math.log(2)))) == (int)(Math.floor(((Math.log(n) / Math.log(2)))));
    }
}