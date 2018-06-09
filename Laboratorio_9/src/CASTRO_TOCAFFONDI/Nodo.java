package CASTRO_TOCAFFONDI;
//Autor: CASTRO TOCAFFONDI
public class Nodo<T> {
    private T dato;
    private Nodo<T> siguiente;
    public Nodo(T dato){
        setDato(dato);
        siguiente=null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
    
}
