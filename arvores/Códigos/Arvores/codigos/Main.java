package Arvores.codigos;

import Arvores.codigos.abb.BinarySearchTree;
import Arvores.codigos.arb.ARBTree;
import Arvores.codigos.avl.AVLTree;
import Arvores.codigos.misc.Pessoa;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random gerador = new Random();
        long inicio, fim, total;
        ARBTree RubroNegra = new ARBTree();
        BinarySearchTree ABB = new BinarySearchTree();
        AVLTree<Pessoa> AVL = new AVLTree();
        double totalEmSegundos;
        int a = 500_000;
        int MAX = 1_000_000;

            inicio = System.nanoTime();
            for (int i = 0; i < a; i++) {
                ABB.insert(i);
            }
            fim = System.nanoTime();
            total = fim - inicio;
            totalEmSegundos = total / 1_000_000_000;
            System.out.println("Tempo de inserção da ABBTree é: " + totalEmSegundos);

            inicio = System.nanoTime();
            for (int i = 0; i < a; i++) {
                Pessoa P = new Pessoa(i);
                AVL.insert(P);
            }
            fim = System.nanoTime();
            total = fim - inicio;
            totalEmSegundos = total / 1_000_000_000;
            System.out.println("Tempo de inserção da AVLTree é: " + totalEmSegundos);

            inicio = System.nanoTime();
            for (int i = 0; i < a; i++) {
                RubroNegra.adiciona(i);
            }
            fim = System.nanoTime();
            total = fim - inicio;
            totalEmSegundos = total / 1_000_000_000;
            System.out.println("Tempo de inserção da ARBTree é: " + totalEmSegundos);

            inicio = System.nanoTime();
            for (int i = a-1; i > -1; i--) {
                ABB.search(i);
            }
            fim = System.nanoTime();
            total = fim - inicio;
            totalEmSegundos = total / 1_000_000_000;
            System.out.println("Tempo de busca da ABBTree é: " + totalEmSegundos);

            inicio = System.nanoTime();
            for (int i = a-1; i > -1; i--) {
                AVL.search(i);
            }
            fim = System.nanoTime();
            total = fim - inicio;
            totalEmSegundos = total / 1_000_000_000;
            System.out.println("Tempo de busca da AVLTree é: " + totalEmSegundos);

            inicio = System.nanoTime();
            for (int i = a-1; i > -1; i--) {
                RubroNegra.encontra(i);
            }
            fim = System.nanoTime();
            total = fim - inicio;
            totalEmSegundos = total / 1_000_000_000;
            System.out.println("Tempo de busca da ARBTree é: " + totalEmSegundos);

            inicio = System.nanoTime();
            for (int i = a-1; i > -1; i--) {
                ABB.remove(i);
            }
            fim = System.nanoTime();
            total = fim - inicio;
            totalEmSegundos = total / 1_000_000_000;
            System.out.println("Tempo de remove da ABBTree é: " + totalEmSegundos);

            inicio = System.nanoTime();
            for (int i = a-1; i > -1; i--) {
                AVL.remove(i);
            }
            fim = System.nanoTime();
            total = fim - inicio;
            totalEmSegundos = total / 1_000_000_000;
            System.out.println("Tempo de remove da AVLTree é: " + totalEmSegundos);

            inicio = System.nanoTime();
            for (int i = a-1; i > -1; i--) {
                RubroNegra.remove(i);
            }
            fim = System.nanoTime();
            total = fim - inicio;
            totalEmSegundos = total / 1_000_000_000;
            System.out.println("Tempo de remove da ARBTree é: " + totalEmSegundos);

        inicio = System.nanoTime();
        for (int i = 0; i < a; i++) {
            ABB.insert(gerador.nextInt(MAX));
        }
        fim = System.nanoTime();
        total = fim - inicio;
        totalEmSegundos = total / 1_000_000_000;
        System.out.println("Tempo de inserção aleatório da ABBTree é: " + totalEmSegundos);

        inicio = System.nanoTime();
        for (int i = 0; i < a; i++) {
            Pessoa P = new Pessoa(gerador.nextInt(MAX));
            AVL.insert(P);
        }
        fim = System.nanoTime();
        total = fim - inicio;
        totalEmSegundos = total / 1_000_000_000;
        System.out.println("Tempo de inserção aleatório da AVLTree é: " + totalEmSegundos);

        inicio = System.nanoTime();
        for (int i = 0; i < a; i++) {
            RubroNegra.adiciona(gerador.nextInt(MAX));
        }
        fim = System.nanoTime();
        total = fim - inicio;
        totalEmSegundos = total / 1_000_000_000;
        System.out.println("Tempo de inserção aleatório da ARBTree é: " + totalEmSegundos);

        inicio = System.nanoTime();
        for (int i = MAX; i > -1; i--) {
            ABB.search(i);
        }
        fim = System.nanoTime();
        total = fim - inicio;
        totalEmSegundos = total / 1_000_000_000;
        System.out.println("Tempo de busca aleatório da ABBTree é: " + totalEmSegundos);

        inicio = System.nanoTime();
        for (int i = MAX; i > -1; i--) {
            AVL.search(i);
        }
        fim = System.nanoTime();
        total = fim - inicio;
        totalEmSegundos = total / 1_000_000_000;
        System.out.println("Tempo de busca aleatório da AVLTree é: " + totalEmSegundos);

        inicio = System.nanoTime();
        for (int i = MAX; i > -1; i--) {
            RubroNegra.encontra(i);
        }
        fim = System.nanoTime();
        total = fim - inicio;
        totalEmSegundos = total / 1_000_000_000;
        System.out.println("Tempo de busca aleatório da ARBTree é: " + totalEmSegundos);

        inicio = System.nanoTime();
        for (int i = MAX; i > -1; i--) {
            ABB.remove(i);
        }
        fim = System.nanoTime();
        total = fim - inicio;
        totalEmSegundos = total / 1_000_000_000;
        System.out.println("Tempo de remove aleatório da ABBTree é: " + totalEmSegundos);

        inicio = System.nanoTime();
        for (int i = MAX; i > -1; i--) {
            AVL.remove(i);
        }
        fim = System.nanoTime();
        total = fim - inicio;
        totalEmSegundos = total / 1_000_000_000;
        System.out.println("Tempo de remove aleatório da AVLTree é: " + totalEmSegundos);
         /*
        inicio = System.nanoTime();
        for (int i = MAX; i > -1; i--) {
            RubroNegra.remove(i);
        }
        fim = System.nanoTime();
        total = fim - inicio;
        totalEmSegundos = total / 1_000_000_000;
        System.out.println("Tempo de remove aleatório da ARBTree é: " + totalEmSegundos);
        */
    }
}


