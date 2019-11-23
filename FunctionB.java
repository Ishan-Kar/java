import java.util.Scanner;
public class FunctionB{
    public static int sum (int a,int b){
        int s;
        s=a+b;
        return s;
    }
    public static int square (int c){
        int d;
        d=c*c;
        return d;
    }
    public static void main (String[]args){
        Scanner input=new Scanner (System.in);
        int a,b,s,p;
        System.out.println("Enter the first number");
        a=input.nextInt();
        System.out.println("Enter the second number");
        b=input.nextInt();
        s=sum(a,b);
        p=square(s);
        System.out.println(p);
    }
}


