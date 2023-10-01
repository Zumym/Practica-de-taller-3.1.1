public class FactoresAbioticos extends Ecosistema{

    int temperatura;
    int ancho;
    int largo;

    public FactoresAbioticos(String nombre, int temperatura, int ancho, int largo) {
        super(nombre);
        this.temperatura = temperatura;
        this.ancho = ancho;
        this.largo = largo;
    }
    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

}
