# Reto Técnico - Automatización de Pruebas



---

## Descripción del Proyecto

Automatización de la prueba funcional sobre el formulario **Student Registration Form** de [DemoQA](https://demoqa.com/automation-practice-form), validando el registro exitoso de un aspirante con sus datos personales e información adicional.

El escenario automatizado cubre:
- Apertura del formulario de registro
- Diligenciamiento de datos personales (nombre, apellido, email, género, móvil, fecha de nacimiento)
- Ingreso de información adicional (materia, hobby, imagen, dirección, estado y ciudad)
- Envío del formulario
- Validación de la confirmación del registro

---

## Herramientas Utilizadas

| Herramienta         | Versión       | Propósito                                  |
|---------------------|---------------|--------------------------------------------|
| **Java**            | 11+           | Lenguaje de programación base              |
| **Groovy**          | —             | Soporte de plugin Gradle                   |
| **Selenium WebDriver** | (incluido en Serenity) | Automatización del navegador  |
| **Google Chrome**   | Última estable | Navegador de ejecución                     |
| **ChromeDriver**    | Auto-descarga | Driver de Chrome (autodownload habilitado) |
| **IntelliJ IDEA / VS Code** | —  | IDE de desarrollo                          |

---

## Gestor de Dependencias

**Gradle** (`build.gradle`)

---

## Librerías y Frameworks

| Librería / Framework                        | Versión    | Descripción                                         |
|---------------------------------------------|------------|-----------------------------------------------------|
| `net.serenity-bdd:serenity-core`            | 4.0.19     | Core del framework Serenity BDD                     |
| `net.serenity-bdd:serenity-cucumber`        | 4.0.19     | Integración Serenity con Cucumber                   |
| `net.serenity-bdd:serenity-screenplay`      | 4.0.19     | Patrón Screenplay para automatización               |
| `net.serenity-bdd:serenity-junit`           | 4.0.19     | Integración Serenity con JUnit                      |
| `net.serenity-bdd:serenity-report-resources`| 4.0.19     | Recursos para generación de reportes HTML           |
| `io.cucumber:cucumber-junit`                | 7.6.0      | Runner de Cucumber con JUnit                        |
| `io.cucumber:datatable`                     | 7.6.0      | Manejo de tablas de datos en Cucumber               |
| `org.slf4j:slf4j-api`                       | 2.0.0-alpha5 | API de logging                                    |
| `org.slf4j:slf4j-simple`                    | 2.0.0-alpha5 | Implementación simple de SLF4J                    |
| `org.apache.logging.log4j:log4j-core`       | 2.18.0     | Framework de logging Log4j2                         |

---

## Estructura del Proyecto

```
src/
├── main/java/com/pruebatecnica/
│   ├── pagesObjects/      # Page Objects (elementos de las páginas)
│   └── steps/             # Steps del patrón Screenplay/Steps
└── test/
    ├── java/com/pruebatecnica/
    │   ├── runners/        # Runner de Cucumber (RegistroAspiranteRunner)
    │   └── stepDefinitions/ # Definiciones de pasos Cucumber
    └── resources/
        ├── feature/        # Archivos .feature (Gherkin en español)
        └── serenity.conf   # Configuración de Serenity (driver, screenshots, etc.)
```

---

## Prerrequisitos

- **Java JDK 11** o superior instalado y configurado en el `PATH`
- **Google Chrome** instalado (el ChromeDriver se descarga automáticamente)
- Conexión a internet (para acceder a `https://demoqa.com`)

---

## Comandos de Ejecución

### Ejecutar todas las pruebas y generar reporte

```bash
./gradlew clean test aggregate
```

> En Windows usar `gradlew.bat`:
> ```cmd
> gradlew.bat clean test aggregate
> ```

### Ejecutar pruebas filtrando por tag

```bash
./gradlew clean test -Dcucumber.filter.tags="@RegistroAspirante"
```

### Solo generar el reporte Serenity (sin re-ejecutar pruebas)

```bash
./gradlew aggregate
```

---

## Reporte de Resultados

Tras la ejecución, el reporte HTML de Serenity BDD queda disponible en:

```
target/site/serenity/index.html
```

Ábrelo en cualquier navegador para visualizar el detalle de cada paso, capturas de pantalla y estado de los escenarios.
