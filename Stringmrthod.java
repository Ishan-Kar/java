public class Stringmrthod{
    public static void main(String[]args){
        String text="I know Java";
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.length());
        String t="java";
        System.out.println(text.contains(t));
        System.out.println(text.compareTo(t));
        System.out.println(text.compareToIgnoreCase(t));
        System.out.println(text.equals(t));
        System.out.println(text.indexOf("j"));
        
        
    }
}