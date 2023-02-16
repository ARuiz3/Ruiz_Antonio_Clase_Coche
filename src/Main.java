public class Main {
    public static void main(String[] args) {
        Coche c1 = new Coche("Modelo S","Tesla",2021,94990,"Blanco",5);
        System.out.println(c1);
        try {
            c1.sell();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        System.out.println("\n" + c1.getModelo());
        System.out.println("\n" + c1.getMarca());
        System.out.println("\n" + c1.getAnio());
        System.out.println("\n" + c1.getPrecio());
        System.out.println("\n" + c1.getColor());
        System.out.println("\n" + c1.getCantidad());
        c1.setAnio(2022);
        c1.setPrecio(110000);
        c1.setColor("Black");
        c1.setCantidad(10);
        System.out.println(c1);
    }
}