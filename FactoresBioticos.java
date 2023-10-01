public class FactoresBioticos extends Ecosistema{
    public FactoresBioticos(String nombre, String habitat, String reino, int altura, int anchura, int edad) {
        super(nombre);
        this.habitat = habitat;
        this.reino = reino;
        this.altura = altura;
        this.anchura = anchura;
        this.edad = edad;
    }

    String habitat;
    String reino;
    int altura;
    int anchura;
    int edad;

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAnchura() {
        return anchura;
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }



}
