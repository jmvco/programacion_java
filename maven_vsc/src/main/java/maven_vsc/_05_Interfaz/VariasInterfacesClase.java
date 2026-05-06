package maven_vsc._05_Interfaz;
public class VariasInterfacesClase {
    public static void main(String[] args) {
        // Ejercicio 05
        Artista artista = new Artista();
        artista.cantar();
        artista.bailar(); } }
class Artista implements Cantante,Bailarin{
    public void cantar(){
        System.out.println("El artista esta cantando"); }
    public void bailar(){
        System.out.println("El artista esta bailando"); } }
interface Cantante {
    public void cantar(); }
interface Bailarin {
    public void bailar(); }
