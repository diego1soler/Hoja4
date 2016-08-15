
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Olivet
 * @param <E>
 */
public class StackArray<E> implements IStack<E> {
    private ArrayList<E> pila;
    public void pila(){
        pila = new ArrayList<>();
    }
    
    /**
     *
     * @param e
     */
    @Override
    public void push(E e){
        pila.add(e); //Agrega en ultima posicion e incrementa size en 1
    }

    /**
     *
     * @return
     */
    @Override
    public E pop(){
        return pila.remove(pila.size());
    }

    /**
     *
     * @return
     */
    @Override
    public boolean isEmpty(){
        return pila.isEmpty(); //true si no tiene elementos false de lo contrario
    }

    /**
     *
     * @return
     */
    @Override
    public E getLast(){
        return pila.get(pila.size());
    }

    /**
     *
     * @return
     */
    @Override
    public int size(){
        return pila.size();
    }
}
