public class Fontanero extends Persona implements IEmpleado {
    public void trabajar() {
        System.out.println(this.getNombreCompleto()+"esta arreglando una tubería");
    }
    public void descansar() {
        System.out.println(this.getNombreCompleto()+"esta descansando");
    }
    public boolean asistir() {
        return false;
    }
}
