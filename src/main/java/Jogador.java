public class Jogador {

    String nome;
    int idade;
    String posicao;
    double forca;

    public Jogador(String nome, int idade, String posicao, double forca) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.forca = forca;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getPosicao() {
        return posicao;
    }
    public double getForca() {
        return forca;
    }
}
