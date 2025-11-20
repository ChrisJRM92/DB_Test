import clearminds.cuentas.Cuenta;

public class Main {
    public static void main(String[] args) {
        //Creo el objeto Cuenta y lo referencio con cuenta1
        Cuenta cuenta1 = new Cuenta("004281");
        //Coloco un valor de saldo en la cuenta1
        cuenta1.setSaldo(686);
        cuenta1.verCuenta();

        //Creo el objeto Cuenta y lo referencio con cuenta2
        Cuenta cuenta2 = new Cuenta("055681");
        //Coloco un valor de saldo en la cuenta2
        cuenta2.setSaldo(3266);
        cuenta2.verCuenta();

        //Creo el objeto Cuenta y lo referencio con cuenta3
        Cuenta cuenta3 = new Cuenta("086124");
        //Coloco un valor de saldo en la cuenta2
        cuenta3.setSaldo(1256765);
        cuenta3.verCuenta();

        System.out.println("-----------Valores Modificados----------");
        cuenta1.setSaldo(444);
        cuenta3.setSaldo(567);
        cuenta2.setTipo("D");
        cuenta1.verCuenta();
        cuenta2.verCuenta();
        cuenta3.verCuenta();

        Cuenta cuenta4 = new Cuenta("0987");
        cuenta4.setTipo("A");
        cuenta4.setSaldo(10);

        Cuenta cuenta5 = new Cuenta("0557");
        cuenta5.setTipo("C");
        cuenta5.setSaldo(10);

        Cuenta cuenta6 = new Cuenta("0666");
        cuenta6.setTipo("A");
        cuenta6.setSaldo(0);

        cuenta4.verCuenta();
        cuenta5.verCuenta();
        cuenta6.verCuenta();


    }
}