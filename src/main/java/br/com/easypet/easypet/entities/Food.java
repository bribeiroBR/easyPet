package br.com.easypet.easypet.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@SequenceGenerator(name = "food_id_seq", sequenceName = "food_id_seq", allocationSize = 1)
// this replace the Get and Set generator, but including the toString method
@Data
@Table(name = "foods")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Food {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "food_id_seq")
	private Long id;

	private String name;
	private int packageWeight;
	private String region;

}
