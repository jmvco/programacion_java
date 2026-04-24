package maven_vsc._05_Interfaz;
public class InterfazBasica
{
    public static void main(String[] args)
    {
        Lampara lamparita = new Lampara();
        lamparita.encender();
    }
}
interface Aparato
{
    public void encender();
}
class Lampara implements Aparato
{
    public void encender()
    {
        System.out.println("La lámpara se enciende");
    }
}
  