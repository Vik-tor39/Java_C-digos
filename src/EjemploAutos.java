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
        clase que instanciara al objeto que queramos cuente con este método.
        - Polimorfismo: Este concepto no aplica a programacion estructurada, pero en POO en cualquier lenguaje
        este concepto existe. Se trata de definir cosas (ya sea metodos, atributos o asi) con el mismo nombre
        pero que haran cosas distintas, y pues esto en programacion estructurada no era posible. Cabe recalcar
        que el polimorfismo no aplica en POO si se nombran dos cosas de la misma manera y hacen exactamente lo
        mismo, reciben los mismos parametros y retornar el mismo tipo de dato; para que exista polimorfismo en
        POO, si o si debe haber por lo menos un parametro o un dato distinto, por mas minimo que sea.
        - Encapsulamiento: El principio de encapsulamiento se basa en tomar en cuenta unicamente la funcion o
        definicion del metodo o atributo, mas no la forma en la que se estrcuturaron o redactaron. Es decir,
        solo importa la ejecución. En POO, es importante ocultar o encapsular la informacion para programar mas
        eficientemente. Con este concpeto de ocultamiento se suman 4 palabras que se trabajaran en POO: "public",
        "private", "protectec", "default". En POO se exige que "todo método debe ser publico" y que toda
        propiedad debe ser privada". */


/*La siguiente clase resulta ser como el 'main' principal donde se ubicaran los objetos junto a sus atributos
y métodos definidos en otra clase: */
public class EjemploAutos {
    public static void main(String[] args) { /*Para evitar redactar toda esta parte manualmente podemos usar un
    comando de abreviatura que se escribe como 'psvm'*/

        /*Instaciamiento de objetos a partir de la clase 'Autos':*/
//        Autos Chevrolet = new Autos();
//        Autos Toyota = new Autos();
//        Autos Hyundai = new Autos();
//        Autos Suzuki = new Autos();
//        Autos Ford = new Autos();

        /*Instaciamiento de objetos y asignacion de valores de sus atributos empleando el concepto de
        'constructor':*/
        Autos Chevrolet = new Autos("Chevrolet", "Aveo", "Azul", 4.5);
        Autos Toyota = new Autos("Toyota", "Toyotita", "Negro", 3.6);
        Autos Hyundai = new Autos("Hyundai", "Tukson", "Blanco", 3.87);
        Autos Suzuki = new Autos("Suzuki", "Suzukisito", "Rosado",6.66);
        Autos Ford = new Autos("Ford", "Fordsito", "Rojo", 8.88);

        /* Valores asignados manualmente a estos atributos del objeto: */
//        Chevrolet.marca = "Chevrolet";
//        Chevrolet.modelo = "Aveo";
//        Chevrolet.color = "Azul";
//        Chevrolet.cilindraje = 4.5;
//
//        Toyota.marca = "Toyota";
//        Toyota.modelo = "Toyotita";
//        Toyota.color = "Negro";
//        Toyota.cilindraje = 3.6;
//
//        Hyundai.marca = "Hyundai";
//        Hyundai.modelo = "Tukson";
//        Hyundai.cilindraje = 2.7;
//
//        Suzuki.marca = "Suzuki";
//        Suzuki.modelo = "Suzukisito";
//        Suzuki.color = "Blanco";
//        Suzuki.cilindraje = 3.3;
//
//        Ford.marca = "Ford";
//        Ford.modelo = "Fordsito";
//        Ford.color = "Gris";
//        Ford.cilindraje = 3.7;

        /*Asignacion de valores a los atributos de los objetos considerando los metodos de 'asignacion':*/
//        Chevrolet.asignarMarca("Chevrolet");
//        Chevrolet.asignarModelo("Aveo");
//        Chevrolet.asignarColor("Rojo");
//        Chevrolet.asignarCilindraje(32.5);
//
//        Toyota.asignarMarca("Toyota");
//        Toyota.asignarModelo("Toyotita");
//        Toyota.asignarColor("Amarillo");
//        Toyota.asignarCilindraje(3.53);
//
//        Suzuki.asignarMarca("Suzuki");
//        Suzuki.asignarModelo("Suzukisito");
//        Suzuki.asignarColor("Negro");
//        Suzuki.asignarCilindraje(2.45);
//
//        Ford.asignarMarca("Ford");
//        Ford.asignarModelo("Forsita");
//        Ford.asignarColor("Blanco");
//        Ford.asignarCilindraje(4.44);

        /*Asignacion de valores a los atributos de los objetos considerando los metodos de 'asignacion'
        correctamente nombrados:*/
//        Chevrolet.setMarca("Chevrolet");
//        Chevrolet.setModelo("Aveo");
//        Chevrolet.setColor("Rojo");
//        Chevrolet.setCilindraje(32.5);
//
//        Toyota.setMarca("Toyota");
//        Toyota.setModelo("Toyotita");
//        Toyota.setColor("Amarillo");
//        Toyota.setCilindraje(3.53);
//
//        Hyundai.setMarca("Hyundia");
//        Hyundai.setModelo("Tukson");
//        Hyundai.setColor("Azul");
//        Hyundai.setCilindraje(5.66);
//
//        Suzuki.setMarca("Suzuki");
//        Suzuki.setModelo("Suzukisito");
//        Suzuki.setColor("Negro");
//        Suzuki.setCilindraje(2.45);
//
//        Ford.setMarca("Ford");
//        Ford.setModelo("Forsita");
//        Ford.setColor("Blanco");
//        Ford.setCilindraje(4.44);


        /*A continuación se declaran las clases "println" (al ser una clase se redacta el comando empezando en
        mayúsculas). Estas clases son, por asi decirlo, los camandos que permitiran obtener una salida de
        impresion.*/
        System.out.println("Marca: " + Toyota.getMarca());
        System.out.println("Modelo: " + Toyota.getModelo()); /*Como se observa el formato de salida de impresion que
        deseemos obtener se coloca como parametro de la clase 'printline'. En estos parametros se esta invocando
        al objeto y sus atributos, para esto hay que colocar el nombre del objeto seguido por un punto y el
        atributo que queramos emplear como parametro, es decir asi: 'NomObjeto.Atribut'.
        Y como se observa hacemos lo mismo en el resto de clases 'printline', cuyos parametros son strings que
        se concatenan con atributos de los objetos*/
        System.out.println("Color: " + Toyota.getColor());
        System.out.println("Cilindraje: " + Toyota.getCilindraje());

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
        System.out.println("\nEl combustible del auto " + Hyundai.getMarca() + " es de " + Hyundai.combustible(34.32f, 21.64f)+ " km/gln");

        /*Invocacion del otro metodo 'combustible' que igual retornara un dato tipo float como en el anterior,
        pero ahora enviara parametros de tipo entero. El sistema sabe a cual de los metodos llamar solamente
        identificando el tipo de parametros enviados, es decir ahora se enviaron valores enteros como parametro
        entonces el sistema sabe que estamos invocando al segundo metodo 'combustible':*/
        System.out.println("\nEl combustible del auto " + Chevrolet.getMarca() + " es de " + Chevrolet.combustible(32, 22)+ " km/gln");

        /*Esto de declarar un metodo con varios tipos de variables de distinto tipo de dato como parametros, se
        llama 'sobrecarga de metodos'*/
    }
}
