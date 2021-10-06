import java.util.*;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

import java.io.*;
public class N_Queen{
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
        //matrix,row,column,total number of queens,number of queens placed,answer
        Nqueen(new boolean[4][4],0,0,4,0,"");
    }
    private static void Nqueen(boolean[][] board, int row, int col, int tq, int qp, String ans) {
       
        if(qp==tq){
           System.out.println(ans);
           return ;
        }
        if(col==board[0].length){
           row++;
           col=0;
        }
        if(row==board.length){
            return ;
        }
        if(isSafe(board,row,col)){
            //do
            board[row][col] =true;

            //recur
            Nqueen(board, row, col, tq, qp+1, "["+row+"-"+"col"+"]");

            //undo
            board[row][col]=false;
        }
        
        //not place
        Nqueen(board, row, col+1 , tq, qp, ans);
    }
    private static boolean isSafe(boolean[][] board, int row, int col) {

        //vertically up
        int r=row-1;
        int c=col;
        while(r>=0){
            if(board[r][c]){
                return false;
            }
            r--;
        }

        //horizonattly left
        r=row;
        c=col-1;
        while(c>=0){
            if(board[r][c]){
                return false;
            }
            c--;
        }

        //diagonally left
        r=row-1;
        c=col-1;
        while(r>=0 && c>=0 ){
            if(board[r][c]){
                return false;
            }
            r--;
            c--;
        }

        //diagonally right
        r=row-1;
        c=col+1;
        while(r>=0 && c< board[0].length){
            if(board[r][c]){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
    
}