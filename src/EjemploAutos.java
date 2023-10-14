/*Antes de proseguir recordemos ciertas definiciones que son importentes:
        - Clase: Una clase es la plantilla o plano modelo que define la estructura o comportamiento de los
        objetos que se instanciaran (naceran) a partir de esta, es decir una clase define los datos, los
        atributos y los métodos de los objetos.
        - Objetos: Como se dijo, estos son una instancia de una clase, es decir heredaran la estrcutura y
        comportamiento definidos en una clase.
        - Atributos: Son las variables que definen las carcaterísticas o propiedades de un objeto. Y como se dijo
        estos atributos seran definidos en esta clase de la cual se instanciaran los objetos que tendran estos
        atributos.
        - Métodos: Practicamente son funciones que definen el comportamiento de los objetos, accediendo a los
        atributos de las clases o codificando otros procesos. Logicamente estos métodos tambien se definen en la
        clase que instanciara al objeto que queramos cuente con este método.*/


/*La siguiente clase resulta ser como el 'main' principal donde se ubicaran los objetos junto a sus atributos
y métodos definidos en otra clase: */
public class EjemploAutos {
    public static void main(String[] args) { /*Para evitar redactar toda esta parte manualmente podemos usar un
    comando de abreviatura que se escribe como 'psvm'*/

        /*A continuación se instanciaran los objetos a partir de la clase en la que estan definidas sus
        atributos y métodos. En el caso de esta ejemplo se instanciaran los objetos considerando la clase
        'Autos':*/
        Autos Chevrolet = new Autos();
        Autos Toyota = new Autos();
        Autos Hyundai = new Autos();
        Autos Suzuki = new Autos();
        Autos Ford = new Autos();

        /*Ya con estos objetos creados a partir de la clase 'Autos', ahora se pueden heredar los atributos de la
        clase a estos objetos, para que ahora pasen de ser 'atributos de la clase' a ser 'atributos del objeto',
        y logicamente ahora a estos atributos del objeto se le pueden dar valores:  */
        Chevrolet.Marca = "Chevrolet"; /*Recordemos que estas propiedades (Modelo, Marca, Color) fueron
        declaradas como strings, por eso es que estos valores que ahora se les da se colocan entre comillas*/
        Chevrolet.Modelo = "Aveo";
        Chevrolet.Color = "Azul";
        Chevrolet.Cilindraje = 4.5;  /*Esta ultimo atributo contiene un valor tipo double, pues asi fue
        declarado en la clase principal*/

        Toyota.Marca = "Toyota";
        Toyota.Modelo = "Toyotita";
        Toyota.Color = "Negro";
        Toyota.Cilindraje = 3.6;

        Hyundai.Marca = "Hyundai";
        Hyundai.Modelo = "Tukson";
        Hyundai.Cilindraje = 2.7;

        Suzuki.Marca = "Suzuki";
        Suzuki.Modelo = "Suzukisito";
        Suzuki.Color = "Blanco";
        Suzuki.Cilindraje = 3.3;

        Ford.Marca = "Ford";
        Ford.Modelo = "Fordsito";
        Ford.Color = "Gris";
        Ford.Cilindraje = 3.7;

        /*Por último cabe recalcar que aunque se le de un valor a un atributo directamente en la clase principal,
        si se le asigna otro valor ya siendo 'atributo del objeto', se considerara este ultimo valor asignado por
        encima del valor asignado siendo 'atributo de la clase'. Por ejemplo colocamos un valor en el atributo
        'Color' en la clase principal, pero tambien le dimos otro valor a este atributo ahora en los objetos,
        entonces se considerara este ultimo valor asignado. Espero se entienda xd*/


        /*A continuación se declaran las clases "println" (al ser una clase se redacta el comando empezando en
        mayúsculas). Estas clases son, por asi decirlo, los camandos que permitiran obtener una salida de
        impresion.*/
        System.out.println("Marca: " + Toyota.Marca);  /*Para evitar colocar todo esto de 'System.out.println'
        basta con colocar 'sout' y automaticamente se colocara todo el comando*/
        System.out.println("Modelo: " + Toyota.Modelo); /*Como se observa el formato de salida de impresion que
        deseemos obtener se coloca como parametro de la clase 'printline'. En estos parametros se esta invocando
        al objeto y sus atributos, para esto hay que colocar el nombre del objeto seguido por un punto y el
        atributo que queramos emplear como parametro, es decir asi: 'NomObjeto.Atribut'.
        Y como se observa hacemos lo mismo en el resto de clases 'printline', cuyos parametros son strings que
        se concatenan con atributos de los objetos*/
        System.out.println("Color: " + Toyota.Color);
        System.out.println("Cilindraje: " + Toyota.Cilindraje);

        /*Y de la misma forma procederiamos con los atributos de los otros objetos:
        System.out.println("Marca: " + Chevrolet.Marca);
        System.out.println("Modelo: " + Chevrolet.Modelo);
        System.out.println("Color: " + Chevrolet.Color);
        System.out.println("Cilindraje: " + Chevrolet.Cilindraje);
        System.out.println("Marca: " + Hyundai.Marca);
        System.out.println("Modelo: " + Hyundai.Modelo);
        System.out.println("Color: " + Hyundai.Color);
        System.out.println("Cilindraje: " + Hyundai.Cilindraje);
        */
        /*Pero para evitar alargarnos incesariamente declarando cada 'printline' para cada atributo haremos uso
        de los metodos que deberan ser declarados en la clase principal, y posteriormente los invocamos para que
        sean metodos de cada objeto: */
        Chevrolet.detalleAuto();  //El método 'detalleAuto()' ahora es metodo del objeto Chevrolet
        Hyundai.detalleAuto();  //El método 'detalleHyundai()' ahora es método del objeto Hyundai

        /*Imprimir metodo que retornara una clase tipo 'String' y en la que se uso un objeto de clase
        'StringBuilder', se usa la clase 'printline' porque basicamente queremos imprimir todo una clase String*/
        System.out.println(Suzuki.moarDetalles());
        System.out.println(Ford.moarDetalles2());

        /*Invocando el método donde enviamos un parametro. Aqui toca especificarle el parametro dentro de los
        parentesis, solo vasta con colocar directamente el valor y el programa sobreentendera que se refiere al
        parametro declarado en el metodo de la clase principal: */
        System.out.println(Hyundai.acelerar(45));
        System.out.println(Chevrolet.acelerar(66));
        System.out.println(Suzuki.acelerar(32));
        System.out.println(Ford.frenado(44,21));
        System.out.println(Hyundai.frenado(45, 12));

        /*Invocando el métedo que cálcula combustible, en donde enviaremos como parametro datos tipo float. En
        java cuando enviamos estos parametros tipo float hay que recalcar que son float, para esto se debe
        colocar la letra 'f' minuscula despues del numero flotante que quereamos enviar como parametro (por
        ejemplo: 4.67f), y obviamente es en minuscula porque estamos hablando de un dato, no de una clase. Una
        peculiaridad respecto a este tema de datos flotantes, es que si no especifamos que nuestros valores son
        valores flotantes colocando la letra 'f', el sistema sobreentendera que estos valores son enteros tipo
        'double'*/
        System.out.println("\nEl combustible del auto " + Hyundai.Marca + " es de " + Hyundai.combustible(34.33f, 21.22f)+ " km/gln");

        /*Invocacion del otro metodo 'combustible' que igual retornara un dato tipo float como en el anterior,
        pero ahora enviara parametros de tipo entero. El sistema sabe a cual de los metodos llamar solamente
        identificando el tipo de parametros enviados, es decir ahora se enviaron valores enteros como parametro
        entonces el sistema sabe que estamos invocando al segundo metodo 'combustible':*/
        System.out.println("\nEl combustible del auto " + Chevrolet.Marca + " es de " + Chevrolet.combustible(32, 22)+ " km/gln");

        /*Esto de declarar un metodo con varios tipos de variables de distinto tipo de dato como parametros, se
        llama 'sobrecarga de metodos'*/
    }
}
