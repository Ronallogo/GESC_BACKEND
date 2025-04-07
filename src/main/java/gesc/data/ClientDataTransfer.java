package gesc.data;

public class ClientDataTransfer {
    private Long idClient ;
    private String name ;
    private String surname ;
    private String email ;
    private String phone ;

    public ClientDataTransfer(Long idClient, String name, String surname, String email, String phone) {
        this.idClient = idClient;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
    }

    public ClientDataTransfer() {
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
