public class Carpintero extends Persona implements IEmpleado{
    public void trabajar() {
        System.out.println(this.getNombreCompleto()+" esta cortando madera");
    }
    public void descansar() {
        System.out.println(this.getNombreCompleto()+" esta descansando");
    }
    public boolean asistir() {
        return false;
    }
}
