package capsulecorp;
/*
* Deberemos poder preguntar la edad de un perro y si es un perro factible de perderse
—entendiendo que los perros que tienen chip son los que no se pueden perder—. Por otro
lado, se puede enviar a adopción a un perro si no está lastimado y su peso es mayor a 5 kg.
* */
public class Main {
    public static void main( String[] args ) {
        /*( String breed, Integer yearOfBirth, Double weight, Boolean chip, Boolean hurt, String nickName ) {*/
        Capsule c1 = new Capsule("Golden", 2021, 25,true, false,"Bella");
        c1.getAge();
        c1.canGetLost();
        c1.isInAdoption();
    }
}
