public class Calculator {
    public int sum(int first, int second) {
        int result = first + second;
        return result;
    }
    public int dif(int first, int second) {
        int result = first - second;
        return result;
    }
    public int multiply(int first, int second) {
        int result = first * second;
        return result;
    }
    public float divide(float first, float second) {
        float result = first / second;
        return result;
    }
    public float media(float first, float second, float third){
        float result= (first + second + third) / 3;
        return result;
    }
    public float modulo(float first, float second){
        float result= first % second;
        return result;
    }
}
