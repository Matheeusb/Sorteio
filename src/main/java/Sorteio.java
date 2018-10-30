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
        for (i = 0; i < lista.size(); i++) {
            if (this.timeAmarelo.size() == this.timePreto.size()) {
                this.timePreto.add(lista.get(i));
            } else if (this.timeAmarelo.size() != this.timePreto.size()) {
                this.timeAmarelo.add(lista.get(i));
            }
        }
    }

    public void estaParelho(List<Jogador> timeAmarelo) {
        getForcaTime(this.timeAmarelo);
        getForcaTime(timePreto);
//        double diferenca = Double.compare(forcaTotalAmarelo, forcaTotalPreto);
//        System.out.println(forcaTotalAmarelo);
//        System.out.println(forcaTotalPreto);
//        System.out.println(diferenca);
    }

    public double getForcaTime(List<Jogador> lista) {
        double forcaTotal = 0;
        for (Jogador j : lista) {
            forcaTotal =+ j.getForca();
            System.out.println(forcaTotal);
        }
        return forcaTotal;
    }
}

