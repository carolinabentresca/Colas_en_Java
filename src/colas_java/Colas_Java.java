/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas_java;

import javax.swing.JOptionPane;

public class Colas_Java {

    public static void main(String[] args) {
        int opción = 0;
        int elemento = 0;
      
        Cola cola = new Cola();
        do {
            try {
                opción = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Insertar Elemento \n"
                        + "2. Eliminar Elemento \n"
                        + "3. ¿La cola está Vacia? \n"
                        + "4. Inicio de la cola \n"
                        + "5. Tamaño de la cola \n"
                        + "6. Salir del Menú", "Menú", JOptionPane.QUESTION_MESSAGE));
                switch (opción) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un Elemento",
                                "Insertar", JOptionPane.QUESTION_MESSAGE));
                        cola.insertar(elemento);
                        break;
                    case 2:
                        if (!cola.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "Eliminar Elemto: " + cola.eliminar(),
                                    "Eliminar", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La cola está Vacia", "Cola Vacia",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if (cola.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La cola está Vacia", "Cola Vacia",
                                    JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La cola NO está Vacia", "Cola Llena",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if (!cola.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "Inicio de Cola:  " + cola.inicioCola(),
                                    "Inicio Cola", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La cola está Vacia", "Cola Vacia",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Tamaño de Cola:  " + cola.tamañoCola(), "Tamaño Cola",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Fin Menú", "Fin",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción Incorrecta!!!", "Error",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;

                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, n.getMessage());
            }
        } while (opción != 6);
    }

}
