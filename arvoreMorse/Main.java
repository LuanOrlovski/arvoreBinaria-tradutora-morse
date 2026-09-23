import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArvoreMorse arvore = new ArvoreMorse();

        arvore.inicializar();

        Scanner scanner = new Scanner(System.in);

        String codigo;

        for(;;){

            System.out.print("Insira o codigo ou encerre com *: ");
            codigo = scanner.nextLine().trim();

            if(codigo.equalsIgnoreCase("*")){
                break;
            }else{
                char resultado = arvore.buscar(codigo);
                if(resultado == '\u0000'){
                    System.out.println("Não encontrado!");
                } else {
                    System.out.println("Oque corresponde é: " + resultado);
                }
            }
            
        }

        scanner.close();
    }

}
