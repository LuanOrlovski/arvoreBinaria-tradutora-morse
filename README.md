# Árvore Binária de Código Morse

Programa Java que traduz código Morse para caracteres (A–Z e 0–9) usando uma árvore binária.

Cada código Morse é um caminho na árvore, partindo da raiz:

(ponto) . desce para o filho esquerdo
(traço) - desce para o filho direito

O caractere fica guardado no nó em que o caminho termina.

# Estrutura:

Node.java: estrutura do nó (guarda um caracter e os filhos esquerda e direita) + construtor , que inicia o char com '\u0000'.

ArvoreMorse.java: Metodos da arvore em si. inicializar() cria a raiz e insere os 36 códigos; inserir(codigo, letra) monta o caminho e grava a letra; buscar(codigo) percorre o caminho e devolve a letra.

Main.java: Classe principal, onde o usuario interage com o menu(lê um código do teclado e mostra a letra correspondente.)
