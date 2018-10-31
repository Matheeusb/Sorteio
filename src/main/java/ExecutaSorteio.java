public class ExecutaSorteio {

    public static void main(String[] args) {
        Grupo grupo = new Grupo();
        grupo.criaGrupo();

        Sorteio sorteio = new Sorteio();
        sorteio.montaTimes(grupo.goleiros, grupo.zagueiros, grupo.meioCampos,
                grupo.atacantes, sorteio.timeAmarelo, sorteio.timePreto);

        System.out.println("##Formação Time Amarelo:");
        System.out.println(sorteio.timeAmarelo);
        System.out.println("##Formação Time Preto:");
        System.out.println(sorteio.timePreto);

//        System.out.println("##################");
//        System.out.println("#######GRUPO######");
//        System.out.println(grupo.goleiros);
//        System.out.println(grupo.zagueiros);
//        System.out.println(grupo.meioCampos);
//        System.out.println(grupo.atacantes);
    }
}
