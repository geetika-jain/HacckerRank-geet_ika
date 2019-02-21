import java.math.BigDecimal;
import java.util.*;
class SortBigDecimal{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();


        TreeMap<BigDecimal, Queue<String>> map = new TreeMap<BigDecimal, Queue<String>>();
        for(int i=0;i<n;i++){
            BigDecimal b = new BigDecimal(s[i]);
            Queue<String> temp= map.getOrDefault(b,null);
            if(temp==null){
                temp=new LinkedList<String>();
                temp.add(s[i]);
                map.put(b, temp);
            }
            else{
                temp.add(s[i]);
            }

        }
        int i=0;
        for (Map.Entry<BigDecimal, Queue<String>> entry : map.entrySet())
        {
            for(String temp:entry.getValue()){
                s[i]=temp;
                i++;
            }
        }



        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}