import java.util.*;
import java.io.*;
public class A_Chat_room{
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
        int [] a ={'h','e','l','l','o'};
        int pos=0;
        for(int i=0;i<st.length();i++){
            if(pos>4)
                break;
            if(st.charAt(i)==a[pos]){
                pos++;
            }
              
        }
        if(pos==5)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}