package lab4;

public class Check {
    String expresion;

    //*constructor
    public Check(String expresion) {
        this.expresion = expresion;
    }


    Stack stackexp = new Stack();


    public void checkExpression() {

        boolean isCorrect = true;

        for (int i = 0; i < expresion.length(); i++) {
            //we take each token to find the ones that reperesents
            //open paranteses and push then to the stack
            char token = expresion.charAt(i);
            if (token == '{' || token == '[' || token == '(') {

                stackexp.push(token);

            }
            //if we find closed paranteses, we check if the current it has a previous
            // open paranteses pushed to the stack, if not ,than the expression is not correct
            if (token == '}' || token == ']' || token == ')'){

                if(!stackexp.isEmpty()) {
                    char last = stackexp.getLastElement();
                    if (last == '{' && token == '}' || last == '[' && token == ']' || last == '(' && token == ')') {

                        stackexp.pop();

                    }else{
                        isCorrect = false;
                    }

                } else {
                    isCorrect = false;
                }


            }

        }
        if (stackexp.isEmpty() && isCorrect) {
            System.out.println("The expression is correct");
        }else{
            System.out.println("The expression is not correct");
        }

    }
}
