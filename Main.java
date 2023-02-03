import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            // List of Circulos
            List<Circulo> circulos = new ArrayList<Circulo>();
            // Tamanho da caixa
            Double caixa;

            int m = sc.nextInt();

            for (int i = 0; i < m; i++) {
                Double raio = sc.nextDouble();
                circulos.add(new Circulo(raio));
            }

            for (int i = 0; i < m; i++) {
                System.out.println("CIRCULO: " + circulos.get(i).raio);
            }

            System.out.println("CAIXA: " + calculaCaixa(circulos));

            
            
            n--;
        }
    }

    private static double calculaCaixa(List<Circulo> circulos) {
        double caixa = 0;
        //primeiro circulo
        Circulo primeiro = circulos.get(0);
        Circulo right = circulos.get(0); //circulo mais a direita
        caixa += primeiro.raio * 2;
        primeiro.x = primeiro.raio;
        primeiro.y = primeiro.raio;

        
        for (Circulo circulo : circulos) {
            caixa += circulo.raio * 2;
        }
        return caixa;
    }

}

class Circulo {

    public double raio;
    public double x;
    public double y;

    public Circulo(double raio) {
        this.raio = raio;
    }
}

// gh