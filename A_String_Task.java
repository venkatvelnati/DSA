import java.util.*;
import java.io.*;
public class A_String_Task{
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
        ArrayList<Character> a = new ArrayList<>();
        String st=s.next();
        for(int i=0;i<st.length();i++){
            if(notV(st.charAt(i))){
                a.add('.');
                a.add(Character.toLowerCase(st.charAt(i))); 
            }
        }
        for(char i:a)
            System.out.print(i);
    }
    public static boolean notV(char ch){
        if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' ||ch=='u' ||ch=='y'|| ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' || ch=='Y')
            return false;
        else
            return true;
    }
}