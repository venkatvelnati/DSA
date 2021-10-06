import java.util.*;
import java.io.*;
public class A_Twins{
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
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        Arrays.sort(a);
        for(int i=1;i<n;i++){
            a[i]=a[i]+a[i-1];
        }
        
        System.out.println();
        int c=-1;
        for(int i=n-2;i>=0;i--){
            
            if((a[n-1]-a[i])>a[i]){
                c=n-i-1;
                break;
            }
        }
        if(c==-1)
            System.out.println(n);
        else
            System.out.println(c);
    }
}