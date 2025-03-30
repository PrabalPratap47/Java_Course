
public class BtSubsets{
    public static void findsubsets(String str, String ans, int i){
        //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("Empty");
            }
            else{
                System.out.println(ans);
                }
            }
        //Yes choice
        findsubsets(str, ans+str.charAt(i), i+1);
         //Yes choice
         findsubsets(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str ="abc";
        findsubsets(str, "", 0);
    }

}