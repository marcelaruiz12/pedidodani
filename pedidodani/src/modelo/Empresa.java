package modelo;

public class Empresa extends Cliente {
private String nit;
public Empresa(String nit,String nombre, String telefono, String direccion) {
    super(nombre, telefono, direccion);
    this.nit = nit;
}
public String getNit() {
    return nit;
}
public void setNit(String nit) {
    this.nit = nit;
}
public String toString(){
return super.toString() + " NIT = " + nit;
}
}
