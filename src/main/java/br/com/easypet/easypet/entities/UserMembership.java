package br.com.easypet.easypet.entities;

import java.util.Date;

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
@SequenceGenerator(name = "userMembership_id_seq", sequenceName = "userMembership_id_seq", allocationSize = 1)
@Getter
@Setter
@Table(name = "userMemberships")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserMembership {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userMembership_id_seq")
	private Long id;

	private Date dateOfStart;
	private int paymentStatus;

	@OneToOne
	private User user;

}
