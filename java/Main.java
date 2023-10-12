public class Main{
    
    private static void sum(double a,double b){
        System.out.println("\n\t Sum "+(a+b));
    }
    public static void main(String[] args) {
        Cal s=new Cal();
        s.sum(6,7);
        sum(6.7,8.9);
    }

}