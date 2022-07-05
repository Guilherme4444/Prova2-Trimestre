import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int numero, fat = 1;
        int cont = 1;

        do{
            System.out.print("Digite um numero:");
            numero = entrada.nextInt();

            for(int i = 1; i <= numero; i++){
                fat = fat * i;

            }
            System.out.println("!" + numero + "=" + fat);
        }while(cont < 2);
        
    }

    
}
