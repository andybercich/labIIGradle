package EjercicioII;

public class CuentaBancaria {
    private String id;
    private double monto;

    public CuentaBancaria(){}
    public CuentaBancaria(String id, double monto) throws Exception {
        if (monto<0){
            throw new Exception("NO SE PUEDE CREAR UNA CUENTA CON MONTO MENOR A 0(CERO)");
        }else {

            this.monto = monto;
            this.id = id;
        }
    }

    public double getMonto() {
        return monto;
    }

    public String getId() {
        return id;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void retirar(double aRetirar) throws Exception {
        if (aRetirar>monto){
            throw new Exception("NO SE PUEDE RETIRAR, MONTO INSUFICIENTE");
        } else if (aRetirar<=0) {
            throw new Exception("NO SE PUEDE RETIRAR MONTOS MENORES O IGUALES A 0 (CERO)");
        } else {
            this.monto-=aRetirar;
            System.out.println("SE RETIRO EXITOSAMENTE");
        }
    }

    public void ingresar(double aIngresar) throws Exception {

        if (aIngresar<=0){
            throw new Exception("NO SE PUEDE INGRESAR MONTOS MENORES O IGUALES A 0 (CERO)");
        }else {
            this.monto += aIngresar;
            System.out.println("SE INGRESÓ EXITOSAMENTE");
        }

    }


}
