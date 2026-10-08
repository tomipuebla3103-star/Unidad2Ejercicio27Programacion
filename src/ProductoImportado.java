public class ProductoImportado extends ItemFacturable {
    public ProductoImportado(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    public double calcularImpuesto() {
        return preciobase * 0.30;
    }
}
