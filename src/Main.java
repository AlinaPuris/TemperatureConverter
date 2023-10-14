// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        System.out.println("16°C = " + converter.toFahrenheit(16) + " °F");
        System.out.println("60.8°F = " + converter.toCelsius(60.8) + " °C");

        }
    }
