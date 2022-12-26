import java.util.ArrayList;

public class TemperatureConverter {
    public static String converter(ArrayList<Object> inputs) {
        try {
            String primeiraUnid = (String) (inputs.get(0));
            String segundaUnid = (String) (inputs.get(1));
            String temperature = (String) (inputs.get(2));
            Double temp = Double.parseDouble(temperature);
            Double newTemp=0d;

            if (primeiraUnid.equals("Celsius")){
                if (segundaUnid.equals("Celsius")){
                    newTemp = temp;
                }
                else if (segundaUnid.equals("Fahrenheit")){
                    newTemp= ConversorTemperatura.celsiusParaFahrenheit(temp);
                }
                else if (segundaUnid.equals("Kelvin")){
                    newTemp= ConversorTemperatura.celsiusParaKelvin(temp);
                }

            }
            else if (primeiraUnid.equals("Kelvin")){
                if (segundaUnid.equals("Kelvin")){
                    newTemp= temp;
                }
                else if (segundaUnid.equals("fahrenheit")){
                    newTemp= ConversorTemperatura.kelvinParaFahrenheit(temp);
                }
                else if (segundaUnid.equals("Celsius")){
                    newTemp= ConversorTemperatura.kelvinParaCelsius(temp);
                }
            }
            else if (primeiraUnid.equals("Fahrenheit")){
                if (segundaUnid.equals("Fahrenheit")){
                    newTemp= temp;
                }
                else if (segundaUnid.equals("Celsius")){
                    newTemp= ConversorTemperatura.fahrenheitParaCelsius(temp);
                }
                else if (segundaUnid.equals("Kelvin")){
                    newTemp= ConversorTemperatura.fahrenheitParaKelvin(temp);
                }
            }

            String newTempString = String.format("%.2f", newTemp);
            return newTempString;

        } catch (NumberFormatException e) {
            GUI.ShowMessage("Please, type a number to convert");
        } catch (Exception e) {
            GUI.ShowMessage(e);
        }

        return "error";
    }
    
}
