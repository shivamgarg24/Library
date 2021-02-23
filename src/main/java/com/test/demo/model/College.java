package com.test.demo.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Table(name = "COLLEGE")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class College {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="college_seq")
	@SequenceGenerator(initialValue=1,name="college_seq",sequenceName="college_sequence")
	@Column(name="ID")
	private Integer id;
	
	@Column(name="COLLEGE_NAME")
	private String college_name;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="ORIENTATION")
	private String orientation;
	
	@Column(name="COLLEGE_TYPE")
	private String college_type;
	
	@OneToMany(mappedBy="college",cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
	    private List<Book> books;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCollege_name() {
		return college_name;
	}

	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOrientation() {
		return orientation;
	}

	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}

	public String getCollege_type() {
		return college_type;
	}

	public void setCollege_type(String college_type) {
		this.college_type = college_type;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}


	
	}