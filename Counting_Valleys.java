import java.util.*;
import java.io.*;
public class Counting_Valleys{
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
        s.nextInt();
        String st=s.next();
        int [] a =new int[st.length()];
        int h=0;
        for(int i=0;i<st.length();i++)
        {
            char c= st.charAt(i);
            if(c=='D')
                h--;
            if(c=='U')
                h++;
            a[i]=h;
            //System.out.println(h);
        }
        //System.out.println("H DONE");
        int sum=0,count=0,l=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            {
                int j=i-1;
                while(j>=0 && a[j]!=0)
                {
                    //System.out.println(a[j]);
                    sum+=a[j];
                    j--;
                }
                //System.out.println("Iteration");
                if(sum<0)
                {
                    count++;
                    sum=0;
                }
            }        
        }
        System.out.println(count);
    }
}
