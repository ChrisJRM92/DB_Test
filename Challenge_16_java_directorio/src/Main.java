import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class Main {
    public static void main(String[] args) {
        //Ejercicios 1
        Telefono Tp = new Telefono("movi", "09941234123", 10);
        System.out.println("Operadora: "+Tp.getOperadora());
        System.out.println("Numero: "+Tp.getNumero());
        System.out.println("Codigo: "+Tp.getCodigo());
        System.out.println("Tiene Wp: "+Tp.isTieneWp());
        System.out.println("-------------------------------------------");

        Telefono Tp2 = new Telefono("movi", "098234234", 20);
        AdminTelefono at = new AdminTelefono();
        at.activarMensajeria(Tp2);
        System.out.println("Operadora: "+Tp2.getOperadora());
        System.out.println("Numero: "+Tp2.getNumero());
        System.out.println("Codigo: "+Tp2.getCodigo());
        System.out.println("Tiene Wp: "+Tp2.isTieneWp());
        System.out.println("-------------------------------------------");

        //Ejercicio 2
        Telefono Tp3 = new Telefono("movi", "098234234", 20);
        Telefono Tp4 = new Telefono("claro", "098234234", 20);
        Telefono Tp5 = new Telefono("movi", "098234234", 20);
        AdminTelefono at1 = new AdminTelefono();
        int cuentaMovi = at1.contarMovi(Tp3, Tp4, Tp5);
        int cuentaClaro = at1.contarClaro(Tp3, Tp4, Tp5);
        System.out.println("Numeros de movistar: "+cuentaMovi);
        System.out.println("Numeros de claro: "+cuentaClaro);
        System.out.println("-------------------------------------------");

        //Ejercicios 3
        Telefono telef = new Telefono("movi", "098234234", 20);
        Contacto c = new Contacto("Sofia", "Romero", telef, 65);
        Telefono telef1 = new Telefono("movi", "099999999", 20);
        Contacto c1 = new Contacto("Andrea", "Romero", telef1, 70);
        System.out.println(c.getNombre());
        System.out.println(c.getApellido());
        System.out.println(c.getTelefono().getNumero());
        System.out.println(c.getTelefono().getOperadora());
        System.out.println(c.getPeso());
        System.out.println(c1.getNombre());
        System.out.println(c1.getApellido());
        System.out.println(c1.getTelefono().getNumero());
        System.out.println(c1.getTelefono().getOperadora());
        System.out.println(c1.getPeso());
        AdminContactos adc = new AdminContactos();
        String comparacion = adc.buscarMasPesado(c, c1);
        System.out.println("El de mayor peso es: "+comparacion);
        boolean opIgual = adc.compararOperadoras(telef, telef1);
        System.out.println("Son la misma operadora: "+opIgual);
    }
}