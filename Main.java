// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Bosque bosque1 = new Bosque("two point forest",1000,2,3,3);
        bosque1.setNombre("two point forest");
        bosque1.setAncho(10000);
        bosque1.setNumeroPlantas(565);
        bosque1.setLargo(10000);
        bosque1.setTemperatura(23);

        Animal Venado1 = new Animal("s","d","f",2,2,2,"mamifero");
        Venado1.setNombre("venado ronaldo");
        Venado1.setTipoDeAnimal("Mamifero");
        Venado1.setAltura(156);
        Venado1.setAnchura(654);
        Venado1.setEdad(65);

        Venado1.comer(Venado1.getNombre(), bosque1,56);
    }
}