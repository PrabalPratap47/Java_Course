package Placement;
import java.util.*;
public class Rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int L = sc.nextInt();
        int B = sc.nextInt();

        if(L>0 && B>0){
            int result = L*B;
            System.out.println(result);
        }
        else{
            System.out.println("Invalid");
        }

    }
    
}
