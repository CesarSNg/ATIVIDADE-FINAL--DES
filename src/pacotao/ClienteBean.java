package pacotao;

public class ClienteBean {
    private int id;
    private String nome;
    private String telRede;
    private String telCome;
    private String telCel;
    private String email;

    public ClienteBean() {
    }

    public ClienteBean(int id, String nome, String telRede, String telCome, String telCel, String email) {
        this.id = id;
        this.nome = nome;
        this.telRede = telRede;
        this.telCome = telCome;
        this.telCel = telCel;
        this.email = email;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelRede() {
        return telRede;
    }

    public void setTelRede(String telRede) {
        this.telRede = telRede;
    }

    public String getTelCome() {
        return telCome;
    }

    public void setTelCome(String telCome) {
        this.telCome = telCome;
    }

    public String getTelCel() {
        return telCel;
    }

    public void setTelCel(String telCel) {
        this.telCel = telCel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }  
}
