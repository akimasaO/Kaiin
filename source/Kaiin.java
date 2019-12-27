package com.example.kaiin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "kaiin")
public class Kaiin {
	
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "user_user_id_seq")
	@SequenceGenerator(
			name = "user_user_id_seq",
			sequenceName = "userid_seq",
			initialValue = 1,
			allocationSize = 1)
	@Column(name = "userid")
	private int userid;
	
	@Column(name = "name")
	private String name;
	
	
	public void setUserId(int userid) {this.userid = userid;}
	public int getUserId() {return userid;}
	public void setName(String name) {this.name = name;}
	public String getName() {return name;}
}