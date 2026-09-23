public class ArvoreMorse {

    Nodo raiz = null;

    public void inicializar(){
        this.raiz = new Nodo();

        inserir(".-",   'A');
        inserir("-...", 'B');
        inserir("-.-.", 'C');
        inserir("-..",  'D');
        inserir(".",    'E');
        inserir("..-.", 'F');
        inserir("--.",  'G');
        inserir("....", 'H');
        inserir("..",   'I');
        inserir(".---", 'J');
        inserir("-.-",  'K');
        inserir(".-..", 'L');
        inserir("--",   'M');
        inserir("-.",   'N');
        inserir("---",  'O');
        inserir(".--.", 'P');
        inserir("--.-", 'Q');
        inserir(".-.",  'R');
        inserir("...",  'S');
        inserir("-",    'T');
        inserir("..-",  'U');
        inserir("...-", 'V');
        inserir(".--",  'W');
        inserir("-..-", 'X');
        inserir("-.--", 'Y');
        inserir("--..", 'Z');

        inserir("-----", '0');
        inserir(".----", '1');
        inserir("..---", '2');
        inserir("...--", '3');
        inserir("....-", '4');
        inserir(".....", '5');
        inserir("-....", '6');
        inserir("--...", '7');
        inserir("---..", '8');
        inserir("----.", '9');
        
    }

    public void inserir(String codigo, char letra){
        Nodo atual = raiz;

        for (int i = 0; i < codigo.length(); i++){
            if(codigo.charAt(i) == '.'){
                if(atual.esquerda == null){
                    atual.esquerda = new Nodo();
                }
                atual = atual.esquerda;
            }else if (codigo.charAt(i) == '-'){
                if(atual.direita == null){
                    atual.direita = new Nodo();
                }
                atual = atual.direita;
            }
        }
        atual.caracter = letra;
        
    }

    public char buscar(String codigo){
        Nodo atual = raiz;


        for (int i = 0; i < codigo.length(); i++){
            if(codigo.charAt(i) == '.'){
                atual = atual.esquerda;
            } else if (codigo.charAt(i) == '-'){
                atual = atual.direita;
            }

            if(atual == null){
                
                return '\u0000';
            }
        }
        return atual.caracter;

    }


}