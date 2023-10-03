package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo!");
        // analisarCandidato(1900);
        // analisarCandidato(2000);
        // analisarCandidato(2300);
        // selecaoCandidatos();
        imprimirSelecionados();
    }

    static void imprimirSelecionados() {
        String[] candidatosSelecionados = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO" };

        for (int x = 0; x < candidatosSelecionados.length; x++) { // forma normal
            System.out.println((x + 1) + "° Candidato é " + candidatosSelecionados[x]);
        }

        System.out.println("-----------");

        for (String candidato : candidatosSelecionados) { // isso é um forEach
            System.out.println(candidato);
        }

    }

    static void selecaoCandidatos() {
        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA",
                "DANIELA", "JORGE" };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5) {

            if (candidatoAtual > candidatos.length - 1) {
                System.out.println("A lista de candidatos chegou ao fim sem ter 5 selecionados!");
                break;
            }

            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println(candidato + " foi selecionado para a vaga!");
                candidatosSelecionados++;
            } else {
                System.out.println(candidato + " NÃO foi selecionado para a vaga!");
            }

            System.out.println("Candidatos Selecionados: " + candidatosSelecionados);
            candidatoAtual++;
        }
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO!");
        else if (salarioBase == salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA!");
        else
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS!");
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
