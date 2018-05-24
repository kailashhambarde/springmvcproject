package com.student.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.student.model.Student;

@Repository
public class StudentDB {

	private JdbcTemplate template; 
	
	public StudentDB() {	}
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public void insert(Student student) {
		this.template.update("INSERT INTO students(id,name,age,address,maths,phy,comp,avg) VALUES(?,?,?,?,?,?,?,?)",
				student.getId(), student.getName(), student.getAddress(), student.getAge(), student.getMath(),
				student.getPhy(), student.getComp(), student.getAvg());
	}
	

	public void delete(Student student) {
		this.template.update("DELETE FROM students where id=?", student.getId());
	}

	public void update(Student student) {
		this.template.update("UPDATE STUDENTS SET name=?,age=?,address=?,maths=?,phy=?,comp=?,avg=? where id=?",
				student.getName(), student.getAddress(), student.getAge(), student.getMath(),
				student.getPhy(), student.getComp(), student.getAvg());
	}

	public ArrayList<Student> getAllStudents() {
		return this.template.query("SELECT *FROM students", new ResultSetExtractor<ArrayList<Student>>() {  
			@Override  
			public ArrayList<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {  
				ArrayList<Student> list = new ArrayList<Student>();  
				while(rs.next()) {  
					Student student = new Student();
					student.setId(rs.getInt(1));  
					student.setName(rs.getString(2));  
					student.setAge(rs.getInt(3)); 
					student.setAddress(rs.getString(4));
					student.setMath(rs.getDouble(5));
					student.setPhy(rs.getDouble(6));
					student.setComp(rs.getDouble(7));
					student.setAvg(rs.getDouble(8));
					list.add(student);  
				}  
				return list;  
			}  
		});  
	}  
}
