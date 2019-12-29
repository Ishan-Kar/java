import java.util.Scanner;
public class Profitloss{
    public static void main(String[]args){
        float a,b,p,l,n,m;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the cost price");
        a=input.nextFloat();
        System.out.println("Enter the selling price");
        b=input.nextFloat();
        if(a>b){
            System.out.println("Loss");
            l=a-b;
            System.out.println(l);
            n=l/a*100;
            System.out.println(n+"% Loss");
        }
        else if(b>a){
            System.out.println("Profit");
            p=b-a;
            System.out.println(p);
            m=p/a*100;
            System.out.println(m+"% Profit");
        }
        else{
            System.out.println("Neither profit nor loss");
        }

    }
}