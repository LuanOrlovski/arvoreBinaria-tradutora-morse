public class Nodo {

    char caracter;
    Nodo direita;
    Nodo esquerda;
    
    public Nodo(){
        this.caracter = '\u0000';
        this.direita = null;
        this.esquerda = null;  
    }
}