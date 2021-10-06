import java.util.*;
import java.io.*;
public class Bus_full_of_passengers{
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

    public static boolean fun(ArrayList<Integer> a ,int n){
        for(Integer i:a)
        {
            if(i==n)
                return true;
        }
        return false;
    }

    public static void main(String args[]) {
        FastReader s = new FastReader();
        int t=s.nextInt();
        while(t-->0)
        {
            int n=s.nextInt();
            int capacity=s.nextInt();
            int q=s.nextInt();
            int flag=1;
            HashSet<Integer> list= new HashSet<>();
            while(q-->0)
            {

                char task=s.next().charAt(0);
                int passenger=s.nextInt();
                
                if(flag==1)
                {
                    if(task=='-')
                    {
                        if(list.contains(passenger))
                            list.remove(passenger);
                        else
                            flag=0;
                    }
                    else
                    {
                        if(list.size()==capacity)
                            flag=0;
                        else
                            list.add(passenger);
                    }
                }
            }
            if(flag==0)
                System.out.println("Inconsistent");
            else
                System.out.println("Consistent");
        }
    }
}