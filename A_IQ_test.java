import java.util.*;
import java.io.*;
public class A_IQ_test{
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
        int [] a= new int[n];
        int even=0,odd=0;
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();

            if(a[i]%2==0)
                even++;
            else
                odd++;
        }
        if(even==1 && odd>1){
            for(int i=0;i<n;i++){
                if(a[i]%2==0){
                    System.out.println(i+1);
                    break;
                }
            }
        }
        else{
            for(int i=0;i<n;i++){
                if(a[i]%2!=0){
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}