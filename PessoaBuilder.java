package proxy;

public class PessoaBuilder {
    private String nome;
    private String sobreNome;
    private String documento;
    private String email;
    private String apelido;
    private String dataDoNascimento;

    public PessoaBuilder nome(String nome) {
        this.nome = nome;
        return this; //retorna o proprio pessoa builder
    }

    public PessoaBuilder sobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
        return this;
    }

    public PessoaBuilder documento(String documento) {
        this.documento = documento;
        return this;
    }

    public PessoaBuilder email(String email) {
        this.email = email;
        return this;
    }

    public PessoaBuilder apelido(String apelido) {
        this.apelido = apelido;
        return this;
    }

    public PessoaBuilder dataDoNascimento(String dataDoNascimento) {
        this.dataDoNascimento = dataDoNascimento;
        return this;
    }

    public Pessoa criaPessoa(){
        return new Pessoa(nome,sobreNome,documento,email,apelido,dataDoNascimento);
    }

    public Pessoa build() {
        return criaPessoa();
    }
}
