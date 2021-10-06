import java.util.*;

import javax.print.attribute.standard.PrinterLocation;

import java.io.*;
public class A_Football{
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
        StringTokenizer stk1 = new StringTokenizer(st,"0");
        StringTokenizer stk2 = new StringTokenizer(st,"1");
        int f=0;
        while(stk1.hasMoreTokens()){
            if(stk1.nextToken().length()>=7){
                f=1;
                break;
            }
        }
        while(stk2.hasMoreTokens()){
            if(stk2.nextToken().length()>=7){
                f=1;
                break;
            }
        }
        if(f==1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}