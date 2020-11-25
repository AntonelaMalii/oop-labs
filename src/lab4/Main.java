package lab4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Main {
    public static void main(String[] args) throws IOException {


        String content1 = new String(Files.readAllBytes(Paths.get("C:\\Users\\Malii Antonela\\Downloads\\one_expression.txt")));
        System.out.println(content1);
        System.out.println("After verifying the expression 1 from one_expression.txt:");
        Check CheckExp0 = new Check(content1);
        CheckExp0.checkExpression();




        String content3 = new String(Files.readAllBytes(Paths.get("C:\\Users\\Malii Antonela\\Downloads\\three_expressions.txt")));
        String[] arrayOfStrings = content3.split("\n");

        Check CheckExp1 = new Check(arrayOfStrings[0]);
        System.out.println(arrayOfStrings[0]);
        System.out.println("After verifying the expression 1 from three_expressions.txt:");
        CheckExp1.checkExpression();

        Check CheckExp2= new Check(arrayOfStrings[1]);
        System.out.println(arrayOfStrings[1]);
        System.out.println("After verifying the expression 2 from three_expressions.txt:");
        CheckExp2.checkExpression();

        Check CheckExp3 = new Check(arrayOfStrings[2]);
        System.out.println(arrayOfStrings[2]);
        System.out.println("After verifying the expression 3 from three_expressions.txt:");
        CheckExp3.checkExpression();

    }
}
//2 * 4 + (3 +6 * 9 -    12 * (2*9 - 15))  + 2 +(-4)*((2 - 15))
//After verifying the expression 1 from one_expression.txt:
//The expression is correct
// 2x - 3y + 25 / (2+5)*12 - ((29*4-2) + 32) -14
//After verifying the expression 1 from three_expressions.txt:
//The expression is correct
// 2x - 3y + 25 / (-((29*4-2) + 32) -14 - (2+5)*12
//After verifying the expression 2 from three_expressions.txt:
//The expression is not correct
// ((((((((((((((((((((2x-4y * 98 )))))))))))))))))))))
//After verifying the expression 3 from three_expressions.txt:
//The expression is not correct