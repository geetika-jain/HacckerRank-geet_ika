import java.util.*;

public class Game2Darray {

    public static boolean canWin(int i, int leap, int[] game) {
        try{
            if(game[i]==1 || i<0) return false;
            else if(i+1 >= game.length || i+leap >=game.length) return true;
            game[i]=1;

            return canWin(i+leap, leap,game) ||
                    canWin(i+1, leap,game) ||
                    canWin(i-1, leap,game);
        }
        catch(ArrayIndexOutOfBoundsException e){return false;}
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(0,leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}

