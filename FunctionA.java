import java.util.Scanner;
public class FunctionA{
public static int natural(int n){
    int sum=0;
for(int i=0;i<=n;i++){
            sum=sum+i;
            
        }
        return sum;
}
    public static void main(String[]args) {
        Scanner input=new Scanner(System.in);
        int n,sum;
        System.out.println("Please Enter A Number");
        n=input.nextInt();
        sum=natural(n);
        System.out.println(sum);    
        
}
}