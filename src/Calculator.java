public class Calculator {
    public int sum(int first, int second) {
        return first + second;
    }
    public int sum(int first, int second, int third, int fourth){
        return first + second + third + fourth;
    }
    public double sum(double first, double second, double third){
        return first + second + third;
    }
    public int dif(int first, int second) {
        return first - second;
    }
    public int dif(int first, int second, int third){
        return first - second - third;
    }
    public double dif(double first, double second, double third){
        return first - second - third;
    }
    public int multiply(int first, int second) {
        return first * second;
    }
    public int multiply(int first, int second, int third){
        return first * second * third;
    }
    public double multiply(double first, double second, double third){
        return first*second*third;
    }
    public float divide(float first, float second) {
        return first / second;
    }
    public double divide(double first, double second, double third){
        return first / second / third;
    }
    public float media(float first, float second, float third){
        return (first + second + third) / 3;

    }
    public double media (double first, double second, double third, double fourth){
        return (first + second + third + fourth) / 4;
    }
    public float modulo(float first, float second){
        return first % second;

    }
    public double modulo( double first, double second, double third){
        return first % second % third;
    }
}
