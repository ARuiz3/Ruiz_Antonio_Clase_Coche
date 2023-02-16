/**
 * @author Antonio Ruiz Ruiz
 * @version 1.0
 * @since JDK 19
 */
public class Coche {
    /**
     *  attributes
     */

    private String modelo;
    private String marca;
    private int anio;
    private int precio;
    private String color;
    private int cantidad;

    /**
     * constructor donde se le pasan por parámetro los siguientes:
     * @param modelo
     * @param marca
     * @param anio
     * @param precio
     * @param color
     * @param cantidad
     */

    public Coche(String modelo, String marca, int anio, int precio, String color, int cantidad){
        this.modelo = modelo;
        this.marca = marca;
        this.anio = anio;
        this.precio = precio;
        this.color = color;
        this.cantidad = cantidad;
    }

    /**
     * setters & getters
     * @return
     */
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * método que siempre que la cantidad sea mayor que 0 restará 1 a this.cantidad
     * y enseñará el mensaje "1 coche vendido". Sino saltará una excepción
     * que avisará de que debe de ser positivo para poder vender.
     * @throws Exception
     */
    public void sell() throws Exception{
        if(cantidad>0){
            this.cantidad-=1;
            System.out.println("1 coche vendido");
        }else {
            throw new Exception("No quedan coches para vender");
        }
    }

    /**
     * tostring
     * @return
     */

    @Override
    public String toString() {
        return "Modelo: "+ modelo + "\n\nMarca: "
                + marca + "\n\nAño: " + anio +
                "\n\nPrecio: "+ precio + "\n\nColor: "
                + color + "\n\nCantidad: " + cantidad;
    }
}
