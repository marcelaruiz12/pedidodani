package modelo;

public class LineaPedido {
private int identificador;
private int cantidad;
private Producto producto;

public LineaPedido(int identificador, int cantidad,Producto producto){
    this.identificador = identificador;
    this.cantidad = cantidad;
    this.producto = producto;
}

public int getIdentificador() {
    return identificador;
}

public void setIdentificador(int identificador) {
    this.identificador = identificador;
}

public int getCantidad() {
    return cantidad;
}

public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
}

public Producto getProducto() {
    return producto;
}

public void setProducto(Producto producto) {
    this.producto = producto;
}
public int calcularSubtotalLineaPedido(){
return cantidad*producto.getPrecio();
}
public String toString() {
    return "Linea de Pedido [id = " + identificador + ", Cantidad = " +
    cantidad + ", Producto = " + producto + "]\n";
}
}
