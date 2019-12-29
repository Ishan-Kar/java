import java.util.Scanner;
public class Function7{
    static void  add(int num1, int num2) {
    System.out.println( num1+ num2);
    }
    static void sub(int num3,int num4){
        System.out.println( num3-num4);
    }
    static void mult(int num5,int num6){
        System.out.println(num5 * num6);
    }
    static void div(int num7,int num8){
        System.out.println(num7/ num8);
    }
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int n1,n2,decision;
        System.out.println("Enter a number");
        n1=input.nextInt();
        System.out.println("Enter another number");
        n2=input.nextInt();
        System.out.println("Enter 1 for Addition,2 for Substraction,3 for Multiplication,4 for division ");
        decision=input.nextInt();
        if(decision==1){
            add( n1,n2);}
            else if(decision==2){
                sub(n1,n2);}
            else if(decision==3){
                mult(n1,n2); }
                else if(decision==4){
                    div(n1,n2); }
                    else{System.out.println("Wrong input");}
    }
}