# Arquitectura MVC con Observer

## Cambios que he hecho:
-Añadimos un nuevo método en la View que muestre un mensaje en el Dialog
si nuestro coche se ha excedido de 120 km/hr.
-Cambiamos la clase OVelocidad del Observer por una clase ObsExceso
que hace lo mismo pero también llama al método nuevo de la View
por si nos sobrepasamos de velocidad.
-Cambiamos en el Controller el Observer que añade.

---
## Diagrama de clases:

```mermaid
classDiagram
    class Observable {
        }
        class Coche {
        String: matricula
        String: modelo
        Integer: velocidad
    }
      class Controller{
          +main()
      }
      class Model {
          ArrayList~Coche~: parking
          +crearCoche(String, String, String)
          +getCoche(String)
          +subirVelocidad(String)
          +cambiarVelocidad(String, Integer)
          +getVelocidad(String)
      }
      class ObsExceso{
          +update()
          }
          Controller "1" *-- "1" ObsExceso: association
          Controller "1" *-- "1" Model : association
    Model "1" *-- "1..n" Coche : association
    Observable <|-- Model
      
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
    usuario->>IU: click! subirVelocidad
    IU->>Controller: aumentarVelocidad()
    activate Controller
    Controller->>Model: subirVelocidad()
    activate Model
     Model->>ObsExceso: update()
    deactivate Model
     activate ObsExceso
      ObsExceso->>+View: muestraExceso
      ObsExceso->>+View: muestraVelocidad
          deactivate ObsExceso
          View-->>Dialog: muestraExceso()
    View-->>Dialog: muestraVelocidad()
     deactivate View


```
```mermaid
sequenceDiagram
participant View
participant Controller
participant ObserverVelocidad
end
participant Model

    Controller->>Model: cambiarVelocidad()
    activate Model
    Model->>ObserverVelocidad: update()
    deactivate Model
    activate ObserverVelocidad
    ObserverVelocidad->>+View: muestraVelocidad
    deactivate ObserverVelocidad
    activate View
    View->>View: sout
    deactivate View
```