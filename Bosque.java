public class Bosque extends FactoresAbioticos {

    int numeroPlantas;

    public Bosque(String nombre, int temperatura, int ancho, int largo, int numeroPlantas) {
        super(nombre, temperatura, ancho, largo);
        this.numeroPlantas = numeroPlantas;
    }

    public void regenerarPlantasBosque (){
        this.numeroPlantas +=10;
        System.out.println("ahora hay mas plantas");
    }

    public int getNumeroPlantas() {
        return numeroPlantas;
    }

    public void setNumeroPlantas(int numeroPlantas) {
        this.numeroPlantas = numeroPlantas;
    }
}
