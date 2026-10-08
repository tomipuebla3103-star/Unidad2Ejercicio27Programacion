//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ItemFacturable producto = new ProductoImportado(
            "Celular",
            100000
    );

    ItemFacturable servicio = new ServicioProfesional(
            "Diseño Web",
            50000
    );

    ItemFacturable alimento = new AlimentoBasico(
            "Arroz",
            2000
    );

    System.out.println("Producto Importado");
    System.out.println("Nombre: " + producto.nombre);
    System.out.println("Precio base: " + producto.preciobase);
    System.out.println("Impuesto: " + producto.calcularImpuesto());
    System.out.println("Precio final: " + producto.precioFinal());

    System.out.println();

    System.out.println("Servicio Profesional");
    System.out.println("Nombre: " + servicio.nombre);
    System.out.println("Precio base: " + servicio.preciobase);
    System.out.println("Impuesto: " + servicio.calcularImpuesto());
    System.out.println("Precio final: " + servicio.precioFinal());

    System.out.println();

    System.out.println("Alimento Basico");
    System.out.println("Nombre: " + alimento.nombre);
    System.out.println("Precio base: " + alimento.preciobase);
    System.out.println("Impuesto: " + alimento.calcularImpuesto());
    System.out.println("Precio final: " + alimento.precioFinal());
}
