import java.util.*;
import java.io.*;
public class A_Arrival_of_the_General{
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
        int [] a  = new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        if(n==2 && a[0]>a[1]){
            System.out.println("0");
        }
        else if(n==2 && a[0]<a[1]){
            System.out.println("1");
        }
        else{
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;

            int maxp=0,minp=0;
            for(int i=0;i<n;i++){
                if(a[i]>max){
                    max=a[i];
                    maxp=i+1;
                }
            }
            
            for(int i=0;i<n;i++){
                if(a[i]<=min){
                    min=a[i];
                    minp=i+1;
                }
            }
            
            if(minp>maxp){
                System.out.println((n-minp)+(maxp-1));
            }
            else
                System.out.println((n-minp)+(maxp-1) -1);
        }
    }
}