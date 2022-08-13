package capsulecorp;

/*
Objetivo
Identificar, modelar e implementar en Java la clase involucrada en el enunciado
especificando sus atributos, responsabilidades, al menos dos constructores y los
correspondientes getters, y setters.

Para una institución que adopta perros se requiere tener de ellos: si están en adopción o
no, raza, año aproximado de nacimiento, peso, si tiene o no chip, si está o no lastimado y el
nombre de pila que le asignaron en la institución.

Deberemos poder preguntar la edad de un perro y si es un perro factible de perderse
—entendiendo que los perros que tienen chip son los que no se pueden perder—. Por otro
lado, se puede enviar a adopción a un perro si no está lastimado y su peso es mayor a 5 kg.
* */

public class Capsule {
    private String breed;
    private Integer yearOfBirth;
    private Integer weight;
    private Boolean chip;
    private Boolean hurt;
    private String nickName;

    public Capsule() {
    }

    public Capsule( String breed, String nickName ) {
        this.breed = breed;
        this.nickName = nickName;
    }

    public Capsule( Boolean chip, Integer yearOfBirth, Boolean hurt, Integer weight ) {
        this.chip = chip;
        this.hurt = hurt;
        this.weight = weight;
        this.yearOfBirth = yearOfBirth;
    }

    public Capsule( String breed, Integer yearOfBirth, Integer weight, Boolean chip, Boolean hurt, String nickName ) {
        this.breed = breed;
        this.yearOfBirth = yearOfBirth;
        this.weight = weight;
        this.chip = chip;
        this.hurt = hurt;
        this.nickName = nickName;
    }
    public Integer getAge(){
        return 2022-yearOfBirth;
    }
    public Boolean canGetLost(){
        return !chip;
    }
    public Boolean isInAdoption(){
        return !hurt && weight>5;
    }
}
