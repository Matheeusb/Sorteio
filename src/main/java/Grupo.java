import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Grupo {

    List<Jogador> jogadores = new ArrayList<Jogador>();
    List goleiros = new ArrayList();
    List zagueiros = new ArrayList();
    List meioCampos = new ArrayList();
    List atacantes = new ArrayList();
    static double forcaMedia;
    static int idadeMedia;

    public void criaGrupo() {
        jogadores.clear();
        jogadores.add(new Jogador("Matheus", 24, "Zagueiro", 3));
        jogadores.add(new Jogador("Lucas", 19, "Zagueiro", 4));
        jogadores.add(new Jogador("Clodoaldo", 38, "Zagueiro", 2));
        jogadores.add(new Jogador("Adacir", 50, "Zagueiro", 2));
        jogadores.add(new Jogador("Batata", 35, "Meio", 5));
        jogadores.add(new Jogador("Vinicius", 28, "Meio", 5));
        jogadores.add(new Jogador("Altair", 25, "Meio", 4));
        jogadores.add(new Jogador("Gean", 27, "Meio", 2));
        jogadores.add(new Jogador("Roger", 32, "Atacante", 2));
        jogadores.add(new Jogador("Kaka", 35, "Atacante", 4));
        jogadores.add(new Jogador("Schutz", 33, "Goleiro", 5));
        jogadores.add(new Jogador("Digão", 35, "Goleiro", 4));

        calculaMediaForca();
        calculaMediaIdade();
        separaPosicoes();
    }

    public void calculaMediaForca() {
        double forcaTotal = 0;
        for (Jogador j : jogadores) {
            forcaTotal += j.getForca();
        }
        forcaMedia = forcaTotal / jogadores.size();
    }

    public void calculaMediaIdade() {
        int idadeTotal = 0;
        for (Jogador j : jogadores) {
            idadeTotal += j.getIdade();
        }
        idadeMedia = idadeTotal / jogadores.size();
//        System.out.println("##### Idade Média Grupo #####");
//        System.out.println("A idade média do grupo é de " + idadeMedia + " anos de idade");
//        System.out.println("#### #### #### #### #### ####");
    }

    public void separaPosicoes() {
        for (Jogador j : jogadores) {
            if (j.getPosicao() == "Goleiro") {
                this.goleiros.add(j.getNome());
            } else if (j.getPosicao() == "Zagueiro") {
                this.zagueiros.add(j.getNome());
            } else if (j.getPosicao() == "Meio") {
                this.meioCampos.add(j.getNome());
            } else if (j.getPosicao() == "Atacante") {
                this.atacantes.add(j.getNome());
            }
        }
    }
}
