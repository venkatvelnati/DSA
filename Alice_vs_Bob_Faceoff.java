import java.util.*;
import java.io.*;
public class Alice_vs_Bob_Faceoff{
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
        long t=s.nextLong();
        while(t-->0){
            long n=s.nextLong();
            String turn="Alice";
            for(int i=1; ;i++){
                if(i%2!=0){
                    //alice
                    n=isRule(n);
                    turn="Bob";
                }
                else{
                    //bob
                    n=isRule(n);
                    turn="Alice";
                }
                if(n==0){
                   
                    break;
                }
            }
            System.out.println(turn);
        }
    }
    public static long isRule(long n){
        for(long i=1;i<=n;i++){
            if(n%i==0 && isPow(i)){
                return n/i;
            }
        }
        return -1;
    }
    static boolean isPow(long n)
    {
        if(n==0)
            return false;
        return (long)(Math.ceil((Math.log(n) / Math.log(2)))) ==(long)(Math.floor(((Math.log(n) / Math.log(2)))));
    }
}