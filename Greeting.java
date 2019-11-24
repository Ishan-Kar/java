import java.util.Scanner;
public class Greeting{
    public static void greeting(String v){
        System.out.println(" Hii " + v);
    }
    public static void gender(char gen){
        if(gen=='m'){
            System.out.println(" You are a male ");
        }
        else if(gen=='f'){
            System.out.println(" You are a female ");
        }
        else{System.out.println("DJ????SONAI/OTHERS");}
    }
    public static void main (String[]args){
        String name;
        char gen;
        Scanner input=new Scanner (System.in);
        System.out.print(" enter a name ");
        name=input.next(); 
        greeting(name);
        System.out.println(" enter m for male And f for female ");
        gen=input.next().charAt(0);
        gender(gen);
    }
}