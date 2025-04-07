package gesc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name="account")
public class ACCOUNT implements Serializable {
    private Long idAccount ;
    private String name ;
    private String surname ;
    private String phone ;
    private String email ;

    @Override
    public String toString() {
        return "ACCOUNT{" +
                "idAccount=" + idAccount +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
