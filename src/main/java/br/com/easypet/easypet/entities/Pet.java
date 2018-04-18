package br.com.easypet.easypet.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@SequenceGenerator(name = "pet_id_seq", sequenceName = "pet_id_seq", allocationSize = 1)
@Data
@Table(name = "pets")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pet {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pet_id_seq")
	private Long id;

	private String name;
	private String gender;
	private String type;
	private Date birthDate;
	private int weight;

	public int getAge() {
		Date birthdate = getBirthDate();
		Date now = new Date();
		return now.getYear() - birthdate.getYear();
	}

	@ManyToOne
	private User user;

	@ManyToOne
	private Food food;

}
