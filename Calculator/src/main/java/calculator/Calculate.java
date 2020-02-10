package calculator;
import operations.Operations;

public class Calculate {
    private Operations operation;
    public Calculate()
    {
        operation = new Operations();
    }
    public float getAns(float op1,char opr,float op2){

        switch (opr){
            case '+':
                return this.operation.add(op1,op2);
            case '-':
                return this.operation.subtract(op1,op2);
            case '*':
                return this.operation.multiply(op1,op2);
            case '/':
                return this.operation.divide(op1,op2);
            case '%':
                return this.operation.modulus(op1,op2);
        }

        return -1;

    }
}