package com.example.model;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class EmployeeModel {
	@NotNull
	int id;
	@NotNull
	String nik;
	@NotNull
	String name;
	@NotNull
	String email;
	@NotNull
	int sto_id;
	@NotNull
	int position_level_id;
	@NotNull
	String position_name;
	@NotNull
	String birthdate;
	@NotNull
	int education_id;
	@NotNull
	String gender;
	@NotNull
	String join_date;
	@NotNull
	int status_id;
	@NotNull
	boolean is_active;
	@NotNull
	String photo;
	@NotNull
	String created_at;
	@NotNull
	String updated_at;
}
