//KAREN CASTELLANOS//
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menu(scanner);
        scanner.close();
    }

    public static void menu(Scanner scanner) {
        boolean estado = true;

        while (estado) {
            System.out.println("Menu");
            System.out.println(" ---------------------------");
            System.out.println("1. Dados 2");
            System.out.println("2. Dados 3");
            System.out.println("3. IMC");
            System.out.println("4. Promedio de notas");
            System.out.println("5. Carrera 2 corredores");
            System.out.println("6. Salir");
            System.out.println(" ---------------------------");
            System.out.print("Elija la opcion que desea: ");

            int opc = scanner.nextInt();

            switch (opc) {
                case 1:
                    dados2();
                    break;
                case 2:
                    dados3();
                    break;
                case 3:
                    imc(scanner);
                    break;
                case 4:
                    promedioNotas(scanner);
                    break;
                case 5:
                    Carrera();
                    break;
                case 6:
                    estado = false;
                    System.out.println("Gracias por usar");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

            System.out.println();
        }
    }

    public static void dados2() {
        Random aleatorio = new Random();
        int sumD1 = 0;
        int sumD2 = 0;

        for (int i = 1; i <= 20; i++) {
            sumD1 += aleatorio.nextInt(6) + 1;
            sumD2 += aleatorio.nextInt(6) + 1;
        }
        System.out.println("La suma del dado 1 es " + sumD1);
        System.out.println("La suma del dado 2 es " + sumD2);

        if (sumD1 > sumD2) {
            System.out.println("Gano el dado 1");
        } else if (sumD2 > sumD1) {
            System.out.println("Gano el dado 2");
        } else {
            System.out.println("Empataron");
        }
    }

    public static void dados3() {
        Random aleatorio = new Random();
        int sumD1 = 0, sumD2 = 0, sumD3 = 0;

        for (int i = 1; i <= 20; i++) {
            sumD1 += aleatorio.nextInt(6) + 1;
            sumD2 += aleatorio.nextInt(6) + 1;
            sumD3 += aleatorio.nextInt(6) + 1;
        }
        System.out.println("La suma del dado 1 es " + sumD1);
        System.out.println("La suma del dado 2 es " + sumD2);
        System.out.println("La suma del dado 3 es " + sumD3);
    }

    public static void imc(Scanner scanner) {
        System.out.print("Digite el peso en (Kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite su estatura en (M) con coma: ");
        double estatura = scanner.nextDouble();

        double indice = peso / Math.pow(estatura, 2);
        System.out.println("Su índice de masa corporal (IMC) es: " + indice);

        if (indice < 18.5) {
            System.out.println("Su situacion de indice es de: bajo peso");
        } else if (indice >= 18.5 && indice <= 24.9) {
            System.out.println("Su situacion de indice es de: peso normal");
        } else if (indice >= 25 && indice <= 26.9) {
            System.out.println("Su situacion de indice es de: sobrepeso grado 1");
        } else if (indice >= 27 && indice <= 29.9) {
            System.out.println("Su situacion de indice es de: sobrepeso grado 2");
        } else if (indice >= 30 && indice <= 34.9) {
            System.out.println("Su situacion de indice es de: obesidad tipo 1");
        } else if (indice >= 35 && indice <= 39.9) {
            System.out.println("Su situacion de indice es de: obesidad tipo 2");
        } else if (indice >= 40 && indice <= 49.9) {
            System.out.println("Su situacion de indice es de: obesidad tipo 3 mórbida");
        } else if (indice >= 50) {
            System.out.println("Su situacion de indice es de: obesidad tipo 4 extrema");
        }
    }

    public static void promedioNotas(Scanner scanner) {
        System.out.println("Promedio de notas");
        System.out.println("----------------------------");

        int nota1, nota2, nota3, nota4, nota5;

        System.out.print("Digite la primer nota: ");
        nota1 = scanner.nextInt();
        System.out.print("Digite la segunda nota: ");
        nota2 = scanner.nextInt();
        System.out.print("Digite la tercera nota: ");
        nota3 = scanner.nextInt();
        System.out.print("Digite la cuarta nota: ");
        nota4 = scanner.nextInt();
        System.out.print("Digite la quinta nota: ");
        nota5 = scanner.nextInt();

        double promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / 5.0;

        System.out.println("---------------------------------");
        System.out.println("El promedio es: " + promedio);

    }

    public static void Carrera() {
        Random aleatorio = new Random();

        int corredor1 = 0, corredor2 = 0, meta = 50;

        while (corredor1 < meta && corredor2 < meta) {
            int avanza1 = aleatorio.nextInt(6) + 1;
            int avanza2 = aleatorio.nextInt(6) + 1;

            corredor1 = corredor1 + avanza1;
            corredor2 = corredor2 + avanza2;

            if (avanza1 == 6) {
                corredor1 = corredor1 - 2;
                if (corredor1 < 0) corredor1 = 0;
                System.out.println("eL corredor 1 saco el numero 6, le quito 2 pasos: " + corredor1);

            } else if (avanza1 == 3) {
                corredor1 = corredor1 + 3;
                System.out.println("eL corredor 1 saco el numero 3, le agrego 3 pasos: " + corredor1);

            } else {
                corredor1 = corredor1 + avanza1;
                System.out.println("corredor 1 avanza " + avanza1 + ":  " + corredor1);
            }

            if (avanza2 == 6) {
                corredor2 = corredor2 - 2;
                if (corredor1 < 0) corredor1 = 0;
                System.out.println("el corredor 2 saco el numero 6, le quito 2 pasos: " + corredor2);

            } else if (avanza2 == 3) {
                corredor2 = corredor2 + 3;
                System.out.println("eL corredor 2 saco el numero 3, le agrego 3 pasos: " + corredor2);
            }
            System.out.println("-----------------------------------------------------------------------------");

            if (corredor1 >= meta) {
                System.out.println("El corredor 1 gana esta carrera");
            } else {
                System.out.println("El corredor 2 gana esta carrera");
            }
        }
    }
}