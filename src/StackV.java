
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Olivet
 */
public class StackV<E> implements IStack<E>{
    private Vector<E> pila;
    public void pila(){
        pila = new Vector<E>();
    }
    
    public void push(E e){
        pila.addElement(e); //Agrega en ultima posicion e incrementa size en 1
    }
    public E pop(){
        E e = pila.lastElement();
        pila.removeElementAt(pila.size()-1);
        return e;
    }
    public boolean isEmpty(){
        return pila.isEmpty(); //true si no tiene elementos false de lo contrario
    }
    public E getLast(){
        return pila.lastElement();
    }
    public int size(){
        return pila.size();
    }
}
