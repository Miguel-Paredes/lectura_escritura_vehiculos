public class vehiculos {
    int numero;
    String modelo;
    int anio;
    String marca;

    public vehiculos(){}

    public vehiculos(int numero, String modelo, int anio, String marca) {
        this.numero=numero;
        this.modelo = modelo;
        this.anio = anio;
        this.marca = marca;}

    public String getModelo() {return modelo;}

    public void setModelo(String modelo) {this.modelo = modelo;}

    public int getAnio() {return anio;}

    public void setAnio(int anio) {this.anio = anio;}

    public String getMarca() {return marca;}

    public void setMarca(String marca) {this.marca = marca;}

    public int getNumero() {return numero;}

    public void setNumero(int numero) {this.numero = numero;}
}
