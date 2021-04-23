package branchpruebas;

/**
 *
 * @author gpamic
 */
public class Producto {

    private int idProducto;
    private String nombre;
    private Double precio;
    private String proveedor;
    private int cantidad;

    private final static int NUMERO = 1;

    public Producto() {
    }

    public int getIdProducto() {
        return idProducto * NUMERO;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
