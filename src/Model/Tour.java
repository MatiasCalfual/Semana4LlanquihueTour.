package Model;

public class Tour {
    private String nombreDestino;
    private String comuna;
    private int precio;

    // Constructor
    public Tour(String nombreDestino, String comuna, int precio) {
        this.nombreDestino = nombreDestino;
        this.comuna = comuna;
        this.precio = precio;
    }

    // Getters y Setters
    public String getNombreDestino() {
        return nombreDestino;
    }

    public void setNombreDestino(String nombreDestino) {
        this.nombreDestino = nombreDestino;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    // Método toString para visualizar los datos de forma limpia
    @Override
    public String toString() {
        return "Tour{" +
                "Destino='" + nombreDestino + '\'' +
                ", Comuna='" + comuna + '\'' +
                ", Precio=$" + precio +
                '}';
    }
}