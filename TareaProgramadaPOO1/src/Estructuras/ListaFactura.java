/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author Alcides
 */
public class ListaFactura {
    private  NodoFactura primerNodo;
    private NodoFactura ultimoNodo;
    private int size;

    public int getSize() {
        return size;
    }

    public ListaFactura() {
        ultimoNodo=primerNodo=null;
        size=0;
    }
    public void agregar(NodoFactura nodo){
        if(size==0){
            ultimoNodo=primerNodo=nodo;
            size++;
        }
        else{
            ultimoNodo.next=nodo;
            ultimoNodo=nodo;
        }
    }
    public void mostrarFacturas(){
        NodoFactura nodoActual=primerNodo;
        while(nodoActual.next!=null){
            System.out.println(nodoActual.getData().getConsecutivo());
            System.out.println(nodoActual.getData().getMonto());
            nodoActual=nodoActual.next;
        }
        System.out.println(nodoActual.getData().getConsecutivo());
        System.out.println(nodoActual.getData().getMonto());
    }
}
