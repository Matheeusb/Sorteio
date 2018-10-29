import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Sorteio extends Grupo {

    List timeAmarelo = new ArrayList();
    List timePreto = new ArrayList();

    public void montaTimes(List lista) {
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
}
