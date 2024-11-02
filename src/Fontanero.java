public class Fontanero extends Persona implements IEmpleado, IVendedor{
    public void trabajar() {
        System.out.println(this.getNombreCompleto()+"esta arreglando una tubería");
    }
    public void descansar() {
        System.out.println(this.getNombreCompleto()+"esta descansando");
    }
    public boolean asistir() {
        return false;
    }
    public double pagarComision(double valor) {
        return valor*0.1;
    }
}
