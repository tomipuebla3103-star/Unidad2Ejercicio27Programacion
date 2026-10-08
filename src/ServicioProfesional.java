public class ServicioProfesional extends ItemFacturable{
    public ServicioProfesional(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    public double calcularImpuesto() {
        return preciobase * 0.21;
    }
}
