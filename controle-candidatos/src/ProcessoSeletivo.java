import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo seletivo");

        String [] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto"};
        for (String candidato: candidatos) {
            entrandoEmContato(candidato);
        }



        //Scanner scann1 = new Scanner(System.in).useLocale(Locale.US);
        //System.out.println("Digite o valor do salario: ");
        //analisarCandidatos(scann1.nextDouble());
        //selecaoCandidatos();
        //imprimirSelecionados();

}
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do { 
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado com sucesso!");

        } while (continuarTentando && tentativasRealizadas < 3);
        if (atendeu)
            System.out.println("Conseguimos contato com " + candidato + 
            " Na " + tentativasRealizadas + " tentativa ");
        else
            System.out.println("Não conseguimos contato com " + candidato + 
            ", número maximo tentativas " + tentativasRealizadas + " Realizadas " );
    }

    //método auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto"};
        
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de n° " + (indice+1) + " é " + candidatos[indice]);

        }

        System.out.println("Forma abreviada de interação For each");

        for(String candidato: candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    } 

    static void selecaoCandidatos(){
        String [] canditatos = {"Felipe","Marcia","Julia","Paulo","Augusto",
        "Monica","Fabricio","Mirela","Daniela","Jorde"};

        int canditatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(canditatosSelecionados < 5 && candidatosAtual < canditatos.length){
            String candidato = canditatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " Solicitou este valor de salario: " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " Foi selecionado para vaga!");
                canditatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidatos(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if (salarioBase == salarioPretendido)
            System.out.println("Ligar para o canditado com contra proposta");
        else{
            System.out.println("Aguardando demais candidatos");
        }
    }
}