package DTO;

/**
 *
 * @author Gabriel Possato
 */
public class UsuarioDTO {
    
    // NÃO PRECISA SER O MESMO NOME DO BANCO
    
    private int ID;
    private String Nome;
    private String Senha;

    /* ID */
    
    public int getID() {
        return ID;
    }
    
    public void setID(int ID) {
        this.ID = ID;
    }
    
    /* NOME */
    
    public String getNome() {
        return Nome;
    }
    
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    /* SENHA */
    
    public String getSenha() {
        return Senha;
    }
    
    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
}
