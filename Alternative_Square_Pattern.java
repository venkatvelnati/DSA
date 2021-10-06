import java.util.*;
import java.io.*;
public class Alternative_Square_Pattern{
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
        int j=1;
        for(int i=1;i<=n;i++)
        {
            String temp="";
            for(int k=0;k<5;k++)
            {
                temp+=Integer.toString(j)+" ";
                j++;
            }
           
            if(i%2!=0)
                System.out.println(temp);
            else
            {
                ArrayList<String> list= new ArrayList<>();
                StringTokenizer st = new StringTokenizer(temp," ");
                while(st.hasMoreTokens())
                    list.add(st.nextToken());
                for(int x=list.size()-1;x>=0;x--)
                    System.out.print(list.get(x)+" ");
                System.out.println("");
            }
        }
    }
}