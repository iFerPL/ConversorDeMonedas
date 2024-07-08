import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ConsultaMonedas consulta = new ConsultaMonedas();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("Bienvenido al conversor de monedas");
        while (continuar) {
            System.out.println("*** Conversor de Moneda ***");
            System.out.println("1. Convertir moneda");
            System.out.println("2. Salir");
            System.out.println("3. Mostrar instrucciones");
            System.out.print("Seleccione una opción: ");
            int opcion;

            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character after nextInt()
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada no válida. Introduzca un número para seleccionar la opción.");
                scanner.nextLine(); // Limpiar la entrada inválida
                continue;
            }

            switch (opcion) {
                case 1:
                    try {
                        String moneda1;
                        String moneda2;
                        double cantidad;
                        Menu menu = new Menu();

                        System.out.println(menu.getMenu());
                        System.out.print("Ingrese el código de la moneda base (3 caracteres): ");
                        moneda1 = scanner.nextLine().toUpperCase();
                        if (moneda1.length() != 3) {
                            System.out.println("Error: El código de moneda debe tener exactamente 3 caracteres.");
                            break;
                        }

                        // Pedir código de moneda destino
                        System.out.print("Ingrese el código de la moneda de destino (3 caracteres): ");
                        moneda2 = scanner.nextLine().toUpperCase();
                        if (moneda2.length() != 3) {
                            System.out.println("Error: El código de moneda debe tener exactamente 3 caracteres.");
                            break;
                        }

                        // Pedir cantidad a convertir
                        System.out.print("Ingrese la cantidad a convertir: ");
                        cantidad = scanner.nextDouble();
                        scanner.nextLine(); // Consume the newline character after nextDouble()

                        if (cantidad <= 0) {
                            System.out.println("Error: La cantidad debe ser mayor que cero.");
                            break;
                        }

                        // conversión de moneda
                        Monedas moneda = consulta.datosRequeridos(moneda1, moneda2);
                        System.out.println((moneda.conversion_rate()*cantidad)+" "+moneda.target_code());

                    } catch (InputMismatchException e) {
                        System.out.println("Error: Entrada no válida. Introduzca un número para la cantidad.");
                        scanner.nextLine(); // Limpiar la entrada inválida
                    }
                    break;
                case 2:
                    System.out.println("Gracias por usar el conversor de monedas");
                    continuar = false;
                    break;
                case 3:
                    Menu menu = new Menu();

                    System.out.println(menu.toString());
                    break;

                default:
                    System.out.println("Opción no válida. Seleccione 1 o 2.");
            }
        }

    }
}
