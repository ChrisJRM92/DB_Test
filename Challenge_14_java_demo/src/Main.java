import com.krakedev.demo.Producto;

public class Main {
    public static void main(String[] args) {
        Producto p = new Producto(123, "paracetamol");
        p.setDescripcion("dolor de cabeza");
        p.setPeso(0.5);
        System.out.println("--------Producto---------");
        System.out.println("Codigo: "+p.getCodigo());
        System.out.println("Nombre: "+p.getNombre());
        System.out.println("Descripcion: "+p.getDescripcion());
        System.out.println("Peso: "+p.getPeso());
    }
}