import java.util.Scanner;

public class actNo_5 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String name;
        double promedio;
        int tipoDeBachillerato;
        boolean fM;

        System.out.println("Nombre del aspirante: ");
        name = key.nextLine();
        System.out.println("Promedio del aspirante: ");
        promedio = key.nextDouble();
        System.out.println("Tipo de bachillerato: ");
        tipoDeBachillerato = key.nextInt();

        switch (tipoDeBachillerato){
            case 1:  fM = true; break;
            case 2: fM = false; break;
            case 3: fM = false; break;
            case 4: fM = false; break;
            case 5: fM = false; break;
            default: fM = false; break;
        }

        if (promedio >= 90 || promedio >= 80 & fM)   {
            System.out.println("Has sido aceptado en la carrera de Ingenieria Industrial y de Sistemas");
        }
        else {
            System.out.println("Tu solicitud a sido rechazada =[");
        }
    }
}