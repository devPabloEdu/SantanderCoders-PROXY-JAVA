package proxy;

import solucao.PessoaRepositoryProxy;

public class PessoaService {
    private PessoaRepositoryProxy pessoaRepositoryProxy;

    public PessoaService(PessoaRepositoryProxy pessoaRepository) {
        this.pessoaRepositoryProxy = pessoaRepositoryProxy;
    }

    public void save(Pessoa pessoa) {
        pessoaRepositoryProxy.save(pessoa);
    }

    public Pessoa findById(Long id){
        return pessoaRepositoryProxy.findById(id);
    }
}
