import java.util.Scanner;

public class breaker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        int count = 0;
        int i = 1;
        while(distance>0){
            if(i%5 == 0)
                count++;
                i++;
                distance --;
            }
            System.out.println(count);
    }
}
