public class Ampm{
    public static void main(String[]args){
        int num=23;
        if(num>12){
            num=num-12;
            System.out.println(num+"pm");
        }
        else{
            System.out.println(num+"am");
        }
    }
}