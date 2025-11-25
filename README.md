📚 Learniverse - Plataforma de Aprendizaje de Programación
🚀 Resumen del Proyecto
Learniverse es una biblioteca digital educativa desarrollada para organizar y servir contenido de programación de forma estructurada, interactiva y escalable.
El sistema permite gestionar más de 100 conceptos de programación mediante secciones, ejemplos y recursos multimedia.

Como Arquitecto y Desarrollador Full Stack, mi enfoque estuvo en el diseño de una base de datos robusta, la implementación de seguridad con Spring Security y la construcción de una arquitectura modular preparada para una futura migración a React y API REST.

🛠️ Stack Tecnológico Clave
Mi enfoque técnico se centra en un desarrollo Java Full Stack moderno, con herramientas que garantizan escalabilidad, seguridad y mantenibilidad.

Categoría	Tecnologías / Herramientas
Lenguaje	Java
Framework	Spring Boot Spring Security
Persistencia	Hibernate JPA
Base de Datos	MySQL PostgreSQL
Build Tool	Gradle
Frontend	Thymeleaf
DevOps / Despliegue	Render CI/CD
⚙️ Arquitectura y Logros Técnicos Destacados
1. Diseño y Estructura de Datos
Modelo relacional jerárquico con entidades Topic → Subtopic → Content → Section, optimizado con Hibernate/JPA.
Validaciones y restricciones a nivel de entidad para asegurar integridad de los datos.
Control de acceso seguro con Spring Security, roles y permisos diferenciados (ADMIN / USER).
2. Arquitectura Modular y Escalable
Separación clara de capas (Controladores, Servicios, Repositorios) bajo principios SOLID.
Estructura de código preparada para la futura exposición de una API REST y la migración del frontend a React.
Arquitectura limpia y desacoplada para facilitar la mantenibilidad y extensión.
3. Mantenimiento y Despliegue
Mantenimiento activo y refactorización continua para mejorar calidad y legibilidad.
Despliegue automatizado en Render con integración Gradle.
Gestión de versiones y documentación técnica alineada con buenas prácticas de desarrollo profesional.
🚀 Funcionalidades Clave
Autenticación y Roles: Registro e inicio de sesión de usuarios.
Gestión de Contenido (CRUD): Administración de temas, subtemas, contenidos y secciones.
Navegación Dinámica: Exploración por categorías y navegación secuencial entre secciones.
Seguridad: Restricciones de acceso basadas en roles y sesiones seguras.
📈 Planes a Futuro (Crecimiento del Proyecto)
⚛️ Migrar el frontend a React para mejorar la experiencia del usuario (SPA).
🔗 Implementar API REST para integración con aplicaciones externas.
☁️ Pipeline CI/CD completo con pruebas automatizadas y despliegue continuo.
🔍 Búsqueda avanzada por título, etiquetas y contenidos.
🖥️ Demostración en Producción
Puedes explorar la versión desplegada del proyecto aquí:
🔗 Demo URL: https://learniverse-drw7.onrender.com/

📥 Cómo Ejecutar Localmente
1️⃣ Clonar el Repositorio
git clone https://github.com/danielgomez-engineer/Learniverse.git
cd Learniverse
2️⃣ Configurar Base de Datos (PostgreSQL)

Edita el archivo application.yml con tus credenciales locales:

spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/learniverse_db
    username: postgres
    password: tu_contraseña
  jpa:
    hibernate:
      ddl-auto: update
    properties:
      hibernate:
        dialect: org.hibernate.dialect.PostgreSQLDialect
3️⃣ Ejecutar con Gradle

./gradlew bootRun
El servidor estará disponible en: 👉 http://localhost:8080

👨‍💻 Autor

Desarrollado por: Daniel Felipe Gómez Ferreira

💼 LinkedIn

📧 danielf23.dev@gmail.com

🌐 Portafolio (en construcción)

🧠 Este proyecto está bajo la Licencia MIT. Cada mejora de Learniverse representa un paso más en mi camino hacia la excelencia técnica y la construcción de software educativo de impacto.
