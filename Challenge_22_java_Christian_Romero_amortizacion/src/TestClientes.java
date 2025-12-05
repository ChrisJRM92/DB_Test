import com.cmc.entidades.Cliente;
import com.cmc.servicios.Banco;

public class TestClientes {
    public static void main(String[] args) {
        Banco banco = new Banco();
            Cliente cliente1 = new Cliente("1234567890", "Juan", "Perez");
            banco.registrarClientes(cliente1);
            cliente1.mostrarCliente();

          Cliente cliente2 = new Cliente("0987654321", "Maria", "Lopez");
            banco.registrarClientes(cliente2);
           cliente2.mostrarCliente();

           

          //  Intentar registrar un cliente duplicado
            Cliente cliente3 = new Cliente("1234567890", "Pedro", "Gomez");
            banco.registrarClientes(cliente3);
            
            
        }
    }

