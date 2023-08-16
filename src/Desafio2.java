import java.util.Scanner;
public class Desafio2 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

         // Solicitar a entrada do usuário para a distância física e a velocidade do plano de internet
         double distanciaServidores = 200;

         double velocidadePlano = 50;

         //TODO: Calcule a velocidade de download estimada
         double velocidadeDownloadEstimada = calcularVelocidadeDownload(distanciaServidores, velocidadePlano);

         // Apresentar o resultado
         System.out.println("\nVelocidade de Download Estimada: " + String.format("%.2f", velocidadeDownloadEstimada) + " Mbps");

         scanner.close();
     }
     public static double calcularVelocidadeDownload(double distanciaServidores, double velocidadePlano) {
         // TODO: Crie a fórmula de cálculo para a velocidade de download estimada
    	 
    	 double vd=velocidadePlano / (1+(distanciaServidores)/100);
    	 
         return vd;

     }
 }

//VD = VelocidadePlano / (1 + (DistanciaServidores / 100))