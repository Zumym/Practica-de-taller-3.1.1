public class Animal extends FactoresBioticos{
    String tipoDeAnimal;
    public Animal(String nombre, String habitat, String reino, int altura, int anchura, int edad, String tipoDeAnimal) {
        super(nombre, habitat, reino, altura, anchura, edad);
        this.tipoDeAnimal = tipoDeAnimal;
    }

    public String getTipoDeAnimal() {
        return tipoDeAnimal;
    }

    public void setTipoDeAnimal(String tipoDeAnimal) {
        this.tipoDeAnimal = tipoDeAnimal;
    }

    public void comer(String nombre, Bosque bosque,int cantidadAComer){
        System.out.println(nombre + " esta comiendo");
        bosque.numeroPlantas -= cantidadAComer;
        System.out.println("ahora solo hay "+ bosque.getNumeroPlantas() + " plantas restantes");

    }


}
