package calculator;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public class Calculator {

    public String calculate(String[] expr) {
        double a = Double.parseDouble(expr[0]);
        String op = expr[1];
        double b = Double.parseDouble(expr[2]);
        double result = 0;

        if (expr.length == 3) {
        switch (op) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "/":
                result = a / b;
                break;
            case "*":
                result = a * b;
                break;
            default:
                return "error";
        }} else if (expr.length == 5) {
        op = expr[1] + expr[3];
        double c = Double.parseDouble(expr[4]);
        switch (op) {
            case "+" + "-":
                result = a + b - c;
                break;
            case "-" + "+":
                result = a - b + c;
                break;
            case "+" + "+":
                result = a + b + c;
                break;
            case "-" + "-":
                result = a - b - c;
                break;
            case "/" + "+":
                result = a / b + c;
                break;
            case "/" + "-":
                result = a / b - c;
                break;
            case "/" + "/":
                result = a / b / c;
                break;
            case "/" + "*":
                result = a / b * c;
                break;
            case "*" + "+":
                result = a * b + c;
                break;
            case "*" + "-":
                result = a * b - c;
                break;
            case "*" + "*":
                result = a * b * c;
                break;
            case "*" + "/":
                result = a * b / c;
                break;
            case "+" + "/":
                result = a + (b / c);
                break;
            case "+" + "*":
                result = a + (b * c);
                break;
            case "-" + "/":
                result = a - (b / c);
                break;
            case "-" + "*":
                result = a - (b * c);
                break;
            default:
                return "error";
        }} else {
        }

        return String.valueOf(result);
    }
}