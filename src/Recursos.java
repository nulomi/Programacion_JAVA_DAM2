import java.util.InputMismatchException;
import java.util.Scanner;

public class Recursos {
    // pedir numereo entero a usuario i validar
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
        } while (numeroValid==false);
        return numeroEntero;
    }
// Recoremos un array y devolver posiconn 1 ocurrencia primera igaualdad de numeros
    public static int retornarIndex(int[] v, int num) {
        for (int i = 0; i < v.length; i++) {
            if (num == v[i]) {
                return i;
            }
        }
        return -1;
    }





}
