import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Lista non mutabile
        //Defina una clase de prueba con un main()método en el que usted:
        //-Cree una serie de cadenas no mutables llamadas usando las que rellena con 3 nombres de ciudades -
        List<String> cityName = Arrays.asList("Roma", "Londres", "Lima");
        //Try to add a 4th city name at the end of the List -If you get an exception,
        // try to understand why and eventually comment the faulty code

        //cityName.add("New York");
        //Al intentar agregar elementos a la lista, lanza error. porque el metodo que se uso para crear la lista
        //cityName  es : Arrays.asList(), que devuelve una lista de tamaño ya definido respaldada por la matriz especificada.

        //Intente cambiar el segundo elemento de la matriz, ingresando el valor Tegucigalpa imprima el contenido de cityNames
        cityName.set(1, "Tegucigalpa");
        System.out.println(cityName);

        //Defina una lista vacía mutable de cadenas llamada kingsOfRome
        List<String> kingsOfRome = new ArrayList<>();

        kingsOfRome.add("Romulus");
        kingsOfRome.add("Numa Pompilius");
        kingsOfRome.add("Tullus Hostilius");
        kingsOfRome.add("Ancus Marcius");
        kingsOfRome.add("Lucius Tarquinius Priscus");
        kingsOfRome.add("Servius Tullius");
        kingsOfRome.add("Cezar");

        //Convierta kingsOfRome en una matriz llamada kingsOfRomeArray,
        //utilizando el nuevo String[0] para determinar el tipo de matriz

        String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);
        System.out.println(Arrays.toString(kingsOfRomeArray));
        //String elementoCambiar = kingsOfRomeArray[6];
        kingsOfRomeArray[6] = "Lucius Tarquinius Superbus";
        System.out.println(Arrays.toString(kingsOfRomeArray));
    }
}