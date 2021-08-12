package com.wallet.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;


@Data
public class UserDTO {
	private Long id;
	@Email(message="Email inválido")
	private String email;
	@Size(min=3, max=50, message="O nome deve conter entre 3 e 50 caracteres")
	private String name;
	@NotNull
	@Size(min=6, message="A senha deve conter no mínimo 6 caracteres")
	private String password;	
}
