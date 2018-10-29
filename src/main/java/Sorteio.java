import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Sorteio extends Grupo {

    List timeAmarelo = new ArrayList();
    List timePreto = new ArrayList();

    public void sorteiaTimes() {
        this.timeAmarelo.clear();
        this.timePreto.clear();

        separaGoleiros();

    }

    public void separaGoleiros() {
        criaGrupo();
        separaPosicoes();
        Collections.shuffle(goleiros, new Random(System.currentTimeMillis()));
        int i;
        for(i = 0; i == goleiros.size(); i++) {
            if(this.timeAmarelo.size() >= this.timePreto.size()) {
                this.timePreto.add(goleiros.get(i));
            } else {
                this.timeAmarelo.add(goleiros.get(i));
            }
        }
    }

    public void separaIdades() {

    }
}
