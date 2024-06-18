package EjercicioI;

public class Usuario {

    private String nombre;
    private int edad;

    public Usuario(){}

    public Usuario(String nombre, int edad){

        this.nombre = nombre;
        this.edad = edad;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception{
        if (edad < 0){
            throw new Exception("NO SE PUEDE INGRESAR UNA EDAD MENOR A 0");
        }else {
            this.edad = edad;
        }

    }
}
