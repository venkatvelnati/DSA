import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;
import java.io.*;
public class A_Casimir_s_String_Solitaire{
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
            int a=0,b=0,c=0;
            for(int i=0;i<st.length();i++){
                if(st.charAt(i)=='A')
                    a++;
                else if(st.charAt(i)=='B')
                    b++;
                else if(st.charAt(i)=='C')
                    c++;
            }
            if(a==b && c==0)
                System.out.println("YES");
            else if(b==c && a==0)
                System.out.println("YES");
            else if(b==a+c && c!=0 && b!=0 && a!=0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}