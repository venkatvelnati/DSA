import java.util.*;
import java.io.*;
public class MergeSort{
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
    public static void sort(int a[],int l,int r)
    {
        if(l<r)
        {
            int m=(r-l)/2;
            sort(a,l,m);
            sort(a,m+1,r);

            merge(a,l,m,r);
        }
    }
    public static void main(String args[]) {
        FastReader s = new FastReader();
        int [] a = {1,5,7,4,3,2,9,6,8};
        sort(a,0,a.length-1);
        for(int i :a)
            System.out.println(a);
    }
}