package modelo;
import java.util.*;

public class Orden {
private int identificador;
private Vector itemsPedido;
private Cliente cliente;
public Orden(int identificador,Cliente cliente) {
this.identificador = identificador;
this.cliente = cliente;
itemsPedido = new Vector<>();
}

public int getIdentificador() {
return identificador;
}

public void setIdentificador(int identificador) {
this.identificador = identificador;
}

public int calcularTotalOrden() {
int totalOrden = 0;
for(int i = 0; i < itemsPedido.size(); i++) {

LineaPedido linea = (LineaPedido) itemsPedido.elementAt(i);

totalOrden = totalOrden + linea.calcularSubtotalLineaPedido();
}
return totalOrden;
}

public String toString() {
return "Orden [" +"cliente"+ cliente +"id = " + identificador +"]\n" + "Items del pedido\n" + itemsPedido +
"\nTotal orden = $" + calcularTotalOrden();
}
public void añadirItem(int identificador, int cantidad, Producto producto) {

LineaPedido línea= new LineaPedido(identificador, cantidad,
producto);
itemsPedido.add(línea);
}
}
