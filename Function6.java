import java.util.Scanner;
public class Function6{
    public static int count(int num) {
        int i,n=0;
        for(i=num;i!=0;i=i/10){
            n++;
        }
        return n;
    }
    public static void main (String[]args){
        Scanner input=new Scanner (System.in);
        int a,b;
        System.out.println("enter a number");
        a=input.nextInt();
        b=count(a);
        System.out.println("The number has "+b+" digits");
    }
}
