import java.util.*;
import java.io.*;
public class Lapindromes{
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
            String st = s.next();
            String a = st.substring(0, (st.length()/2));
            String b="";
            int flag=0;
            if(st.length()%2==0)
                 b = st.substring((st.length()/2));
            else
            b = st.substring((st.length()/2)+1);
            char[] ch1 = a.toCharArray();
            char[] ch2 = b.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            for(int i=0;i<a.length();i++)
            {
                if(ch1[i]!=ch2[i])
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        

    }
}