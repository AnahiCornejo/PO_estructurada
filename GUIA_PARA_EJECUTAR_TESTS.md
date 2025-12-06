# Guía para Ejecutar Tests - MISEJERCICIOS

Esta guía proporciona instrucciones paso a paso para ejecutar los tests de los ejercicios en Java en tu máquina local.

---

## 📋 Requisitos Previos

Antes de comenzar, asegúrate de tener instalados los siguientes elementos:

### 1. **Java Development Kit (JDK) 11 o superior**
   - Descarga desde: https://www.oracle.com/java/technologies/downloads/
   - Verifica la instalación abriendo una terminal y ejecutando:
     ```powershell
     java -version
     ```
   - Debería mostrar algo como: `java version "11.0.x"` o superior

### 2. **Apache Maven 3.9.0 o superior**
   - Descarga desde: https://maven.apache.org/download.cgi
   - Descomprime en tu máquina
   - Agrega Maven al PATH del sistema
   - Verifica la instalación ejecutando:
     ```powershell
     mvn -version
     ```
   - Debería mostrar la versión de Maven

### 3. **Git (Opcional pero recomendado)**
   - Descarga desde: https://git-scm.com/
   - Útil para clonar o actualizar el repositorio

---

## 💻 Software Recomendado

Se recomienda utilizar **Visual Studio Code** como editor de código con las siguientes extensiones:

### Extensiones Esenciales para VS Code:

1. **Extension Pack for Java** (Microsoft)
   - ID: `vscjava.vscode-java-pack`
   - Proporciona soporte completo para Java

2. **Test Runner for Java** (Microsoft)
   - ID: `vscjava.vscode-java-test`
   - Permite ejecutar tests desde la interfaz gráfica

3. **Maven for Java** (Microsoft)
   - ID: `vscjava.vscode-maven`
   - Facilita la gestión de proyectos Maven

4. **Project Manager for Java** (Microsoft)
   - ID: `vscjava.vscode-java-project`
   - Ayuda a gestionar proyectos Java

**Para instalar las extensiones en VS Code:**
- Abre VS Code
- Ve a la pestaña de Extensiones (Ctrl+Shift+X)
- Busca cada extensión por nombre o ID
- Haz clic en "Install"

---

## 🚀 Pasos para Ejecutar los Tests

### Opción 1: Ejecutar TODOS los tests desde la raíz

1. Abre una terminal (PowerShell, CMD o Terminal integrado)
2. Navega a la carpeta `MISEJERCICIOS`:
   ```powershell
   cd c:\ruta\a\MISEJERCICIOS
   ```

3. Ejecuta el comando Maven para compilar y probar todos los módulos:
   ```powershell
   mvn clean test
   ```

4. Espera a que se completen todas las compilaciones y pruebas
5. Al final, deberías ver: `BUILD SUCCESS`

---

### Opción 2: Ejecutar tests de un ejercicio específico

1. Navega a la carpeta del ejercicio que deseas probar:
   ```powershell
   cd c:\ruta\a\MISEJERCICIOS\Ejemplo_1_12
   ```

2. Ejecuta el comando Maven:
   ```powershell
   mvn clean test
   ```

3. Observa el resultado en la terminal

---

### Opción 3: Usar VS Code (Recomendado)

1. Abre la carpeta `MISEJERCICIOS` en VS Code
2. En el explorador de archivos, navega a cualquier archivo `AppTest.java`
3. Haz clic derecho en el archivo de test
4. Selecciona "Run Tests" o "Debug Tests"
5. Los resultados aparecerán en el panel de salida

---

## 📦 Estructura del Proyecto

```
MISEJERCICIOS/
├── pom.xml (Configuración padre de Maven)
├── Ejemplo_1_12/
│   ├── pom.xml
│   ├── src/main/java/com/javatutor/App.java
│   └── src/test/java/com/javatutor/AppTest.java
├── Ejemplo_4_2/
│   ├── pom.xml
│   ├── src/main/java/com/javatutor/App.java
│   └── src/test/java/com/javatutor/AppTest.java
├── Ejemplo_4_12/
├── Problema_2_4/
├── Problema_2_8/
├── Problema_3_5/
├── PS_1_5/
├── PS_2_21/
├── PS_3_38/
├── PS_4_10/
├── PS_4_26/
└── PS_5_5/
```

Cada carpeta de ejercicio contiene:
- **App.java**: Código principal del ejercicio
- **AppTest.java**: Tests unitarios usando JUnit Jupiter 5
- **pom.xml**: Configuración Maven específica del módulo

---

## 📊 Entender la Salida de Maven

### BUILD SUCCESS ✓
Significa que todos los tests pasaron correctamente.

### BUILD FAILURE ❌
Indica que algunos tests fallaron. Revisa el output para ver:
- Qué tests fallaron
- El mensaje de error específico
- La línea donde ocurrió el error

### Ejemplo de output exitoso:
```
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.049 s
[INFO] BUILD SUCCESS
```

---

## 🧪 Lista de Ejercicios y Tests

| Ejercicio | Tests | Descripción |
|-----------|-------|-------------|
| Ejemplo_1_12 | 3 | Cálculo de RES = (A + B) * 2 / 5 |
| Ejemplo_4_2 | 3 | Promedio de 70 sueldos |
| Ejemplo_4_12 | 5 | Ordenamiento de arreglos |
| Problema_2_4 | 3 | Sistema de calificaciones |
| Problema_2_8 | 5 | Sistema de descuentos |
| Problema_3_5 | 5 | Análisis de números positivos |
| PS_1_5 | 5 | - |
| PS_2_21 | 6 | Descuentos por categoría |
| PS_3_38 | 4 | Facturación de platillos |
| PS_4_10 | 5 | Gestión de arreglo ordenado |
| PS_4_26 | 5 | Procesamiento de matriz |
| PS_5_5 | 5 | Sistema de gestión de hotel |

**Total: 53 tests**

---

## 🔧 Solución de Problemas

### "mvn is not recognized"
- Maven no está en el PATH
- Solución: Reinstala Maven y agrega su carpeta `bin` al PATH del sistema

### "javac is not recognized"
- Java no está instalado o no en el PATH
- Solución: Reinstala JDK y agrega su carpeta `bin` al PATH del sistema

### Tests fallan pero no entiendes por qué
1. Revisa el archivo `AppTest.java` del ejercicio
2. Lee el mensaje de error específico
3. Verifica que el archivo `App.java` tenga la lógica correcta
4. Asegúrate de que no hay espacios o caracteres especiales en el output

### "No tests found"
- Verifica que estés en la carpeta correcta
- Asegúrate de que la estructura de carpetas es correcta
- Revisa que los archivos de test existan

---

## 📝 Notas Importantes

1. **Dependencias automatizadas**: Maven descargará automáticamente todas las dependencias necesarias (JUnit, plugins, etc.)
2. **Primera ejecución más lenta**: La primera vez que ejecutas tests, Maven descargará las dependencias, esto puede tardar más
3. **Compilación automática**: No necesitas compilar manualmente, Maven lo hace por ti
4. **Limpieza de builds anteriores**: El comando `clean` borra los builds anteriores antes de crear uno nuevo

---

## ✅ Verificación Final

Después de ejecutar todos los tests, verifica:
- [ ] Todos los ejercicios muestran `BUILD SUCCESS`
- [ ] El número de tests ejecutados es 53
- [ ] No hay failures ni errors
- [ ] El tiempo de ejecución es menor a 1 minuto en total

---

## 📞 Preguntas Frecuentes

**P: ¿Necesito descargar todas las dependencias manualmente?**
R: No, Maven las descarga automáticamente al ejecutar los tests por primera vez.

**P: ¿Puedo ejecutar solo un test específico?**
R: Sí, navega a la carpeta del ejercicio y ejecuta `mvn test`.

**P: ¿Qué versión de Java se recomienda?**
R: Java 11 o superior. El proyecto está configurado para JDK 11.

**P: ¿Puedo usar otro IDE además de VS Code?**
R: Sí, puedes usar IntelliJ IDEA, Eclipse o NetBeans. La configuración Maven es independiente del IDE.

---

## 🎯 Resumen Rápido

```powershell
# 1. Navegar a la carpeta
cd c:\ruta\a\MISEJERCICIOS

# 2. Ejecutar todos los tests
mvn clean test

# 3. O ejecutar un ejercicio específico
cd Ejemplo_1_12
mvn test
```

¡Listo! Ahora puedes ejecutar los tests sin problemas.

---

**Última actualización**: Diciembre 5, 2025
**Versión**: 1.0
