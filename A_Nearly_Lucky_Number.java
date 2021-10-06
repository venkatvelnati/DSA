import java.util.*;
import java.io.*;
public class A_Nearly_Lucky_Number{
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
        String st=s.next();
        long c=0;
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)=='4' || st.charAt(i)=='7')
                c++;
        }
        if(isL(c))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    public static boolean isL(long n){
        if(n==0)
            return false;
        while(n!=0){
            long r=n%10;
            if(r!=7 && r!=4)
                return false;
            n=n/10;
        }
        return true;
    }
}

/*
40047

4-> 2
7-> 1
count=3

*/