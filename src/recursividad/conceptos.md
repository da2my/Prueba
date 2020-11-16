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

## Clase Factorial
**Comportamiento**

Pensandolo de forma recursiva, ya no diremos que numero de pasos tiene que 
repetirse, que repetia la multiplicando desde el numero hasta llegar a 1,
sino que ahora veremos como se puede reducir el problema a versiones mas 
pequeñas de si mismo. Entonces podemos decir que el | 6! = 6*5! | 5! = 5*4! |
4! = 4*3! | 3! = 3*2! | 2! = 2*1! | 1! = 1*0! | 
Tendriamos que usar como caso base que el numero sea 1, ya que las
multiplicaciones se detienen al llegar a 1 y tambien se considera por separado
al 0! que da como resultado es 1 podemos simplificar y considerar unicamete
al 0 como caso base que incluya ambos.

Para ver el funcionamiento concreto tenemos que analizar el hecho de que los 
metodos generan un registro de activacion que se apila en la *pila de llamadas*
 
| 6! = 6*5! |
Llamamos al metodo factorial(6) pasandole 6 como parametro, que se genera un 
registro para este metodo con un dato que es el parametro numero con el valor 6
y esto se apila en la memoria. 

Ejecutamos el metodo, se va por el else. El "numero" que es 6 se multiplica 
por el factorial(numero-1) que es 5 |6*factorial(5)|, pero aun no sabemos cual es el factorial
de 5; entonces tendriamos que esperar a obtener ese dato antes de poder hacer 
la multiplicacion, asi que vayamos a calcular el factorial de 5 
|factorial(6)|
|6*factorial(5)|,
|6*(5*factorial(4))| 
|6*(5*(4*factorial(3)))| 
|6*(5*(4*(3*factorial(2))))|
|6*(5*(4*(3*(2*factorial(1)))))|
|6*(5*(4*(3*(2*(1*factorial(0))))))| 
este ultimo caso llega al caso base que corta la recursividad. Pero falta los
retornos de todas estas llamadas que tenemos apiladas en la memoria
|factorial; numero [0]|
|factorial; numero [1]|
|factorial; numero [2]|
|factorial; numero [3]|
|factorial; numero [4]|
|factorial; numero [5]|
|factorial; numero [6]|
La ultima llamada que se hizo, que corresponde al registro activo en el tope
de la pila es la que tiene al parametro "numero" con el valor 0, factorial(0)retorna->1 y se 
desaloja el registro de la memoria de la pila |factorial; numero [0]|, devolviendole a la unidad 
llamadora, ese valor **1** que calculo. La unidad llamadora, que habia quedado en *espera* 
esperando el resultado de factorial(0) es la que ahora pasa a ser el registro activo y ese
registro era el del metodo con el parametro(1) que ya puede completar el valor que le devolvio
el registro anterior y retornar, desalojandose tambien de la memoria|factorial; numero [1]|;
nos quedaria como activo el registro que tenia el parametro (2) que ahora ya obtuvo el resultado
del registro que se acaba de desalojar, entonces como no hay mas instrucciones retorna y
desaparece|factorial; numero [2]|; vamos a la ejecucion de la funcion del parametro (3) que 
estaba en *espera* al resultado del factorial(2) y como ya lo obtuvo se va de la memoria
|factorial; numero [3]|; pasamos al registro con el parametro(4) que obtuvo su resultado de
factorial(3) y se va de la memoria|factorial; numero [4]|; se activa el registro de la llamada
con el parametro(5) que estaba esperando el resultado con factorial(4) y se desapila de la
memoria |factorial; numero [5]|; por ultimo se activa el registro de la primera llamada que
inicio todo esto, factorial(6) que ya obtuvo el resultado que esperaba de factorial(5) asi que
se desapila |factorial; numero [6]| y finaliza.
|factorial(0)retorna -> 				 [**1**]|
|factorial(1)retorna -> 1 * [factorial(0)=**1**]|
|factorial(2)retorna -> 2 * [factorial(1)=**1**]|
|factorial(3)retorna -> 3 * [factorial(2)=**2**]|
|factorial(4)retorna -> 4 * [factorial(3)=**6**]|
|factorial(5)retorna -> 5 * [factorial(4)=**24**]|
|factorial(6)retorna -> 6 * [factorial(5)=**120**]| 

