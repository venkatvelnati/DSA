import java.util.*;

import javax.lang.model.element.Element;

import java.io.*;
public class A_Puzzles{
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
        int m=s.nextInt();
        int [] a = new int[m];
        for(int i=0;i<m;i++)
            a[i]=s.nextInt();
        Arrays.sort(a);
        
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=m-n;i++){
            min=Math.min(min,(a[i+n-1]-a[i]));
        } 
        System.out.println(min);
    }
}