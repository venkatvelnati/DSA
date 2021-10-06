import java.util.*;

import javax.xml.stream.events.ProcessingInstruction;

import java.io.*;
public class A_Beautiful_Matrix{
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
        int ip=0,jp=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(s.nextInt()==1){
                    ip=i;
                    jp=j;
                    break;
                }
            }
        }
        System.out.println((int)(Math.abs(ip-3+1)+Math.abs(jp-3+1)));
    }
}