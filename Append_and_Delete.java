import java.util.*;
import java.io.*;
public class Append_and_Delete{
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
        FastReader st = new FastReader();
        String s=st.next();
        String t=st.next();
        int k=st.nextInt();
        if(s.equals(t))
            System.out.println("Yes");
            
        else if((s.length()<t.length()) && (t.substring(0,s.length()).equals(s)))
        {

            if(k>=t.length()-s.length())
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        else if((s.length()>t.length()) && (s.substring(0,t.length()).equals(t)))
        {
            if(k>=s.length()-t.length())
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        else if(s.length()<=t.length())
        {
            int pos=0;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)!=t.charAt(i))
                {
                    pos=i;
                    break;
                }
            }
            
            int op=s.length()-pos + t.length()-pos;
            if(op<=k)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        else
        {
            int pos=0;
            for(int i=0;i<t.length();i++)
            {
                if(s.charAt(i)!=t.charAt(i))
                {
                    pos=i;
                    break;
                }
            }     
            int op=s.length()-pos + t.length()-pos;
            if(op<=k)
                System.out.println("Yes");
            else
             System.out.println("No");
        }
    }
}