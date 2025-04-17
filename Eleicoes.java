// Encapsulando as eleições

import java.util.Scanner;


public class Eleicoes{
    private int[] votoscandidato= new int[2];//criando um array para armazenar os resultados
    private int votosbrancos=0;
    private int votosnulos=0;
    
    public int getvotoscandidato(int indice){
        return votoscandidato[indice-1];
    }
    public int getvotosbrancos(){
        return votosbrancos;
    }
    public int getvotosnulos(){
        return votosnulos;
    }
    public void votarcandidato(int indice){
        if (indice >= 0 && indice < votoscandidato.length){
            votoscandidato[indice-1]++;
        }  
    }
    public void votarbranco(){
        votosbrancos++;
    }
    public void votarnulo(){
        votosnulos++;
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Eleicoes urna= new Eleicoes();//Criando um objeto para acessar os métodos
        
        while(true){
            System.out.println("\n--- URNA ELETRÔNICA ---");
            System.out.println("1 - Votar no candidato 1");
            System.out.println("2 - Votar no candidato 2");
            System.out.println("3 - anular voto");
            System.out.println("4 - Votar em branco");
            System.out.println("5 - Apurar eleição e encerrar");
            System.out.print("Escolha uma opção: ");
            
            int opcoes=scanner.nextInt();
            
            switch(opcoes){
                case 1:
                System.out.println("Voto computado para candidato 1.");
                urna.votarcandidato(1);
                break;
                
                case 2:
                System.out.println("Voto computado para o candidato 2.");
                urna.votarcandidato(2);
                break;
                
                case 3:
                System.out.println("Voto anulado.");
                urna.votarnulo();
                break;
                
                case 4:
                System.out.println("Voto em branco computado.");
                urna.votarbranco();
                break;
                
                case 5:
            
                    System.out.println("\n RESULTADO FINAL ");
                    System.out.println("️ Candidato 1: " + urna.getvotoscandidato[1] + " votos");
                    System.out.println("️ Candidato 2:  "+ urna.getvotoscandidato[2]+ " votos");
                    System.out.println("Votos Nulos: " + urna.getvotosnulos());
                    System.out.println("votos em Branco: " + urna.getvotosbrancos());
                    System.out.println("Eleição encerrada.");
                    scanner.close();
                    return; // Encerra o programa
            
            }
        }
            
            
           

    }
        
}
    