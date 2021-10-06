import java.util.*;
import java.io.*;
public class A_Games{
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
        int [] a = new int[n];
        int [] b = new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
            b[i]=s.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]==b[j])
                    c++;
            }
        }
        System.out.println(c);
    }
}