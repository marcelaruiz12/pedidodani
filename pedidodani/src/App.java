import modelo.Orden;
import modelo.Producto;
import modelo.Particulares;
import modelo.Empresa;
public class App {
public static void main(String[] args) throws Exception {
Particulares particular= new Particulares("Daniela","3137279804","4567");
Empresa empresa = new Empresa("64986-8","sena", "1238546", "8534");

Producto producto1 = new Producto(1, "Carpeta", "Carpeta anillada metalica",1000);
Producto producto2 = new Producto(2, "Tinta", "Tinta china de color negro.", 3000);
Producto producto3 = new Producto(3, "Cinta pegante","Cinta adhesiva de color transparente.",800);
Producto producto4 = new Producto(4, "Cartulina", "Pliego de cartulina 60x40 cms.",600);
Empresa empresa1 = new Empresa(null,null, null, null);



Orden orden = new Orden(1, empresa);
orden.añadirItem(1, 5, producto1);
orden.añadirItem(2, 3, producto2);
orden.añadirItem(3, 2, producto1);
orden.añadirItem(4, 4, producto4);
orden.calcularTotalOrden();
System.out.println(orden);
}
}




