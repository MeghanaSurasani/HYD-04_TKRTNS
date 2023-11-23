package com.tns.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/* class created by Meghana Reddy
 * 21-11-23 
 */

@Entity
@Table(name="user")
public class User {
	@Id
	long id;
	String name;
	String type;
	String password;
	public User(long id , String name , String type , String password) {
		this.id=id;
		this.name=name;
		this.type=type;
		this.password=password;
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
