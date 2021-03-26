package com.wolken.wolkenapp.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@Entity
@ToString
@Table(name = "vegetable_table")
public class VegetableDTO {
	@Id
	@Column(name = "vegetable_id")
	private int vegetableId;
	
	@Column(name = "vegetable_name")
	private String vegetableName;
	
	@Column(name = "vegetable_color")
	private String vegetableColor;

}
