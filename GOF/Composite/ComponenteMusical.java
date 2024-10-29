package GOF.Composite;

public abstract class ComponenteMusical {
    /* 
     * O grupo poderá ter métodos no qual o indíviduo não. Por isso os métodos
     * abstratos são definidos como Não suportados ainda. Para não obrigar a implementação 
     * de todos os métodos.
     */

    /* Métodos para o individuo */
    public String getNomeMusica(){
        throw new UnsupportedOperationException();
    }

    public String getNomeBanda(){
        throw new UnsupportedOperationException();
    }

    /* Métodos para a coleção */
    public String getNomeAlbum(){
        throw new UnsupportedOperationException();
    }

    /* Métodos gerais */
    public int getAno(){
        throw new UnsupportedOperationException();
    }

    public void adiciona(ComponenteMusical componenteMusical){}
    public abstract void exibirInformacoes();
}
