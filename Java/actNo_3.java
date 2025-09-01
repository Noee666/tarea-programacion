package Primer_Semestre;
import java.util.Scanner;

public class actNo_3 {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int angulo;

        System.out.println("Ingresa un angulo: ");
        angulo = key.nextInt();

        if (angulo > 90){
            System.out.printf("%d grados es un angulo obtuso", angulo);
        }
        if (angulo < 90){
            System.out.printf("%d grados es un angulo agudo", angulo);
        }
        if (angulo == 90){
            System.out.printf("%d grados es un angulo recto", angulo);
        }
    }
}