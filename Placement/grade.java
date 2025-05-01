import java.util.*;
public class grade { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N>=0){
            if(N>=85){
                System.out.println("A");
            }
            else if(N>=75){
                System.out.println("B");
            }
            else if(N>=65){
                System.out.println("C");
            }
            else {
                System.out.println("D");
            }
        }
        else {
            System.out.println("Invalid");
        }
        
    }
    
}
