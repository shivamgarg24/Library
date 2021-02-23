package com.test.demo.model;

import java.util.Date;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Table(name="BOOK")
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="book_seq")
	@SequenceGenerator(initialValue=1,name="book_seq",sequenceName="book_sequence")
	@Column(name="BOOK_ID")
	private Integer Id;
	
	@Column(name="BOOK_NAME")
	private String book_name;
	
	@Column(name="AUTHOR")
	private String author;
	
	@Column(name="BOOK_NO")
	private long book_no;
	
	@Column(name="COURSE_NAME")
	private String course_name;
	
	@Temporal(TemporalType.DATE)
	@Column(name="PUBLICATION_DATE")
	private Date publication_date;
	
	@Column(name="PRICE")
	private long price;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(foreignKey=@ForeignKey(name="college_id"),name="college_id")
	private College college;


	public Integer getId() {
		return Id;
	}


	public void setId(Integer id) {
		Id = id;
	}


	public String getBook_name() {
		return book_name;
	}


	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public long getBook_no() {
		return book_no;
	}


	public void setBook_no(long book_no) {
		this.book_no = book_no;
	}


	public String getCourse_name() {
		return course_name;
	}


	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}


	public Date getPublication_date() {
		return publication_date;
	}


	public void setPublication_date(Date publication_date) {
		this.publication_date = publication_date;
	}


	public long getPrice() {
		return price;
	}


	public void setPrice(long price) {
		this.price = price;
	}


	public College getCollege() {
		return college;
	}


	public void setCollege(College college) {
		this.college = college;
	}



	
	}