public class Loja extends User {
    private String razaosocial;
    private String nomefantasia;
    private String categoriadaloja;
    private String enderecocomercial;

    //Construtores

    public Loja(String razaosocial, String nomefantasia, String categoriadaloja, String enderecocomercial) {

        super (nome, cpf);
        this.razaosocial = razaosocial;
        this.nomefantasia = nomefantasia;
        this.categoriadaloja = categoriadaloja;
        this.enderecocomercial = enderecocomercial;



    }






    //getter and Setters

    public String getRazaosocial() {
        return razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    public String getEnderecocomercial() {
        return enderecocomercial;
    }

    public void setEnderecocomercial(String enderecocomercial) {
        this.enderecocomercial = enderecocomercial;
    }

    public String getCategoriadaloja() {
        return categoriadaloja;
    }

    public void setCategoriadaloja(String categoriadaloja) {
        this.categoriadaloja = categoriadaloja;
    }

    public String getNomefantasia() {
        return nomefantasia;
    }

    public void setNomefantasia(String nomefantasia) {
        this.nomefantasia = nomefantasia;
    }
}
