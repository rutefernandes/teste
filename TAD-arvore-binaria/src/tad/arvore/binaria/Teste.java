package tad.arvore.binaria;

import java.util.Iterator;

/**
 *
 * @author rute
 */
public class Teste {

    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.adicionar(6);
        arvore.adicionar(9);
        arvore.adicionar(7);
        arvore.adicionar(1);
        arvore.adicionar(3);
        arvore.adicionar(2);
        arvore.adicionar(4);
        arvore.adicionar(8);
        arvore.adicionar(5);
        No busca = arvore.buscar(9);
        arvore.mostrar();
        Iterator v = arvore.inOrder();
        while(v.hasNext()) {
            Object element = v.next();
            System.out.print(element + " ");
        }
    }
    
}
