package edu.ib;

public class Model {
private double x;
private double y;
private String operator;

    public Model(){
        x=0;
        y=0;
        operator="";
    }



    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getOperator() {
        return operator;
    }

    public double operation() {
        double result = 0;
        switch (operator) {
            case "add" -> result = x + y;
            case "sub" -> result = x - y;
            case "divide" -> result = x / y;
            case "multiply" -> result = x * y;
        }
        return result;
    }

    public double operation1() {
        double result = 0;
        switch (operator) {
            case "percent" -> result = x * 100;
            case "sign" -> result = x * (-1);
        }
        return result;
    }

}
