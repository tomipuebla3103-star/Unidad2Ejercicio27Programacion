<img width="454" height="405" alt="image" src="https://github.com/user-attachments/assets/3b2bafc2-45de-4f7b-9de9-fab81f6a733d" />

Cálculo de Impuestos para Productos y Servicios

Descripción
Este proyecto consiste en un sistema en Java que permite calcular los impuestos y el precio final de diferentes productos y servicios. Cada categoría aplica su propia tasa impositiva, mientras que el sistema utiliza una estructura común para procesar todos los ítems.

Clases
- **ItemFacturable:** clase abstracta que contiene los atributos `nombre` y `precioBase`, y define el método `calcularImpuesto()`. También permite calcular el precio final sumando el precio base y el impuesto.
- **ProductoImportado:** representa un producto importado y calcula el impuesto correspondiente según su tasa impositiva.
- **ServicioProfesional:** representa un servicio profesional y aplica su propia tasa de impuesto.
- **AlimentoBasico:** representa un alimento de primera necesidad y calcula el impuesto según la tasa establecida para esa categoría.

Funcionamiento
En el `main` se crean diferentes ítems facturables y se almacenan en una lista. Luego, el programa recorre la colección y calcula el impuesto y el precio final de cada elemento utilizando sus propios métodos. Finalmente, se muestra por consola el desglose de cada ítem.

Recorrido del mensaje
1. El programa crea productos importados, servicios profesionales y alimentos básicos.
2. Los ítems se agregan a una lista de tipo `ItemFacturable`.
3. Se recorre la lista para procesar cada elemento.
4. Se invoca el método `calcularImpuesto()` para obtener el impuesto correspondiente.
5. Cada clase aplica su propia tasa impositiva.
6. Se calcula el precio final sumando el precio base y el impuesto.
7. Finalmente, se muestran por consola el nombre, el precio base, el impuesto y el precio final de cada ítem.

Validaciones
El sistema debe comprobar que los precios base sean válidos y que las tasas impositivas estén correctamente definidas para cada categoría.

Objetivo
Practicar el uso de clases abstractas, la herencia, el polimorfismo y la sobrescritura de métodos para calcular impuestos de manera modular y facilitar la incorporación de nuevas categorías de productos y servicios.
