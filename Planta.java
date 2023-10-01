public class Planta extends FactoresBioticos{
    public Planta(String nombre, String habitat, String reino, int altura, int anchura, int edad, String tipoDePlanta) {
        super(nombre, habitat, reino, altura, anchura, edad);
        this.tipoDePlanta = tipoDePlanta;
    }

    String tipoDePlanta;

    public String getTipoDePlanta() {
        return tipoDePlanta;
    }

    public void setTipoDePlanta(String tipoDePlanta) {
        this.tipoDePlanta = tipoDePlanta;
    }

    public void crecer(String Nombre){
        System.out.println(nombre + " ha crecido");
    }
}
