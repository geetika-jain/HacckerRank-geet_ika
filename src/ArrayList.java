import java.io.*;
import java.util.*;

public class ArrayList {



        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int n= Integer.parseInt(sc.nextLine());
            int i,j,k;

            ArrayList<Integer>[] arr = new ArrayList[n] ;

            for(i=0; i<n;i++){
                String[] s=sc.nextLine().split("[^\\d-]+?");
                j=Integer.parseInt(s[0]);
                arr[i] = new ArrayList();
                if(j>0){
                    for(k=0;k<j;k++){
                        arr[i].add(Integer.parseInt(s[k+1]));
                    }

                }
            }

            n=Integer.parseInt(sc.nextLine());
            for(i=0;i<n;i++){
                String[] sr=sc.nextLine().split(" ");
                int x=Integer.parseInt(sr[0]);
                int y=Integer.parseInt(sr[1]);

                try{
                    if(arr[x-1].get(y-1)==null) System.out.println("ERROR!");

                    System.out.println(arr[x-1].get(y-1));

                }
                catch(IndexOutOfBoundsException l){
                    System.out.println("ERROR!");
                }

            }
        }

}
