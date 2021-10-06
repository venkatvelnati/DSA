import java.util.*;
import java.io.*;
public class Laddu{
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
        while(t-->0)
        {
            int n=s.nextInt();
            int count=0;
            String origin=s.next();
            for(int i=0;i<n;i++)
            {
                String temp=s.next();
                if(temp.contains("CONTEST_WON"))
                {
                    int p=s.nextInt();
                    if(p<=20)
                        count+=300+(20-p);
                    else
                        count+=300;
                }
                else if(temp.equals("TOP_CONTRIBUTOR"))
                    count+=300;
                else if(temp.contains("BUG_FOUND"))
                {
                    int p=s.nextInt();
                    count+=p;
                }
                else if(temp.equals("CONTEST_HOSTED"))
                    count+=50;
            }
            if(origin.equals("INDIAN"))
                System.out.println(count/200);
            else
                System.out.println(count/400);
        }
    }
}