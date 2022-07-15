public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        System.out.println(cliente.edad=40);
        System.out.println(cliente.nombre="Moyano");
        System.out.println(cliente.telefono=8888888);
        System.out.println(cliente.credito="Autorizado");

        Trabajador trabajador= new Trabajador();
        System.out.println(trabajador.edad=53);
        System.out.println(trabajador.nombre="Rios");
        System.out.println(trabajador.telefono=8895643);
        System.out.println(trabajador.salario= 100000.00F);

    }
}
class Persona{
    int edad;
    String nombre;
    int telefono;
 }
class Cliente extends Persona {
    String credito;
}
class Trabajador extends Persona{
    float salario;

}
