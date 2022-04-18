public class TestPedidos{
    public static void main(String[] args) {

        Articulo articulo1= new Articulo("latte",2.5);
        Articulo articulo2= new Articulo("café de goteo",3.5);
        Articulo articulo3= new Articulo("capuchino",4.5);
        
        Pedido pedido1= new Pedido();
        Pedido pedido2= new Pedido();
        Pedido pedido3= new Pedido("Alex");
        Pedido pedido4= new Pedido("John");
        Pedido pedido5= new Pedido("Car");

        pedido1.addArticulo(articulo1);
        pedido1.addArticulo(articulo2);
        pedido2.addArticulo(articulo2);
        pedido2.addArticulo(articulo3);
        pedido3.addArticulo(articulo3);
        pedido3.addArticulo(articulo1);
        pedido4.addArticulo(articulo1);
        pedido4.addArticulo(articulo2);
        pedido5.addArticulo(articulo3);
        pedido5.addArticulo(articulo1);

        
        pedido1.display();
        pedido2.display();
        pedido3.display();
        pedido4.display();
        pedido5.display();

        
        pedido1.listo(true);
        pedido3.listo(true);
        pedido5.listo(true);
        

        System.out.println(pedido1.getStatusMessage());
        System.out.println(pedido2.getStatusMessage());
        System.out.println(pedido3.getStatusMessage());
        System.out.println(pedido4.getStatusMessage());
        System.out.println(pedido5.getStatusMessage());
        
    }
}
