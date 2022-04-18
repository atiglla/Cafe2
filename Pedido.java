import java.util.ArrayList;

import javax.lang.model.util.ElementScanner6;

public class Pedido {
    private String nombre;
    private boolean listo;
    private ArrayList<Articulo> articulos;

    public String getNombre(){
        return nombre;
    }
    
    public boolean getListo(){
        return listo;
    }
    public ArrayList<Articulo> getarticulos(){
        return articulos;
    }

    public Pedido (){
        this.nombre="Invitado";
        this.articulos=new ArrayList<Articulo>();
    }

    public Pedido (String nombre){
        this.nombre=nombre;
        this.articulos=new ArrayList<Articulo>();
    }

    public void listo(boolean listo){
        this.listo=listo;
    }

    
    public void addArticulo (Articulo Articulo){
        this.articulos.add(Articulo);

    }

    public String getStatusMessage () {
        if (listo ==true){
            return "Tu pedido está listo";
        }
        else {
            return "Gracias por esperar. Tu pedido estará listo pronto";
        }
        
    }
    public void display (){
        System.out.println("Nombre Cliente: "+getNombre());
        
        for (Articulo articulo : articulos) {
            System.out.println(articulo.getNombre()+":"+articulo.getTotal());            
        }


        System.out.println("Total: "+getOrderTotal());
        
        

    }

    public double getOrderTotal (){

        double total=0;

        for (Articulo articulo : articulos) {
            
            total+=articulo.getTotal();      
        }

        return total;
    }
}