import java.util.Scanner;
import calculator.Calculate;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculate calc = new Calculate();

        float op1 = sc.nextFloat();
        char opr = sc.next().charAt(0);
        float op2 = sc.nextFloat();

        float result = calc.getAns(op1,opr,op2);

        if(result!=-1)
            System.out.println(result);
        else
            System.out.println("Invalid Operation");
    }
}