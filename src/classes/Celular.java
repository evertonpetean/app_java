package classes;
public class Celular {

    private String nome;
    private String sistemaOperacional;
    private int memoria;
    private float tamanhoTela;
    
    public Celular(String nome, String sistemaOperacional, int memoria, float tamanhoTela) {
        this.nome = nome;
        this.sistemaOperacional = sistemaOperacional;
        this.memoria = memoria;
        this.tamanhoTela = tamanhoTela;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public float getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(float tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    
}
