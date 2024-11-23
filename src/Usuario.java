
public class Usuario extends Prestamo {

    private final int ID;

    private int telefono;

    private String Nombre;
    private String Contraseña;

    public Usuario(String Nombre, int ID, int telefono, String Contraseña) {
        super();
        this.ID = ID;
        this.Nombre = Nombre;
        this.telefono = telefono;
        this.Contraseña = Contraseña;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getID() {
        return ID;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    

}
