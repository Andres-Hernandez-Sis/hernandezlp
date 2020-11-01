# **Que es el Java Thread Scheduler?**
___________

![Imagen no encontrada](https://www.j2eeonline.com/java-certification/module7/images/scheduling.gif) 


**Java Thread Scheduler** que en español podriamos definirlo como un "Administrador de hilos" ó "Programador de subprocesos". Es una parte que se  encuentra integrada en la Java Virtual Machine (JVM) y nos permite monitorizar todos los hilos que se estan ejecutando en todos los programas.

>Cabe destacar que Java no obliga a la máquina virtual a programar subprocesos de una manera específica. Este depende de la plataforma en la cual estemos trabajando.

El scheduler determina qué hilos deberán ejecutarse, cuales no y por cuanto tiempo, pero comprobando la prioridad de todos ellos, aquellos con prioridad más alta dispondrán del procesador antes de los que tienen prioridad más baja.

![Imagen no encontrada](https://intellipaat.com/mediaFiles/2018/12/b2-1.png)

>Importante mencionar que no hay garantia de que el programador elija que subprocesos se ejecutaran.

# **Patrones del scheduler: *multitarea apropiativa y no apropiativa*.**
----
##### La multitarea apropiativa (del inglés “preemptive multitasking”) es una manera en que los sistemas operativos pueden proveer multitarea, es decir, la posibilidad de ejecutar múltiples procesos al mismo tiempo.
-----

![Imagen no encontrada ](https://asistemgrp7.weebly.com/uploads/1/1/2/1/11217557/editor/968546763.jpg?1490292244)

 - ## **Multitarea apropiativa**
 

Los schedulers apropiativos proporcionan un segmento de tiempo a todos los hilos que están corriendo en el sistema.

El scheduler decide cual será el siguiente hilo a ejecutarse y llama al método resume() para darle vida durante un período fijo de tiempo.
Cuando el hilo ha estado en ejecución ese período de tiempo, se llama a suspend() y el siguiente hilo de ejecución en la lista de procesos será relanzado (resume()).

>El secreto de casi todo es "dormir". 

>En pocas palabras, el scheduler dará ordenes a quien se "dormirá" por algunos milisegundos y quien "despertara" para para darle oportunidad a otro hilo o subproceso para que pueda ejecutarse. 


   
  - ##  **No-apropiativa**
  

 Los schedulers no-apropiativas deciden que hilo debe correr y lo ejecutan hasta que concluye. 

 El hilo tiene control total sobre el sistema mientras esté en ejecución.
   
 El método *yield()* es la forma en que un hilo fuerza al scheduler a comenzar la ejecución de otro hilo que esté esperando. Dependiendo del sistema en que esté corriendo Java, el scheduler será de un tipo u otro, preemtivo o no-preemptivo.

 ----





-----
-----
Hernandez Lopez Carlos Andres ISC 19100197