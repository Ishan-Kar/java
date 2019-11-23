import java.util.Scanner;
public class Practice2{
    public static void main (String[]args){
        Scanner input=new Scanner (System.in);
        double i;
        System.out.println("enter a number");
        i=input.nextInt();
        double j;
        System.out.println("enter a number");
        j=input.nextInt();
        System.out.println(Math.max(i,j));
        System.out.println(Math.min(i,j)); 
        System.out.println(Math.pow(i,j));
        System.out.println(Math.sqrt(i));
        System.out.println(Math.floor(i));
        System.out.println(Math.log(j));
        System.out.println(Math.round(j));
        System.out.println(Math.abs(j)); 
    }

    
}