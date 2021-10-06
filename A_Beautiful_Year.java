import java.util.*;
import java.io.*;
public class A_Beautiful_Year{
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
        while(true){
            n++;
            if(isU(n)){
                System.out.println(n);
                break;
            }
        }
    }
    public static boolean isU(int n){
        ArrayList<Integer> a = new ArrayList<>();
        while(n!=0){
            if(a.contains(n%10))
                return false;
            a.add(n%10);
            n=n/10;
        }
        return true;
    }
}