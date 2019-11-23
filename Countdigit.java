import java.util.Scanner;
public class Countdigit{
    public static void main (String[]args){
        int i,x,n,count=0;
        Scanner input=new Scanner (System.in);
        System.out.println("Enter a number");
        x=input.nextInt();
        for(i=x;i!=0;i=i/10){
            count++;
            
        }
        System.out.println("The number has "+count+" digits");
    }
}