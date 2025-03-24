package practice.pro.review_dataStructureAndAlgorithms.Stacks;

public class ExpressionBalanceCheck {

    public static void main(String[] args) {

    }

    public static boolean balanceCheck(String expression) {
        // create a stack
        MyStack<Character> myStack = new MyStack();
        // iterate over expression
        for (int i = 0; i < expression.length(); i++) {
            Character ch= expression.charAt(i);
            //filter non players char
            if (ch != '(' && ch != '{' && ch != '[' && ch != ')' && ch != '}' && ch != ']') continue;
            // if it is a symbol to be processed
             // if opening symbol push id to the stack
            if (ch=='(' || ch=='{' || ch==']'){
                myStack.push(ch);
                continue;
            }
            // at this point this is a closing symbol
            // stack shouldn't be empty
            if (myStack.isEmpty()) return false;
            switch (ch){
                case ')':
                    if (myStack.pop()!='(') return false;
                    break;
                case '}':
                    if (myStack.pop()!='{') return false;
                    break;
                case ']':
                    if (myStack.pop()!='[') return false;
                    break;
            }
        } // end of for
        //return if stack is empty
        return myStack.isEmpty();
    }
}
