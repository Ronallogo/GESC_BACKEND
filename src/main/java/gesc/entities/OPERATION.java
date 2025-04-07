package gesc.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;


import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name="operation")

public class OPERATION implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOperation ;


    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "UTC")
    private Date date ;
    private BigInteger montant  ;
    @Enumerated(EnumType.STRING)
    private TYPE_OPERATION typeOperation ;

    @Override
    public String toString() {
        return "OPERATION{" +
                "idOperation=" + idOperation +
                ", date=" + date +
                ", montant=" + montant +
                ", typeOperation=" + typeOperation.name() +
                '}';
    }
}
