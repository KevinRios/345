public class Main {
    public static void main(String[] args) {

        String[] my_array = {"FirstWord", "SecondWord", "THIRDWORD"};

        if (my_array.length > 9) {
            System.out.println("Restriccion: La longitud de la matriz puede superar los 10.");
            return;
        }

        for (String letras : my_array) {
            // finalizo la ejecucion si no se cumplen las restricciones
            if (!validacionLetras(letras)) {
                System.out.println("Restriccion: Los elementos del array deben contener solo letras y espacios.");
                return;
            }
        }

        String result = unirConvertirArray(my_array);
        System.out.println(result);
    }



    public static boolean validacionLetras(String letras) {
        return letras.matches("[a-zA-Z ]+");
    }

    public static String unirConvertirArray(String[] array) {
        StringBuilder sb = new StringBuilder();

        for (String letras : array) {
            sb.append(letras.toLowerCase()).append(" ");
        }

        return sb.toString().trim();
    }

}