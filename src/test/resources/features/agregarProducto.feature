#language: es
Característica: Agregar un producto al carrito de compras

  @AgregarCarrito
  Escenario: Producto agregado al carrito de compras
    Dado que el usuario ingresa a la página de DemoBlaze y selecciona un producto
    Cuando el usuario da click en el producto para agregarlo al carrito de compras
    Entonces el usuario puede ver la alerta que confirma el producto dentro del carrito