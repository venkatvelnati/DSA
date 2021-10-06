import java.util.*;
import java.io.*;
public class Magical_Doors{
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
        int t=s.nextInt();
        while(t-->0){
            String st=s.next();
            int toggle=1,c=0;
            for(int i=0;i<st.length();i++){
                if(st.charAt(i)=='0' && toggle==1){
                    c++;
                    toggle=toggle*-1;
                }
                else if(st.charAt(i)=='1' && toggle==-1){
                    c++;
                    toggle=toggle*-1;
                }
            }
            System.out.println(c);
        }
    }
}