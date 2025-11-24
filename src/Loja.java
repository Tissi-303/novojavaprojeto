public class Loja {
    private String razaosocial;
    private String nomefantasia;
    private String categoriadaloja;
    private String enderecocomercial;

    private User dono;

    //Construtores

    public Loja(String razaosocial, User dono, String enderecocomercial, String categoriadaloja, String nomefantasia) {
        this.razaosocial = razaosocial;
        this.dono = dono;
        this.enderecocomercial = enderecocomercial;
        this.categoriadaloja = categoriadaloja;
        this.nomefantasia = nomefantasia;
    }

    //getter and Setters

    public String getRazaosocial() {
        return razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    public User getDono() {
        return dono;
    }

    public void setDono(User dono) {
        this.dono = dono;
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
