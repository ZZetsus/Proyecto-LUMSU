
public class Prestamo {
    private int minutos;
    private int cant_botellas;

    public Prestamo() {
        minutos = 0;
        cant_botellas = 0;     
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int horas) {
        this.minutos = horas;
    }

    public int getCant_botellas() {
        return cant_botellas;
    }

    public void setCant_botellas(int cant_botellas) {
        this.cant_botellas = cant_botellas;
    }
    
}
