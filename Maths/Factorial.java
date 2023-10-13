import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int i,num,fact;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number for to find factorial:\n");
        num=sc.nextInt();
        sc.close();
        fact=1;
        for(i=1;i<=num;i++){
            fact=fact*i;
        }
System.out.println("The factorial is:"+fact);

    }
    
}
//Enter a number for to find factorial:

//5
//The factorial is:120
