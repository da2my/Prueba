[toc]
# Recursividad
## Clase Ejemplo
**Comportamiento del ejemplo**
Empezamos por main() y llamamos a incrementar() creando un nuevo registro 
que se activa en la memoria y dejando a la linea #8 en **espera** hasta que
el registro activo se desaloje. Pero luego incrementar() hace una llamada
a otro metodo, y ahora se debe crear otro nuevo registro haciendo que la 
instruccion que quede en **espera** sea la linea #18. lo que de debe apreciar
en este ejemplo es que ahora el registro activo es el de la funcion par(); este
es un metodo muy trivial que retorna el resultado de una operacion matematica y 
su registro de memoria se desaloja al finalizar. Volvemos a #18 y como el valor 
retornado del metodo par() fue true ejecutamos la suma y asignacion.
Y finalmente retornamos desalojando a incrementar().    