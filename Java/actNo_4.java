package Primer_Semestre;
import java.util.Scanner;

public class actNo_4 {
    public static void main(String[] args) {
        int mes, dia, year;
        boolean fechaValida = true;
        Scanner key = new Scanner(System.in);

        System.out.println("Ingresa un año: ");
        if (!key.hasNextInt()){
            System.out.println("El formato ingresado no es valido"); return; }
        year = key.nextInt();

        if (year > 2025 || year < 1){
            System.out.println("El año ingeresado no es valido"); return;
        }

        System.out.println("Introduce un mes: (Enero #1, Febrero #2 ...)");
        if (!key.hasNextInt()){
            System.out.println("El formato ingresado no es valido"); return; }
        mes = key.nextInt();

        if (mes > 12 || mes < 1){
            System.out.println("El mes ingeresado no es valido"); return;
        }

        System.out.println("Ingresa un dia del mes: ");
        if (!key.hasNextInt()){
            System.out.println("El formato ingresado no es valido"); return; }
        dia = key.nextInt();

        if (dia > 31 || dia < 1){
            System.out.println("El dia ingresado no es valido"); return;
        }


        switch (mes){
            case 1:
                if (dia > 29){ fechaValida = false; } break;
            case 4: case 6: case 9: case 11:
                if (dia > 30){ fechaValida = false; } break;
        }

        if (fechaValida){
            System.out.println("La fecha ingresada es valida!");
            System.out.printf("Fcha: %d/%d/%d", dia, mes, year);
        }
        else {
            System.out.println("La fecha que ingresaste no existe");
        }
    }
}
