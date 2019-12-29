import java.util.Scanner;
public class Profitloss2{
public static void profit(float cp,float sp){
    float p,pp;
    p=sp-cp;
    pp=p/cp*100;
    System.out.println(p);
    System.out.println(pp+ "% profit");
}
public static void loss(float cp, float sp){
    float l,lp;
    l=cp-sp;
    lp=l/cp*100;
    System.out.println(l);
    System.out.println(lp +"% loss");
}
public static void main(String[]args){
    float cp,sp;
    Scanner input=new Scanner(System.in);
        System.out.println("Enter the cost price");
        cp=input.nextFloat();
        System.out.println("Enter the selling price");
        sp=input.nextFloat();
        if(cp>sp){
            loss(cp,sp);
        }
        else if(cp<sp){
            profit(cp,sp);
        }
        else{
            System.out.println("Neither profit nor loss");
        }
}
}