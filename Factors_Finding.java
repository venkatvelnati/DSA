import java.util.*;
import java.io.*;
public class Factors_Finding{
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
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
        int n= s.nextInt();
        int c=0;
        ArrayList<Integer> a =new ArrayList<>();
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                c++;
                a.add(i);
            }
        }
        System.out.println(c+1);
        for(int i=0;i<a.size();i++)
            System.out.print(a.get(i)+" ");
        System.out.print(n);
    }
}