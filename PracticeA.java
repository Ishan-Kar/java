import java.util.Scanner;
public class PracticeA{
    public static void main (String[]args){
        int i,x,r,n=0;
        Scanner input=new Scanner (System.in);
        System.out.println("enter a number");
        x=input.nextInt();
        
    // for(i=x;i!=0;i=i/10){
    //     r=i%10;
    //     n=r+n*10;

    // }
    i=x;
    while(i!=0){
        r=i%10;
        n=r+n*10;
        i=i/10;
    }
    if(x==n){
        System.out.println("Palydrome");
        

    }
    else{System.out.println("Not Palydrome");}
    System.out.println(n);
    }
}