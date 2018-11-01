import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Sorteio extends Grupo {

    List<Jogador> timeAmarelo = new ArrayList<Jogador>();
    List<Jogador> timePreto = new ArrayList<Jogador>();
    double forcaTotalA;
    double forcaTotalB;
    int idadeTotalA;
    int idadeTotalB;

    public void montaTimes(List<Jogador> goleiros, List<Jogador> zagueiros,
                           List<Jogador> meioCampos, List<Jogador> atacantes,
                           List<Jogador> timeA, List<Jogador> timeB) {
         do {
             timeA.clear();
             timeB.clear();
             separaPorPosicoes(goleiros);
             separaPorPosicoes(zagueiros);
             separaPorPosicoes(meioCampos);
             separaPorPosicoes(atacantes);
             comparaForca(timeA, timeB);
             comparaIdade(timeA, timeB);
             System.out.println("###Formação do time amarelo");
             apresentaTimes(timeA);
             System.out.println("###Formação do time preto");
             apresentaTimes(timeB);
         } while (comparaForca(timeA, timeB) == false && comparaIdade(timeA, timeB) == false);
            System.out.println("Sorteio executado com sucesso!");
            System.out.println("Força total time A: " + forcaTotalA);
            System.out.println("Força total time B: " + forcaTotalB);
            System.out.println("Idade média do time A: " + idadeTotalA / timeA.size() + " anos");
            System.out.println("Idade média do time B: " + idadeTotalB / timeB.size() + " anos");
    }

    public void separaPorPosicoes(List<Jogador> lista) {
        Collections.shuffle(lista, new Random(System.currentTimeMillis()));
        int i;
        for (i = 0; i < lista.size(); i++) {
            if (this.timeAmarelo.size() == this.timePreto.size()) {
                this.timePreto.add(lista.get(i));
            } else if (this.timeAmarelo.size() != this.timePreto.size()) {
                this.timeAmarelo.add(lista.get(i));
            }
        }
    }

    public boolean comparaForca(List<Jogador> timeA, List<Jogador> timeB) {
        boolean resultado;
        forcaTotalA = 0.0;
        for (Jogador j : timeA) {
            forcaTotalA += j.getForca();
        }
        forcaTotalB = 0.0;
        for (Jogador j : timeB) {
            forcaTotalB += j.getForca();
        }
        double diferenca = forcaTotalA - forcaTotalB;
        if(diferenca <= 2.0 || diferenca <= -2.0) {
            resultado = false;
        } else {
            resultado = true;
        }
        return resultado;
    }

    public boolean comparaIdade(List<Jogador> timeA, List<Jogador> timeB) {
        boolean resultado;
        idadeTotalA = 0;
        for(Jogador j : timeA) {
            idadeTotalA += j.getIdade();
        }
        idadeTotalB = 0;
        for(Jogador j : timeB) {
            idadeTotalB += j.getIdade();
        }
        int diferenca = idadeTotalA / timeA.size() - idadeTotalB / timeB.size();
        if(diferenca > 5 || diferenca < -5) {
            resultado = false;
        } else {
            resultado = true;
        }
        return resultado;
    }

    public void apresentaTimes(List<Jogador> time) {
        int i;
        for(i = 0; i < time.size(); i++) {
            System.out.println(time.get(i).getNome());
        }
    }
}

