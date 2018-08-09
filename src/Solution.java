import java.util.*;

public class Solution {

    public static String chessBoard(int[][] board, int S) {
        for (int i = 0; i < S; i++) {
            for (int j = 0; j < S; j++) {

                if (board[0][0] == 0) {
                    if (i % 2 == 0 && j % 2 != board[i][j]) {
                        return "No";
                    }
                    else if (i % 2 == 1 && j % 2 == board[i][j]) {
                        return "No";
                    }
                }
                if (board[0][0] == 1) {
                    if (i % 2 == 0 && j % 2 == board[i][j])
                        return "No";
                    else if (i % 2 == 1 && j % 2 != board[i][j])
                        return "No";
                }
            }
        }
        return "Yes";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            int S = sc.nextInt();
            int[][] chess = new int[S][S];
            for(int j=0;j<S;j++){
                for(int k=0;k<S;k++)
                    chess[i][j] = sc.nextInt();
            }
            String str = chessBoard(chess,S);
            System.out.println(str);
        }
    }
}