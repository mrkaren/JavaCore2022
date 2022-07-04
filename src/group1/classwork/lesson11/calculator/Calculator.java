package group1.classwork.lesson11.calculator;

// Ունենալ 4 մեթոդ։
// 1. plus մեթոդ
// 2. minus մեթոդ
// 3. multiple - բազմապատկում
// 4. divide - բաժանում
// մեթոդները պետք է լինեն վերադարձնող։
// Պետք է ունենալ CalculatorDemo կլասս, որտեղ
// օգտագործենք մեր 4 մեթոդները։
public class Calculator {

    double plus(double x, double y){
        double d = x + y;
        return d;
    }

    double minus(double x, double y) {
        return x - y;
    }

    double multiply(double x, double y){
        return x * y;
    }

    double divide(double x, double y){
        return x / y;
    }

}
