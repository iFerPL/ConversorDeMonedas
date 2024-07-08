public class Menu {
    String menu;

    public String getMenu() {
        return """
                \n
                *******Monedas*****
                ARS - Peso argentino
                BRL - Real brasileño
                CAD - Dólar Canadience
                CLP - Peso chileno
                COP - Peso colombiano
                EUR - Euro
                MXN - Peso mexicano
                USD - Dólar estadounidense
                """;
    }

    @Override
    public String toString() {
        return """
                \n
                ****************Cómo usar el conversor de monedas**************
                
                El conversor de monedas es una herramienta fácil de usar que
                te permite convertir entre diferentes monedas utilizando códigos 
                de tres caracteres. A continuación, te proporcionamos una guía rápida 
                sobre cómo utilizarlo.
                               
                Monedas admitidas
                El conversor soporta un total de 161 monedas diferentes.
                Sin embargo, para facilitar el uso, mostramos las monedas principales 
                a continuación.
                Si deseas convertir a o desde una moneda diferente,
                simplemente introduce el código de tres caracteres correspondiente a esa moneda
                
                Ejemplo de uso:
                Supongamos que quieres convertir 100 dólares estadounidenses a euros:
                               
                Código de moneda base: USD
                Código de moneda objetivo: EUR
                Cantidad a convertir: 100.0
                """;
    }
}
