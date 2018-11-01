public class ExecutaSorteio {

    public static void main(String[] args) {
        Grupo grupo = new Grupo();
        grupo.criaGrupo();

        Sorteio sorteio = new Sorteio();
        sorteio.montaTimes(grupo.goleiros, grupo.zagueiros, grupo.meioCampos,
                grupo.atacantes, sorteio.timeAmarelo, sorteio.timePreto);

    }
}
