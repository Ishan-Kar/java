import java.util.Scanner;
public class Hello2{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        String name;
        System.out.println("Enter name:");
        name=input.next();
        System.out.println("Hello"+name);
    }
}