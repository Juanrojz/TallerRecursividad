import java.util.Scanner;

public class Main {
    static  Scanner texto =  new Scanner(System.in);


    static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }


    static int suma(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + suma(n - 1);
    }


    static double potencia(double base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        if (exponente < 0) {
            // base^-2 = 1 / base^2 en caso de exponente negativo se aplica esa regla
            return 1 / potencia(base, -exponente);
        }
        return base * potencia(base, exponente - 1);
    }


    static int contarDigitos(int n) {
        if (n < 0) {
            n = -n; // para que funcione tambien con negativos
        }
        if (n < 10) {
            return 1;
        }
        return 1 + contarDigitos(n / 10);
    }


    static String invertir(String cadena) {
        if (cadena.length() <= 1) {
            return cadena;
        }
        return invertir(cadena.substring(1)) + cadena.charAt(0);
    }



    static void ejercicio1() {
        System.out.print("Ingrese un numero para calcular su factorial: ");
        int n = texto.nextInt();
        if (n < 0) {
            System.out.println("El factorial no existe para numeros negativos");
        } else {
            System.out.println("El factorial de " + n + " es " + factorial(n));
        }
    }

    static void ejercicio2() {
        System.out.print("Ingrese el valor de N: ");
        int n = texto.nextInt();
        System.out.println("La suma de 1 hasta " + n + " es " + suma(n));
    }

    static void ejercicio3() {
        System.out.print("Ingrese la base: ");
        double base = texto.nextDouble();
        System.out.print("Ingrese el exponente (entero): ");
        int exponente = texto.nextInt();
        System.out.println(base + " elevado a " + exponente + " es " + potencia(base, exponente));
    }

    static void ejercicio4() {
        System.out.print("Ingrese un numero entero: ");
        int n = texto.nextInt();
        System.out.println("El numero " + n + " tiene " + contarDigitos(n) + " digitos");
    }

    static void ejercicio5() {
        System.out.print("Ingrese una cadena: ");
        String cadena = texto.nextLine();
        System.out.println("La cadena invertida es: " + invertir(cadena));
    }

    // ---------------------------------------------------------
    // MAIN
    // ---------------------------------------------------------

    public static void main(String[] args) {
        System.out.println("EJERCICIOS DE RECURSIVIDAD");
        System.out.println("1. Factorial");
        System.out.println("2. Suma de 1 hasta N");
        System.out.println("3. Potencia");
        System.out.println("4. Contar digitos");
        System.out.println("5. Invertir cadena");
        System.out.print("Elija un ejercicio: ");
        int opcion = texto.nextInt();
        texto.nextLine(); // limpiar el salto de linea que deja nextInt()

        switch (opcion) {
            case 1:
                ejercicio1();
                break;
            case 2:
                ejercicio2();
                break;
            case 3:
                ejercicio3();
                break;
            case 4:
                ejercicio4();
                break;
            case 5:
                ejercicio5();
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
}


