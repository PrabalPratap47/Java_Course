import java.util.Scanner;

public class salary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
         
        int i =1;
        while (i!=0) {
            int sal = i*2;
            sal*=2;
            i++;
            System.out.println(sal);
        }
    }
}
 