import java.util.Scanner;

public class Funciones {

    public static int sumar(int num1, int num2){
        return num1 + num2;
    }

    public void mensaje(String mensaje){
        System.out.println("Hola " + mensaje);
        return;
    }
    
    public static int restar(int num1, int num2){
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2){
        return num1 * num2;
    }

    public static int dividir(int num1, int num2){
        return num1 / num2;
    }   
    public static void main(String[] args) {
        while(true){
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Opcion: ");

            // int opcion = Integer.parseInt(System.console().readLine());
            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();
            scanner.nextLine();
            if(opcion == 5){
                break;
            }
            System.out.print("Numero 1: ");
            // int num1 = Integer.parseInt(System.console().readLine());
            int num1 = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Numero 2: ");
            // int num2 = Integer.parseInt(System.console().readLine());
            int num2 = scanner.nextInt();
            scanner.nextLine();
            switch(opcion){
                case 1:
                    System.out.println("Resultado: " + sumar(num1, num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + restar(num1, num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.println("Resultado: " + dividir(num1, num2));
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            scanner.close();
        }
    }

}
