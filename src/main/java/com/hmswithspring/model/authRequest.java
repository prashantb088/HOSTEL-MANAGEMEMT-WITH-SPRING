package com.hmswithspring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class authRequest {
	
	private String username;
	private String userPassword;
	

}
