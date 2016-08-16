public abstract class AbstractStack{
    protected int count;
    
    public int size(){
        return count;
    }
    
    public boolean isEmpty(){
        return count == 0; //Aqui se retorna true si esta vacia y false si no
    }
}