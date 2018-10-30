import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Sorteio extends Grupo {

    List<Jogador> timeAmarelo = new ArrayList<Jogador>();
    List<Jogador> timePreto = new ArrayList<Jogador>();
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
        int i;
        for(Jogador j : timeAmarelo; i++) {
            forcaTotalAmarelo += timeAmarelo.get().getForca();
        }
        for(i = 0; i == timePreto.size(); i++) {
            forcaTotalPreto += timePreto.get(i).getForca();
        }
        double diferenca = Double.compare(forcaTotalAmarelo, forcaTotalPreto);
        System.out.println(forcaTotalAmarelo);
        System.out.println(forcaTotalPreto);
        System.out.println(diferenca);
    }
}
