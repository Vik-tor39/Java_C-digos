/*Esta clase es en la que se definiran los atributos y metodos de los objetos:*/
public class Autos {
    /*Ahora, teniendo en cuenta el principio de encapsulamiento, se redfiniran los atributos como "private"*/
    private String marca;
    private String modelo;
    private String color;
    private Double cilindraje;

    /*Ahora que estos atributos se declararon siguiendo el principio de encapsulamiento (es decir ahora son
    private), se tiene que emplear obligatoriamente los métodos para poder acceder y ejecutar los atributos. Pero
    estos métodos ahora tambien deben estructurarse siguiendo el principio de encapsulamiento, es decir se deben
    definir como 'public', y además ahora su funcion sera leer y asignar los valores a los atributos. En lo que
    respecta a lectura del valor de los atributos, se usara 'this.' porque queremos obtener el valor especifico
    asignado a los atributos heredados a los objetos (es decir queremos leer el valor del 'atributo del objeto'),
    ya que recordemos que si no usamos el 'this.' estaremos leyendo o trabajando con los 'atributos de la clase',
    y pues no queremos eso; es más, ahora que estos atributos siguen el principio de encapsulamiento, ni siquiera
    pueden tener un valor dentro de la clase, ya que son 'private'.
    Y en lo que respecta a los metodos que serviran para asignar valores a los atributos, tendremos que usar
    parametros, especificamente cada uno de los atributos declarados, y se tendran que asignar a los 'atributos
    del objeto', es decir a 'this.atributo':
     */
//    public String leerMarca(){  //metodo de lectura del atributo 'marca'
//        return this.marca;
//    }
//    public void asignarMarca(String marca){  //metodo de asignacion del atributo 'marca'
//        this.marca = marca;
//    }
//    public String leerModelo(){  //metodo de lectura del atributo 'modelo'
//        return this.modelo;
//    }
//    public void asignarModelo(String modelo){  //metodo de asignacion del atributo 'modelo'
//        this.modelo = modelo;
//    }
//    public String leerColor(){  //metodo de lectura del atributo 'color'
//        return this.color;
//    }
//    public void asignarColor(String color){  //metodo de asignacion del atributo 'color'
//        this.color = color;
//    }
//    public Double leerCilindraje(){  //metodo de lectura del atributo 'cilindraje'
//        return this.cilindraje;
//    }
//    public void asignarCilindraje(Double cilindraje){  //metodo de asignacion del atributo 'cilindraje'
//        this.cilindraje = cilindraje;
//    }

    /*Empleando el concepto de 'constructor': */

    public Autos(String marca, String modelo, String color, Double cilindraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cilindraje = cilindraje;
    }

    /*Una vez definido que la POO se basa en utilizar metodos para cambiar el valor de las propiedades, es
        necesario tener en cuenta que lo correcto seria colocar 'get' (para leer) y 'set' (para asignar) en el
        nombre de los métodos de lectura y asignación, es decir tendriamos algo asi:*/
    public String getMarca(){  //metodo de lectura del atributo 'marca'
        return this.marca;
    }
//    public void setMarca(String marca){  //metodo de asignacion del atributo 'marca'
//        this.marca = marca;
//    }
    public String getModelo(){  //metodo de lectura del atributo 'modelo'
        return this.modelo;
    }
//    public void setModelo(String modelo){  //metodo de asignacion del atributo 'modelo'
//        this.modelo = modelo;
//    }
    public String getColor(){  //metodo de lectura del atributo 'color'
        return this.color;
    }
//    public void setColor(String color){  //metodo de asignacion del atributo 'color'
//        this.color = color;
//    }
    public Double getCilindraje(){  //metodo de lectura del atributo 'cilindraje'
        return this.cilindraje;
    }
//    public void setCilindraje(Double cilindraje){  //metodo de asignacion del atributo 'cilindraje'
//        this.cilindraje = cilindraje;
//    }

    public void detalleAuto(){
        String Color = "Cafecito";
        System.out.println("\nMarca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Color: " + this.getColor());
        System.out.println("Cilindraje: " + this.getCilindraje());
    }

    /*A continuacion se vera un nuevo metodo que hace lo mismo que el metodo de la linea 19, pero con la diferencia
    que ahora se retornara una clase tipo 'String'. Para esto convertiremos todos los atributos en un solo string
    sin importar que estos sean de distinto tipo de datos, y esto se realizara instanciando un objeto de la clase
    'Stringbuilder'. Este nuevo objeto sirve para que se le sea asignado los strings que se coloquen como parametro,
    y al final retornara toda una clase de tipo 'String' que contiene los strings que se le han sido asignado a este
    objeto de clase 'StringBuilder'*/
    public String moarDetalles(){
        StringBuilder da = new StringBuilder();
        da.append("\nMarca: " + this.getMarca());
        da.append("\nModelo: " + this.getModelo());
        da.append("\nColor: " + this.getColor());
        da.append("\nCilindraje: " + this.getCilindraje());
        return da.toString();
    }
    /*Este método recien visto puede estructurarse de manera mas optima reemplazando toda la clase 'Stringbuilder'
    por simplemente la palabra 'String', asi evitando escribir todas esas lineas de codigo, ya que practicamente
    sera lo mismo pero mas ordenado:  */
    public String moarDetalles2(){
        String da = "\nMarca: " + this.getMarca() +
                "\nModelo: " + this.getModelo() +
                "\nColor: " + this.getColor() +
                "\nCilindraje: " + this.getCilindraje();
        return da;
    }

    /*Y ahora otro nuevo método que esta vez aparte de retornar una clase tambien recibira parametros*/
    public String acelerar(int rpm){  /*rpm = revoluciones por minuto. Se declara el dato parametro como
    simplemente 'int', pues es un dato cualquiera y no una clase.*/

        //Se pueden retornar los strings escribiendolos y concatenandolos directamente:
        return "\nEl auto " + this.getMarca() + " (modelo '" + this.getModelo() + "')" + " acelera a " + rpm + " rpm."; /*El
        dato rpm no tiene la palabra reservada 'this.' pues no es una propiedad, solo es un dato.*/
    }

    /*And another metodo:  */
    public String frenado(int rpm, int fre){
        return "\nEl auto " + this.getMarca() + " frena a " + rpm/fre + " rpm";
    }

    /*Otro método que ahora retornara un dato tipo float, no una clase. Ademas contiene como parametros datos
    tipo 'float':  */
    public float combustible(float km, float gln){
        return km/gln;
    }

    //Se realizara el mismo metodo de arriba, pero ahora recibira como parametro datos enteros en lugar de floats:
    public int combustible(int km, int gln){
        return km/gln;
    }
}
