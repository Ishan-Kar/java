import java.util.Scanner;
public class Digitsum{
    public static void main (String[]args){
        Scanner input=new Scanner (System.in);
        int i,n,sum=0;
        System.out.println("Enter a number");
        n=input.nextInt();
        // for(i=n;i!=0;i=i/10){
        //     sum=sum+(i%10);
            i=n;
            while(i!=0){
            sum=sum+(i%10);
            i=i/10;
            }

    // }
    System.out.println(sum);
}
}