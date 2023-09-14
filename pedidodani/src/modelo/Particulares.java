package modelo;

public class Particulares extends Cliente{

private String cedula;
private String apellido;

public Particulares(String nombre, String telefono, String direccion) {
    super(nombre, telefono, direccion);
    this.cedula = cedula;
    this.apellido = apellido;
}

public String getCedula() {
    return cedula;
}

public void setCedula(String cedula) {
    this.cedula = cedula;
}

public String getApellido() {
    return apellido;
}

public void setApellido(String apellido) {
    this.apellido = apellido;
}
public String toString(){
    return super.toString() + ", Apellido = " + apellido + ", cedula = " + cedula;
}
}
