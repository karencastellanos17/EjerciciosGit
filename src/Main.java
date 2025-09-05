import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    }

    public static void menu() {

        Scanner scanner = new Scanner(System.in);
        boolean estado = true;
        while (estado) {
            System.out.println("Menu");
            System.out.println(" ---------------------------");
            System.out.println("1. Dados 2");
            System.out.println("2. Dados 3");
            System.out.println("3. IMC");
            System.out.println("4. Salir");
            System.out.println(" ---------------------------");

            System.out.println("Eliga la opcion que desea");
            int OPC = scanner.nextInt();

            switch (OPC) {
                case 1:
                    dados2();

                    break;

                case 2:
                    dados3();

                    break;

                case 3:
                    imc();

                    break;

                case 4:
                default:
                    estado = false;
            }
        }
    }

    public static void dados2() {
        Random aleatorio = new Random();
        int sumD1 = 0;
        int sumD2 = 0;

        for (int i = 1; i <= 20; i++) {
            int dado1 = aleatorio.nextInt((6 - 1) + 1) + 1;
            sumD1 = sumD1 + dado1;

            int dado2 = aleatorio.nextInt((6 - 1) + 1) + 1;
            sumD2 = sumD2 + dado2;

        }
        System.out.println(sumD1);
        System.out.println(sumD2);

        if (sumD1 > sumD2) {
            System.out.println("Gana el dado 1");
        } else {
            System.out.println("Gana el dado 2");
        }
    }

    public static void dados3() {
        Random aleatorio = new Random();
        int sumD1 = 0, sumD2 = 0, sumD3 = 0;

        for (int i = 1; i <= 20; i++) {
            int dado1 = aleatorio.nextInt((6 - 1) + 1) + 1;
            sumD1 = sumD1 + dado1;

            int dado2 = aleatorio.nextInt((6 - 1) + 1) + 1;
            sumD2 = sumD2 + dado2;

            int dado3 = aleatorio.nextInt((6 - 1) + 1) + 1;
            sumD3 = sumD3 + dado3;
        }
        System.out.println("La suma del dado 1 es " + sumD1);
        System.out.println("La suma del dado 2 es " + sumD2);
        System.out.println("La suma del dado 3 es " + sumD3);

        if (sumD1 > sumD2 && sumD1 > sumD3) {
            System.out.println("El mejor fue el dado 1 con: " + sumD1);
            if (sumD2 > sumD3) {
                System.out.println("El del medio fue el dado 2 con: " + sumD2);
                System.out.println("El peor fue el dado 3 con: " + sumD3);
            } else {
                System.out.println("El del medio fue el dado 3 con: " + sumD3);
                System.out.println("El peor fue el dado 2 con: " + sumD2);
            }
        } else if (sumD2 > sumD1 && sumD2 > sumD3) {
            System.out.println("El mejor fue el dado 2 con: " + sumD2);
            if (sumD1 > sumD3) {
                System.out.println("El del medio fue el dado 1 con: " + sumD1);
                System.out.println("El peor fue el dado 3 con: " + sumD3);
            } else {
                System.out.println("El del medio fue el dado 3 con: " + sumD3);
                System.out.println("El peor fue el dado 1 con: " + sumD1);
            }
        } else if (sumD3 > sumD1 && sumD3 > sumD2) {
            System.out.println("El mejor fue el dado 3 con: " + sumD3);
            if (sumD1 > sumD2) {
                System.out.println("El del medio fue el dado 1 con: " + sumD1);
                System.out.println("El peor fue el dado 2 con: " + sumD2);
            } else {
                System.out.println("El del medio fue el dado 2 con: " + sumD2);
                System.out.println("El peor fue el dado 1 con: " + sumD1);
            }
        }
    }

    public static String imc() {
        double peso;

        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------");
        System.out.println("Digite el peso en (Kg)");
        peso = scanner.nextDouble();

        double estatura;
        System.out.println("----------------------");
        System.out.println("Digite su estatura en (M)");
        estatura = scanner.nextDouble();


        double indice = peso / Math.pow(estatura, 2);

        if (indice < 18.5) {
            return "Su situacion de indice es de: bajo paso";
        } else if (indice >= 18.5 && indice <= 24.9) {
            return"Su situacion de indice es de: peso normal";
        } else if (indice >= 25 && indice <= 26.9) {
            return "Su situacion de indice es de: sobrepeso grado 1";
        } else if (indice >= 27 && indice <= 29.9) {
            return "Su situacion de indice es de: sobrepeso grado 2";
        } else if (indice >= 30 && indice <= 34.9) {
            return "Su situacion de indice es de: obesidad tipo 1";

        } else if (indice >= 35 && indice <= 39.9) {
            return "Su situacion de indice es de: obesidad tipo 2";
        } else if (indice >= 40 && indice <= 49.9) {
            return "Su situacion de indice es de: obesidad tipo 3";
        } else {
            return "Obesidad tipo 4 extrema";
        }

    }
}