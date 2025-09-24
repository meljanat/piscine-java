public class DoOp {
    public static String operate(String[] args) {
        if (args == null || args.length != 3) {
            return "Error";
        }
        int first_op = Integer.parseInt(args[0]);
        int second_op = Integer.parseInt(args[2]);
        String operator = args[1];
        switch (operator) {
            case "+":
                return Integer.toString(first_op + second_op);
            case "-":
                return Integer.toString(first_op - second_op);
            case "*":
                return Integer.toString(first_op * second_op);
            case "/", "%":
                if (first_op == 0 || second_op == 0) {
                    return "Error";
                }
                if (operator == "%") {
                    return Integer.toString(first_op % second_op);
                }
                return Integer.toString(first_op / second_op);
            default:
                return "Error";
        }
    }
}