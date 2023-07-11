public class vehiculos {
    String nombre;
    int anio;
    String modelo;

    public vehiculos(){}
    public vehiculos(String nombre, int anio, String modelo) {
        this.nombre = nombre;
        this.anio = anio;
        this.modelo = modelo;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public int getAnio() {return anio;}

    public void setAnio(int anio) {this.anio = anio;}

    public String getModelo() {return modelo;}

    public void setModelo(String modelo) {this.modelo = modelo;}
}
