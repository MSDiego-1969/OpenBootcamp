public class Main {
    public static void main(String[] args) {
        //******************************************
        Persona persona= new Persona();
        persona.setNombre("Marita");
        System.out.println(persona.getNombre());
        //******************************************
        persona.setTelefono(7716888);
        System.out.println(persona.getTelefono());
        //******************************************
        persona.setEdad(17);
        System.out.println(persona.getEdad());
        //******************************************
    }
}
class Persona {
    private String nombre;
    private int telefono;
    private int edad;
    //**************************************
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    //**************************************
    public void setTelefono(int telefono){
        this.telefono=telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
    //**************************************
    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return this.edad;
    }
}