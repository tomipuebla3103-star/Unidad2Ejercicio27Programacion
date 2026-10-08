public abstract class ItemFacturable {
    String nombre;
    double preciobase;
    public ItemFacturable(String nombre, double preciobase){
        this.nombre= nombre;
        this.preciobase=preciobase;
    }

    public abstract double calcularImpuesto();

    public double precioFinal() {
        return preciobase + calcularImpuesto();
    }
}

