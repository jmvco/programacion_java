package maven_vsc._03_Herencia;

public class VisibilidadHerencia {
    public static void main(String[] args) {
        CuentaUsuario cuenta = new CuentaUsuario("Jean", 4000.50, "jean123");
        System.out.println(cuenta.titular+ " - " +cuenta.saldo + " - " +cuenta.getClave());
    // terminar cuenta premium
    }
}
class CuentaUsuario{
    public String titular;
    protected double saldo;
    private String clave;

    CuentaUsuario(String titular, double saldo, String clave){
        this.titular = titular;
        this.saldo = saldo;
        this.clave = clave;
    }
    public String getClave(){
        return this.clave;
    }
}
