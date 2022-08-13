package pets;

import java.util.Calendar;
import java.util.Date;

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

public class Dog {
    private boolean adopted;
    private String breed;
    private int yearOfBirth;
    private int weight;
    private boolean chip;
    private boolean hurt;
    private String name;

    //******************CONSTRUCTORS****************
    public Dog() {
    }

    public Dog( boolean adopted, String breed, int yearOfBirth, int weight, boolean chip, boolean hurt, String name ) {
        this.adopted = adopted;
        this.breed = breed;
        this.yearOfBirth = yearOfBirth;
        this.weight = weight;
        this.chip = chip;
        this.hurt = hurt;
        this.name = name;
    }

    //***************GETTERS AND SETTERS**************


    public boolean isAdopted() {
        return adopted;
    }

    public void setAdopted( boolean adopted ) {
        this.adopted = adopted;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed( String breed ) {
        this.breed = breed;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth( int yearOfBirth ) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight( int weight ) {
        this.weight = weight;
    }

    public boolean isChip() {
        return chip;
    }

    public void setChip( boolean chip ) {
        this.chip = chip;
    }

    public boolean isHurt() {
        return hurt;
    }

    public void setHurt( boolean hurt ) {
        this.hurt = hurt;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    //****************METHODS*******************

    public boolean canGetLost() {
        return !chip;
    }

    public int getAge() {
        return calculateAge();
    }

    public boolean getCanBeAdopted() {
        return !hurt && weight > 5;
    }

    private int calculateAge() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime( date );
        return calendar.get( Calendar.YEAR ) - yearOfBirth;
    }

}
