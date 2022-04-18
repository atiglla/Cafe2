public class Articulo {
    private String nombre;
    private double precio;

    public String getNombre(){
        return nombre;
    }
    public double getTotal(){
        return precio;
    }
    public Articulo (String nombre, double precio){
        this.nombre=nombre;
        this.precio=precio;
    }
    
}