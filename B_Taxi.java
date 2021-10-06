import java.util.*;
import java.io.*;
import java.security.ProtectionDomain;
public class B_Taxi{
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
        int three=0,two=0,one=0;
        int c=0;
        while(n-->0){
            int x=s.nextInt();
            if(x==4)
                c++;
            else if(x==3)
                three++;
            else if(x==2)
                two++;
            else
                one++;
        }
        



        c+=two/2;
        System.out.println(c);
        /*if(two%2==0)
            two=0;
        else{
            if(one==1){
                three++;
                two=0;
                one--;
            }
            else if(one>=2){
                c++;
                one-=2;
                two=0;
            }
        }
        
        if(three<=one){
            c+=three;
            three=0;
            one-=three;
        }
        c+=(int)Math.ceil(one/4);

        System.out.println(c);*/
    }
}