import java.util.*;
import java.io.*;
public class Fixed_number_of_Fixed_Points{
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
            int k=s.nextInt();
            if(n-k==1)
                System.out.println("-1");
            else if(n==k){
                for(int i=0;i<n;i++){
                    System.out.print((i+1)+" ");
                }
                System.out.println("");
            }
            else{
                for(int i=1;i<=k;i++){
                    System.out.print(i+" ");
                }
                for(int i=k+2;i<=n;i++)
                    System.out.print(i+" ");
                System.out.println(k+1+"");
            }
        }
    }
    
}