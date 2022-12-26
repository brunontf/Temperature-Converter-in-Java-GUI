public class ConversorTemperatura {
    // fórmulas retiradas diretamento do google
    
    public static double celsiusParaFahrenheit(double temperatura){
        final double fator1 = 9/5f;
        final double fator2 = 32f;
        double fahrenheit= (temperatura*fator1)+fator2;
        return fahrenheit;
    }

    public static double celsiusParaKelvin(double temperatura){
        final double fator1 = 273.15f;
        double celsius= (temperatura-fator1);
        return celsius;
    }

    public static double fahrenheitParaCelsius(double temperatura){
        final double fator1 = 32/9f;
        final double fator2 = 5f;
        double celsius= (temperatura-fator1)*fator2;
        return celsius;
    }

    public static double fahrenheitParaKelvin(double temperatura){
        final double fator1 = 273.15f;
        final double fator2 = 9/5f;
        final double fator3 = 32f;
        double fahrenheit= (temperatura-fator1)* fator2 + fator3;
        return fahrenheit;
    }
    
    public static double kelvinParaCelsius(double temperatura){
        final double fator1 = 273.15f;
        double kelvin= (temperatura+fator1);
        return kelvin;
    }

    public static double kelvinParaFahrenheit(double temperatura){
        final double fator1 = 273.15f;
        final double fator2 = 5/9f;
        final double fator3 = 32f;
        double kelvin= (temperatura-fator3)*fator2+fator1;
        return kelvin;
    }

}
