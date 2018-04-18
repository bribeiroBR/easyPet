package br.com.easypet.easypet.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@SequenceGenerator(name = "petFoodConsumption_id_seq", sequenceName = "petFoodConsumption_id_seq", allocationSize = 1)
@Getter
@Setter
@Table(name = "petFoodConsumptions")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PetFoodConsumption {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "petFoodConsumption_id_seq")
	private Long id;

	private String foodPackageCurrentLevel;
	
	

	@OneToOne
	private Pet pet;

}
