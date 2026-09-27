import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicios {

    public static void main(String[] args) {
        // ejercicio5();
        // ejercicio6();
        // ejercicio8();


    }

    public static void ejercicio5() {
        int n = introduceNumeroEntero("Introduce numero de filas i columnas que sera N : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print("[ ]");
                    } else {
                        System.out.print("[x]");
                    }
                } else {
                    if (j % 2 == 0) {
                        System.out.print("[x]");
                    } else {
                        System.out.print("[ ]");
                    }

                }


            }
            System.out.println(" ");

        }
    }


    public static int introduceNumeroEntero(String mensaje) {
        Scanner in = new Scanner(System.in);
        int numeroEntero = 0;
        boolean numeroValid = false;
        do {
            try {
                System.out.println(mensaje);
                numeroEntero = in.nextInt();
                numeroValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Opcio no valida, torna-hi");
                in.nextLine();
            }
        } while (numeroValid == false);
        return numeroEntero;
    }

    public static void ejercicio6() {
        int[] v = new int[10];
        int[] vector = {18, 22, 30, 3, 8, 2, 0, 6, 9};
        System.out.println(retornarIndex(vector, 10));
    }


    /*
    Retorna la posició de la primera instancia de num dins el vector v. Si no es troba, retorna -1.
    */
    public static int retornarIndex(int[] v, int num) {
        for (int i = 0; i < v.length; i++) {
            if (num == v[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void ejercicio8() {
        int filaP = 1;
        int colP = 1;
        mostrarTablero(filaP, colP);

        Scanner in = new Scanner(System.in);
        char opcio;
        do {
            opcio = in.next().charAt(0);
            switch (Character.toLowerCase(opcio)) {
                case 'w':
                    if (filaP > 0) {
                        filaP = filaP - 1;
                    }
                    break;
                case 's':
                    if (filaP < 7) {
                        filaP = filaP + 1;
                    }
                    break;
                case 'a':
                    if (colP > 0) {
                        colP = colP - 1;
                    }
                    break;
                case 'd':
                    if (colP < 7) {
                        colP = colP + 1;
                    }
                    break;
                case 'f':
                    System.out.println("Adeu!!");
                    break;
                default:
                    System.out.println("Opcio incorrecte, torna-hi!");
            }
            mostrarTablero(filaP, colP);
        } while (opcio != 'f');


    }

    static void mostrarTablero(int filaP, int colP) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == filaP && j == colP) {
                    System.out.print("[P]");
                } else {
                    if (i % 2 == 0) {
                        if (j % 2 == 0) {
                            System.out.print("[ ]");
                        } else {
                            System.out.print("[x]");
                        }
                    } else {
                        if (j % 2 == 0) {
                            System.out.print("[x]");
                        } else {
                            System.out.print("[ ]");
                        }

                    }

                }
            }
            System.out.println(" ");
        }
    }


}






