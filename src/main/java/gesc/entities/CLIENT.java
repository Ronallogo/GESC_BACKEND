package gesc.entities;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="client")
@Builder
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CLIENT implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAccount ; 
	private String name ; 
	private String surname ; 
	private String email ;
	private String phone ;


	
 
	@Override
	public String toString() {
		return "CLIENT [idAccount=" + idAccount + ", name=" + name + ", surname=" + surname + ", email=" + email
				+ ", phone=" + phone + "]";
	}
	

}
