import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int sumD1=0,sumD2=0,sumD3=0;

        for (int i = 1; i <= 20; i++) {
            int dado1 = aleatorio.nextInt((6 - 1) + 1) + 1;
            sumD1 = sumD1 + dado1;

            int dado2 = aleatorio.nextInt((6 - 1) + 1) + 1;
            sumD2 = sumD2 + dado2;

            int dado3 = aleatorio.nextInt((6 - 1) + 1) + 1;
            sumD3 = sumD3 + dado3;
        }
        System.out.println("La suma del dado 1 es "  + sumD1);
        System.out.println("La suma del dado 2 es "  + sumD2);
        System.out.println("La suma del dado 3 es "  + sumD3);

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
}