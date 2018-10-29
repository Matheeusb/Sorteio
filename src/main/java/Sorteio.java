import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Sorteio extends Grupo {

    List<Jogador> timeAmarelo = new ArrayList();
    List<Jogador> timePreto = new ArrayList();
    double forcaTotalAmarelo = 0;
    double forcaTotalPreto = 0;

    public void montaTimes(List<Jogador> lista) {
        Collections.shuffle(lista, new Random(System.currentTimeMillis()));
        int i;
        for(i = 0; i < lista.size(); i++) {
            if(this.timeAmarelo.size() == this.timePreto.size()) {
                this.timePreto.add(lista.get(i));
            } else if (this.timeAmarelo.size() != this.timePreto.size()){
                this.timeAmarelo.add(lista.get(i));
            }
        }
    }

    public void estaParelho() {
        for(Jogador j : timeAmarelo) {
            forcaTotalAmarelo += j.getForca();
        }

        for(Jogador j : timePreto) {
            forcaTotalPreto += j.getForca();
        }

        double diferenca = Double.compare(forcaTotalAmarelo, forcaTotalPreto);
        System.out.println(diferenca);
    }
}
