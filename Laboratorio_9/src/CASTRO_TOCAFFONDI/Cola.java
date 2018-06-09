package CASTRO_TOCAFFONDI;
//Autor: CASTRO TOCAFFONDI
public class Cola<T> {
    private Nodo<T> raiz;
    private Nodo fondo;
    public Cola(){
        raiz=null;
        fondo=null;
    }
    public boolean esVacia(){
        return (raiz==null);
    }
    public void extraer(){//*****Modicado********
        if(!esVacia()){
            T temp=raiz.getDato();
            if(raiz==fondo){
                raiz=null;
                fondo=null;
            }else{
                raiz=raiz.getSiguiente();
            }
            System.out.println(temp);
        }//*****************else{Integer.MAX_VALUE;}
    }
    public void insertar(T dato){
        Nodo<T> nuevo=new Nodo<>(dato);
        if(!esVacia()){
            fondo.setSiguiente(nuevo);
            fondo=fondo.getSiguiente();
        }else{
            raiz=nuevo;
            fondo=nuevo;
        }
    }
    public void agregarNodosDe(Cola<T> B){
        while(!B.esVacia()){
            //T valor=B.extraer();//********************************************
            //insertar(valor);
        }
        
    }
    public void imprimir(){
        Nodo<T> aux=raiz;
        while(aux!=null){
            System.out.println(aux.getDato()+"");
            aux=aux.getSiguiente();
        }
        System.out.println("--------------------------------------------");
    }
    public int cantidad(){
        int contador=0;
        Nodo<T> aux=raiz;
        while(aux!=null){
            contador++;
            aux=aux.getSiguiente();
        }
        return contador;
    }
    public void fondo(){//********** Modificado **********
        if(!esVacia()){
            T valor=(T) fondo.getDato();
            System.out.println(valor);
        }else{
            //else{return Integer.MAX_VALUE;}
        }
    }
}
