import java.util.*;
import java.io.*;
public class Chef_in_Vaccination_Queue{
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
            int p=s.nextInt();
            int x=s.nextInt();
            int y=s.nextInt();
            long sum=0;
            int [] a= new int[n];
            for(int i=0;i<n;i++){
                a[i]= s.nextInt();
            }
            for(int i=0;i<p;i++){
                if(a[i]==0)
                    sum+=x;
                else
                    sum+=y;
            }
            System.out.println(sum);
        }
    }
}