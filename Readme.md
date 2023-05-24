# Arquitectura MVC

---
## Cambios que he hecho:
-Cambiamos el método de mostrar velocidad en el view
por un método que gracias al getCoche de Modelo muestre todos
los datos de este.
-En el controller hacemos un método para mostrar los datos que lo único que 
hace es llamar al método de View.
-En la IU añadimos un text field para meter la matrícula del coche  y un 
botón que a partir de esta llame al método de controller de mostrar los datos.

---
## Diagrama de clases:

```mermaid
classDiagram
    class Coche {
        String: matricula
        String: modelo
        Integer: velocidad
    }
      class Controller{
          +main()
          +crearCoche(String,String)
         +aumentarVelocidad(String)
         +bajarVelocidad(String)
         
      }
      class View {+mostrarDatos(String)}
      class Model {
          ArrayList~Coche~: parking
          +crearCoche(String, String)
          +getCoche(String)
          +cambiarVelocidad(String, Integer)
          +subirVelocidad(String)
          +bajarVelocidad(String)
          +getVelocidad(String)
      }
    Controller "1" *-- "1" Model : association
    Controller "1" *-- "1" View : association
    Model "1" *-- "1..n" Coche : association
      
```

---

## Diagrama de Secuencia
```mermaid
sequenceDiagram
actor usuario
participant IU
        participant Dialog
        participant View

participant Controller
    participant Model
    usuario->>IU: click! enseñarDatos
    IU->>Controller: enseñarDatos()
    activate Controller
    Controller->>Model: getCoche
    activate Model
    Model-->>Controller: Coche
    deactivate Model
    Controller->>View: mostrarDatos
    deactivate Controller
    View-->>Dialog: mostrarDatos()

```
