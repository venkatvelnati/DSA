import java.util.*;
import java.io.*;
public class Task{
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
            int n=s.nextInt(),m=s.nextInt();
            int [][] a = new int [n][2];
            int [] b =new int [n];
            for(int i=0;i<n;i++)
            {
                a[i][0]=s.nextInt();
                a[i][1]=s.nextInt();
                b[i]=a[i][0];
            }
            Arrays.sort(b);
            for(int i=0;i<n;i++)
            {
                
            }
        }
    }
}