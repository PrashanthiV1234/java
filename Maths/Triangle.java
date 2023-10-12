public class Triangle {
    public static void t(int n) {
        for(int i=0;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("\t *");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        t(5);
    }
    
}
