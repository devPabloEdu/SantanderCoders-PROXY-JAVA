package proxy;

public class Pessoa {

    private String nome;
    private String sobreNome;
    private String documento;
    private String email;
    private String apelido;
    private String dataDoNascimento;

    public Pessoa(String nome, String sobreNome, String documento, String email, String apelido, String dataDoNascimento) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.documento = documento;
        this.email = email;
        this.apelido = apelido;
        this.dataDoNascimento = dataDoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getDataDoNascimento() {
        return dataDoNascimento;
    }

    public void setDataDoNascimento(String dataDoNascimento) {
        this.dataDoNascimento = dataDoNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", documento='" + documento + '\'' +
                ", email='" + email + '\'' +
                ", apelido='" + apelido + '\'' +
                ", dataDoNascimento='" + dataDoNascimento + '\'' +
                '}';
    }

}
