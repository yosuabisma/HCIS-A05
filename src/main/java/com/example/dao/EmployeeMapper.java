package com.example.dao;
import org.apache.ibatis.annotations.*;
import java.util.List;

import com.example.model.EmployeeModel;
@Mapper
public interface EmployeeMapper {
	@Select("select * from employee where id = #{id}")
	EmployeeModel viewEmployee(@Param("id") int id);
	
	@Select("select * from employee where is_active = 1")
	List<EmployeeModel> viewAllEmployees();
	
	@Insert("insert into employee (id, nik, name, email, sto_id, position_level, position_name, birthdate, "
			+ "education_id, gender, join_date, status_id, is_active, photo, created_at, updated_at) values "
			+ "(#{id}, #{nik}, #{name}, #{email}, #{sto_id}, #{position_level}, #{position_name}, #{birthdate}, , #{education_id}, #{gender}, #{join_date}, #{status_id}, #{is_active}, #{photo}, #{created_at}, #{updated_at})")
	void addEmployee(EmployeeModel employee);
	
	@Update("update employee set nik = #{nik}, name = #{name}, email = #{email}, sto_id = #{sto_id}, position_level = #{position_level}, position_name = #{position_name}, birthdate = #{birthdate}, "
			+ "education_id = #{education_id}, gender = #{gender}, join_date = #{join_date}, status_id = #{status_id},"
			+ "is_active = #{is_active}, photo = #{photo}, created_at = #{created_at}, updated_at = #{updated_at}"
			+ " where id = #{id}")
	void updateEmployee(EmployeeModel employee);
	
	@Update("update employee set is_active = 0"
			+ " where id = #{id}")
	void setInactiveEmployee(@Param("id") int id);

}
