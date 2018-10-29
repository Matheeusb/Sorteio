public class ExecutaSorteio {

    public static void main(String[] args) {
        Grupo grupo = new Grupo();
        grupo.criaGrupo();
        grupo.separaPosicoes();

        Sorteio sorteio = new Sorteio();
        sorteio.sorteiaTimes();

        System.out.println(sorteio.timeAmarelo.size());
        System.out.println(sorteio.timePreto.size());

        System.out.println(grupo.idadeMedia);
        System.out.println(grupo.forcaMedia);

        System.out.println(grupo.goleiros);
        System.out.println(grupo.zagueiros);
        System.out.println(grupo.meioCampos);
        System.out.println(grupo.atacantes);
    }
}
