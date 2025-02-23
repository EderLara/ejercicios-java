<center>
    <h1 align="center">Desarrollo del ejercicio Concesionario</h1>
</center>
<br>
<p>
Problema propuesto: <br>
Un concesionario, necesita para su gestión de ventas, un sistema de información que le permita recolectar los datos de contacto y personales de sus clientes, vendedores y vehículos. Adicional a esto se debe contar con un sistema de inventario para adicionar o eliminar vehiculos.
</p>
<br>
<h2>Solución</h2>
<br>
<p>
<h3> 1: </h3>
Para este ejercicio crearemos una clase abstracta Persona con los siguientes atributos de tipo String: (cedula, nombre, direccion,telefono) <a href="https://github.com/EderLara/ejercicios-java/blob/main/concesionario/Persona.java">ver clase Persona</a>
</p>
<br>
<h3> 2: </h3>
<p>
Después crearemos las clases : Cliente y Vendedor,
Aquí aplicaremos la herencia, en java solo podemos tener herencia de una clase a varias que dependan de la clase abstracta.
Estas clases tienen atributos propios y heredan de la clase abstracta atributos y métodos: <br>
<a href="https://github.com/EderLara/ejercicios-java/blob/main/concesionario/Vendedor.java">ver clase Vendedor</a><br>
<a href="https://github.com/EderLara/ejercicios-java/blob/main/concesionario/Cliente.java">ver clase Cliente</a><br>
Es por eso que tenemos los mismos atributos al crear el cliente y el vendedor, sin embargo los códigos de cliente y vendedor son unicos por cada objeto.
</p>
<br>
<h3> 3: </h3>
<p>
Ahora crearemos la clase Vehiculo, esta tiene atributos propios a los cuales le aplicaremos los mismos métodos: construcotr, getters y setters y el método tostring(), de esta manera podemos gestionar los atributos privados de cada clase.
La clase Vehiculo tiene los siguientes atributos: (marca, modelo, referencia, precio) <br>
<a href="https://github.com/EderLara/ejercicios-java/blob/main/concesionario/Vehiculo.java">ver clase Vehiculo</a><br>
</p>
<h3> 4: </h3>
<p>
Ya tenemos la clase Vehiculo, ahora crearemos la clase Inventario, esta clase se encarga de la gestión de los vehiculos en el concesionario, es por eso que su único atributo es una lista de objetos de la clase Vehiculos <code>private ArrayList<Vehiculo> vehiculos;</code> <br>
Cada objeto de Vehiculo se alojará en una posición de la lista, lo que facilitará el procesamiento.
<a href="https://github.com/EderLara/ejercicios-java/blob/main/concesionario/Inventario.java">ver clase Inventario</a><br>
</p>

<h3> 5: </h3>
<p>
Con la clase Vehiculo, Cliente y Vendedor, podemos registrar una venta. Esto lo haremos en la clase Venta que tiene como atributos los objetos de las clases mensionadas, le agregaremos un atributo para la fecha:  <code>private String fecha_venta;</code> <br>
<a href="https://github.com/EderLara/ejercicios-java/blob/main/concesionario/Venta.java">ver clase Venta</a><br>
</p>

<h3> 7: </h3>
<p>
Por úñtimo, crearemos la clase Concesionario, donde realizaremos la gestion de los objetos de las clases anteriores, 

En el ejercicio propuesto se plantea la creacion de métodos que capturen por teclado los atributos de las clases involucradas.

<a href="https://github.com/EderLara/ejercicios-java/blob/main/concesionario/Concesionario.java">ver clase Concesionario</a><br>
</p>
