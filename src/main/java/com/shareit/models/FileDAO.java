package com.shareit.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="files")
public class FileDAO extends AuditableDAO{

	private static final long serialVersionUID = 1L;

	@NotBlank
	@Getter
	@Setter
	private String text;
	
	@NotBlank
	@Getter
	@Setter
	private String description;
	
	@NotBlank
	@Getter
	@Setter
	private Byte[] file;
	
	@ManyToOne
	@JoinColumn(name = "user_id",nullable = false)
	@Getter
	@Setter
	private UserDAO user;
}
