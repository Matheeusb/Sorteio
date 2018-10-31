import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Sorteio extends Grupo {

    List<Jogador> timeAmarelo = new ArrayList<Jogador>();
    List<Jogador> timePreto = new ArrayList<Jogador>();
    double forcaTotalA = 0;
    double forcaTotalB = 0;

    public void montaTimes(List<Jogador> lista) {
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

    public void estaParelho(List<Jogador> timeA, List<Jogador> timeB) {
        forcaTotalA = 0.0;
        for (Jogador j : timeA) {
            forcaTotalA += j.getForca();
        }
        forcaTotalB = 0.0;
        for (Jogador j : timeB) {
            forcaTotalB += j.getForca();
        }
        double diferenca = forcaTotalA - forcaTotalB;
        System.out.println(forcaTotalA);
        System.out.println(forcaTotalB);
        System.out.println(diferenca);
    }
}

