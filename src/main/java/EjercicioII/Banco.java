package EjercicioII;

import java.util.ArrayList;
import java.util.Objects;

public class Banco {

    private ArrayList<CuentaBancaria> cuentaBancarias;


    public Banco (){
        cuentaBancarias = new ArrayList<>();
    }

    public boolean crearCuenta(String id, double monto) throws Exception {
        CuentaBancaria c = new CuentaBancaria(id,monto);
        cuentaBancarias.add(c);
        return true;
    }

    public boolean retirar(String id, double monto) throws Exception {

        for (CuentaBancaria c : cuentaBancarias){

            if (Objects.equals(c.getId(), id)){

                c.retirar(monto);
                return true;
            }

        }
        throw new Exception("NO SE ENCONTRÓ LA CUENTA");


    }

    public boolean ingresar(String id, double monto) throws Exception {


        for (CuentaBancaria c : cuentaBancarias){

            if (Objects.equals(c.getId(), id)){

                c.ingresar(monto);
                return true;
            }

        }

        throw new Exception("NO SE ENCONTRÓ LA CUENTA");


    }

    public double comprobacionSaldo(String id ) throws Exception {
        for (CuentaBancaria c : cuentaBancarias){

            if (Objects.equals(c.getId(), id)){

                return c.getMonto();
            }

        }

        throw new Exception("NO SE ENCONTRÓ LA CUENTA");

    }
}
