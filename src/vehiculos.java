public class vehiculos {
    String modelo;
    int anio;
    String marca;

    public vehiculos(){}

    public vehiculos(String modelo, int anio, String marca) {
        this.modelo = modelo;
        this.anio = anio;
        this.marca = marca;}

    public String getModelo() {return modelo;}

    public void setModelo(String modelo) {this.modelo = modelo;}

    public int getAnio() {return anio;}

    public void setAnio(int anio) {this.anio = anio;}

    public String getMarca() {return marca;}

    public void setMarca(String marca) {this.marca = marca;}
}
