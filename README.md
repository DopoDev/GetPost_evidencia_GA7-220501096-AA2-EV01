<h1>Información a tener en cuenta</h1>

<p>Para empezar, se debe considerar que la presente evidencia está realizada con Java utilizando como gestor de dependencias Maven.</p>

<h2>Información sobre carpetas y paquetes</h2>
<h3>carpeta Web Pages</h3>
<p>En esta carpeta se encuentran todos los archivos relacionados a las vistas del usuario, está el archivo <code>index.jsp</code> en el cual se encuentra la parte de frontEnd
del formulario web para agregar a un usuario, también agregando el botón de ver lista de usuarios. </p>
<p>Se encuentra también el archivo <code>mostrarUsuario.jsp</code> donde se mostrarán los usuarios en una especie de lista. </p>

<h3>Source Packages</h3>
<p>Esta carpeta se encuentran los paquetes de Java que hemos creado para el funcionamiento lógico.</p>
<h4>getpost_evidencia.servlets</h4>
<p>Aquí se encontrarán los servlets para la comunicación entre los archivos jsp y los métodos HTTP como el get y post. Por el momento solo se encuentra el archivo de <code>SvUsuarios.java</code>
donde está la logica del get y post.</p>

<h4>paqueteLogica_clases</h4>
<p>Aquí está toda la lógica de clases, al ser Java un lenguaje bajo el paradigma de la Programación orientada a objetos, nunca está de más encapsular eficientemente los métodos y atributos.
Aquí se encuentran dos archivos, uno correspondiente a la clase de usuario y otro para la conexión a la base de datos mediante JDBC.</p>
