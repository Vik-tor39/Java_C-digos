/*Esta clase es en la que se definiran los atributos y metodos de los objetos:*/
public class Autos {
    /*A continuacion se definiran las variables que representaran los atributos de esta clase. Para esto es muy
    importante considerar que en POO, al definir atributos, el tipo de dato de estas tiene que ser declarado
    redactando el nombre entero del tipo de dato (por ejemplo 'Integer' o 'Double') mas no usando su abreviatura
    (por ejemplo 'int' o 'char'), puesto que estamos declarando variables de manera orientada a objetos, es decir
    segun yo se tiene declarars asi porque, estos atributos al formar parte de los objetos, estos pueden darle
    cualquier valor atributo */
    String Marca;
    String Modelo;
    String Color = "Amarillito";  /*En esta clase 'Autos' se le esta asignando un valor al atributo 'Color'*/
    Double Cilindraje;

    /*A continuacion se definiran los métodos de esta clase. Ya se había mencionado, pero hay que recordar que
    all metodo son como funciones, y por ende se debera declarar el metodo como un funcion, es decir con su nombre,
    el dato que va a retornar y entre parentesis los parametros que recibira. Cabe recalcar que estos metodos
    pueden ser clases (creo) y por lo tanto el dato que van a retornar se debe declarar con mayuscula, y ademas en
    POO tanto metodos, atributos y clases tienen que ser de tipo 'public' o 'private': */
    public void detalleAuto(){
        String Color = "Cafecito";
        System.out.println("\nMarca: " + this.Marca); /*Se usa esta notacion 'this.' para que se emplee el valor
        dado al 'atributo del objeto', y no a un valor definido en esta clase principal, es decir que no use un
        valor dado al 'atributo de la clase'. Por ejemplo podemos declarar un 'atributo de la clase' dentro de este
        metodo y darle un valor cualquiera como en la linea 20, y si no usasemos la notacion 'this.' este 'atributo
        de la clase' se heredaria al objeto por encima del valor que se le haya dado a su 'atributo del objeto', en
        este caso el atributo 'Color'. Por eso es importante saber usar el 'this.'*/
        System.out.println("Modelo: " + this.Modelo);
        System.out.println("Color: " + this.Color);
        System.out.println("Cilindraje: " + this.Cilindraje);
    }

    /*A continuacion se vera un nuevo metodo que hace lo mismo que el metodo de la linea 19, pero con la diferencia
    que ahora se retornara una clase tipo 'String'. Para esto convertiremos todos los atributos en un solo string
    sin importar que estos sean de distinto tipo de datos, y esto se realizara instanciando un objeto de la clase
    'Stringbuilder'. Este nuevo objeto sirve para que se le sea asignado los strings que se coloquen como parametro,
    y al final retornara toda una clase de tipo 'String' que contiene los strings que se le han sido asignado a este
    objeto de clase 'StringBuilder'*/
    public String moarDetalles(){
        StringBuilder da = new StringBuilder();
        da.append("\nMarca: " + this.Marca);
        da.append("\nModelo: " + this.Modelo);
        da.append("\nColor: " + this.Color);
        da.append("\nCilindraje: " + this.Cilindraje);
        return da.toString();
    }
    /*Este método recien visto puede estructurarse de manera mas optima reemplazando toda la clase 'Stringbuilder'
    por simplemente la palabra 'String', asi evitando escribir todas esas lineas de codigo, ya que practicamente
    sera lo mismo pero mas ordenado:  */
    public String moarDetalles2(){
        String da = "\nMarca: " + this.Marca +
                "\nModelo: " + this.Modelo +
                "\nColor: " + this.Color +
                "\nCilindraje: " + this.Cilindraje;
        return da;
    }

    /*Y ahora otro nuevo método que esta vez aparte de retornar una clase tambien recibira parametros*/
    public String acelerar(int rpm){  /*rpm = revoluciones por minuto. Se declara el dato parametro como
    simplemente 'int', pues es un dato cualquiera y no una clase.*/

        //Se pueden retornar los strings escribiendolos y concatenandolos directamente:
        return "\nEl auto " + this.Marca + " (modelo '" + this.Modelo + "')" + " acelera a " + rpm + " rpm."; /*El
        dato rpm no tiene la palabra reservada 'this.' pues no es una propiedad, solo es un dato.*/
    }

    /*And another metodo:  */
    public String frenado(int rpm, int fre){
        return "\nEl auto " + this.Marca + " frena a " + rpm/fre + " rpm";
    }

    /*Otro método que ahora retornara un dato tipo float, no una clase. Ademas contiene como parametros datos
    tipo 'float':  */
    public float combustible(float km, float gln){
        return km/gln;
    }

    //Se realizara el mismo metodo de arriba, pero ahora recibira como parametro datos enteros en lugar de floats:
    public float combustible(int km, int gln){
        return km/gln;
    }
}
