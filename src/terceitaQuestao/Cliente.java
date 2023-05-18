package terceitaQuestao;

public class Cliente {

    private String cpf;
    private String nome;
    private String telefone;
    private String endereco;
    private boolean prioridade;
    private Cliente proximo;

    public Cliente(String cpf, String nome, String telefone, String endereco, boolean prioridade) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.prioridade = prioridade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isPrioridade() {
        return prioridade;
    }

    public void setPrioridade(boolean prioridade) {
        this.prioridade = prioridade;
    }

    public Cliente getProximo() {
        return proximo;
    }

    public void setProximo(Cliente proximo) {
        this.proximo = proximo;
    }
}
