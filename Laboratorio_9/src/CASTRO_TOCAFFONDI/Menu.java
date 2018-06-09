package CASTRO_TOCAFFONDI;
//Autor: CASTRO TOCAFFONDI

import javax.swing.JOptionPane;

public class Menu<T> {
    public Menu(){
        Cola<T> c=new Cola<>();
        //Cola c=new Cola();
        T element = null;//*********** debe ser T no entero ****************
        String mensaje="*******MENÚ*******\n";
        mensaje+="1. Insertar nodo\n";//Funciona
        mensaje+="2. Extraer\n";
        mensaje+="3. Transferir nodo\n";
        mensaje+="4. Mostrar último nodo\n";//Funciona
        mensaje+="5. Cantidad de nodos\n";//Funciona
        mensaje+="6. Imprimir\n";//Funciona
        mensaje+="7. Salir";//Funciona
        int opcion;
        do{
            
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null,mensaje,"OPERACIONES",JOptionPane.INFORMATION_MESSAGE));
            switch(opcion){
                case 1: //Insertar nodo
                    try{
                            try{ 
                                int numero = Integer.parseInt((String) element); 
                            }catch(NumberFormatException e){ 
                            //La cadena no se puede convertir a entero 
                            }   
                                element=(T) String.valueOf(JOptionPane.showInputDialog(null,"Ingresa el elemento"));
                                //Agregando al Nodo
                                c.insertar((T) element);
                        }catch(NumberFormatException n){
                            JOptionPane.showMessageDialog(null,"Error "+n.getMessage());
                        }
                    break;
                case 2: //Extraer
                    c.extraer();
                    break;
                case 3: //Transferir nodo
                    break;
                case 4: //Mostrar último nodo
                    System.out.println("El último nodo es: ");
                    c.fondo();
                    System.out.println("-----------------------------------------");
                    break;
                case 5: //Cantidad de nodos
                    System.out.println("Hay "+c.cantidad()+" nodos en la cola\n-----------------------------------------");
                    break;
                case 6: //Imprimir
                    c.imprimir();
                    break;
                case 7: //Salir
                    break;
                    
            }
        }while(opcion!=7);
    }
}
