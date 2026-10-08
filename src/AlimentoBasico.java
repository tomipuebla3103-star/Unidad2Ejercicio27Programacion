public class AlimentoBasico extends ItemFacturable{
    public AlimentoBasico(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    public double calcularImpuesto() {
        return preciobase * 0.10;
    }
}
