import java.util.Scanner;
public class Fibonacci{
    public static void main(String[]args){
        long n1=0,n2=1,n3,terms;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The no of Terms");
        terms=input.nextLong();
        System.out.print("0 1 ");
        for(int i=0;i<terms-2;i++){
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
}