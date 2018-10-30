public class ExecutaSorteio {

    public static void main(String[] args) {
        Grupo grupo = new Grupo();
        grupo.criaGrupo();

        Sorteio sorteio = new Sorteio();
        sorteio.montaTimes(grupo.goleiros);
        sorteio.montaTimes(grupo.zagueiros);
        sorteio.montaTimes(grupo.meioCampos);
        sorteio.montaTimes(grupo.atacantes);

        System.out.println("##Formação Time Amarelo:");
        System.out.println(sorteio.timeAmarelo);
        System.out.println("##Formação Time Preto:");
        System.out.println(sorteio.timePreto);

//        sorteio.estaParelho();
        sorteio.getForcaTime(sorteio.timePreto);
        sorteio.getForcaTime(sorteio.timeAmarelo);

//        System.out.println(grupo.goleiros);
//        System.out.println(grupo.zagueiros);
//        System.out.println(grupo.meioCampos);
//        System.out.println(grupo.atacantes);
    }
}
