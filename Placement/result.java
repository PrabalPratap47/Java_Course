package Placement;
import java.util.*;
public class result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if(x> 0 && y>0 && z>0){
           int result = (-x+y*z);
           System.out.println(result);
        }
        else{
            System.out.println("Invalid");
        }
        
    }
    
}
