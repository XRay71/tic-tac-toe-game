
import java.io.*;
import java.util.*;

public class tictactoe {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static char[] board = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to tictactoe!");
        System.out.println("Inputs are 1-9, with order of normal english reading.");
        System.out.println("Player 1 is 'x', player 2 is 'o'\n");
        boolean player = true;
        while (true){
            print();
            if (check()){
                System.out.println("Player " + (player?'o':'x') + " has won!");
                return;
            }
            System.out.println("Player " + (player?'x':'o') + " please make your move.\n");
            while (true){
                String in = readLine();
                if (in.equals("1") || in.equals("2") || in.equals("3") || in.equals("4") || in.equals("5") || in.equals("6") || in.equals("7") || in.equals("8") || in.equals("9")) {
                    move(Integer.parseInt(in), player);
                    break;
                } else {
                    System.out.println("Inputs are 1-9.\n");
                }
            }
            player = !player;
        }
    }
    public static void move(int num, boolean player){
        board[num - 1] = player?'x':'o';
    }
    public static void print(){
        System.out.println();
        System.out.println(board[0] + "|" + board[1] + "|" + board[2]);
        System.out.println("-----");
        System.out.println(board[3] + "|" + board[4] + "|" + board[5]);
        System.out.println("-----");
        System.out.println(board[6] + "|" + board[7] + "|" + board[8]);
        System.out.println();
    }
    public static boolean check(){
        if (board[0] != ' ' && board[0] == board[1] && board[1] == board[2]) return true;
        if (board[3] != ' ' && board[3] == board[4] && board[4] == board[5]) return true;
        if (board[6] != ' ' && board[6] == board[7] && board[7] == board[8]) return true;
        if (board[0] != ' ' && board[0] == board[3] && board[3] == board[6]) return true;
        if (board[1] != ' ' && board[1] == board[4] && board[4] == board[7]) return true;
        if (board[2] != ' ' && board[2] == board[5] && board[5] == board[8]) return true;
        if (board[0] != ' ' && board[0] == board[4] && board[4] == board[8]) return true;
        if (board[2] != ' ' && board[2] == board[4] && board[4] == board[6]) return true;
        return false;
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {st = new StringTokenizer(br.readLine().trim());}
        return st.nextToken();}
    static long readLong() throws IOException {return Long.parseLong(next());}
    static int readInt() throws IOException {return Integer.parseInt(next());}
    static double readDouble() throws IOException {return Double.parseDouble(next());}
    static char readCharacter() throws IOException {return next().charAt(0);}
    static String readLine() throws IOException {return br.readLine().trim();}
}
