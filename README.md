# MISEJERCICIOS - Estructura de Ejercicios Java

Este directorio contiene una colección organizada de 11 ejercicios en Java con sus correspondientes tests unitarios.

## Estructura de Carpetas

Cada ejercicio se encuentra en su propia carpeta con la siguiente estructura:

```
NOMBRE_EJERCICIO/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── javatutor/
│   │               └── App.java
│   └── test/
│       └── java/
│           └── com/
│               └── javatutor/
│                   └── AppTest.java
```

## Ejercicios Disponibles

1. **Ejemplo_1_12** - Cálculo de RES = (A + B) * 2 / 5
2. **Ejemplo_4_12** - Ordenamiento de arreglos usando selección directa
3. **Ejemplo_4_2** - Cálculo de total y promedio de 70 sueldos
4. **Problema_2_4** - Sistema de calificaciones estudiante (promedio y aprobación)
5. **Problema_2_8** - Sistema de descuentos por monto de compra
6. **Problema_3_5** - Análisis de números positivos y promedios
7. **PS_1_5** - Cálculo de interés simple mensual
8. **PS_3_38** - Sistema de facturación de platillos
9. **PS_4_10** - Gestión de arreglo ordenado (insertar/eliminar elementos)
10. **PS_4_26** - Procesamiento de matriz con arreglo resultado
11. **PS_5_5** - Sistema de gestión de hotel

## Convenciones de Nombres

- **Clase Principal**: `App.java` (en todos los ejercicios)
- **Clase de Test**: `AppTest.java` (en todos los ejercicios)
- **Paquete**: `com.javatutor` (en todos los ejercicios)

## Cómo Usar

Para cada ejercicio:

1. Navega a la carpeta del ejercicio
2. Edita `src/main/java/com/javatutor/App.java` con tu implementación
3. Ejecuta los tests en `src/test/java/com/javatutor/AppTest.java`

## Compilación y Ejecución

Si usas Maven, asegúrate de tener un `pom.xml` en la raíz de cada proyecto.

Para compilar y ejecutar tests:
```bash
cd NOMBRE_EJERCICIO
mvn test
```

## Notas Importantes

- No cambies el nombre del paquete `com.javatutor`
- No cambies el nombre de la clase principal `App`
- No cambies el nombre de la clase de test `AppTest`
- Respeta la estructura de carpetas `/src/main/` y `/src/test/`
