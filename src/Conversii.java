public class Conversii {
    public float temperatura(float Fahrenheit){
        float Celsius=5 / 9f * (Fahrenheit - 32);
        return Celsius;
    }
    public double inch(float nr){
       double m= nr * 0.0254;
       return m;
    }
    public void viteza(float distanta, float ore, float minute, float secunde){
        System.out.println("Viteza in metri/secunda este " + distanta / secunde);
        System.out.println("Viteza in km/h este " + (distanta/1000)/ore);
        System.out.println("Viteza in m/h este " + (distanta/1609)/ore);
    }
}
