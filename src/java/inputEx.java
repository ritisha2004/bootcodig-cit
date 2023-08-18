import java.util.Scanner;
public class inputEx {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        float n = sc.nextFloat();
        System.out.println("enter second number:");
        float m = sc.nextFloat();

        float add = n+m;
        System.out.println("Addtion="+add);

        float multi = n*m;
        System.out.println("Multipilcation="+multi);

        float sub = n-m;
        System.out.println("Subtraction="+sub);

        float divi=n/m;
        System.out.println("division="+divi);
    }
}
