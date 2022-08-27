/*GUSTAVO ARAUJO DA COSTA MACENA - RGM: 30981581 */
/* formula basica = (base maior + base menor) * altura / 2 */
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Entre com a base maior: ");
        int basemaior = input.nextInt();
        System.out.print("Entre com a base menor: ");
        int basemenor = input.nextInt();
        System.out.print("Entre com a altura: ");
        int altura = input.nextInt();
        int areatrapezio = (basemaior + basemenor) * altura / 2;
        System.out.println("Area do Trapezio: " + areatrapezio);
        input.close();
    }

}
