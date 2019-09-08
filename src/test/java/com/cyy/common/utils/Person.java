package com.cyy.common.utils;

import java.util.Date;

/** 
 * @ClassName: Person 
 * @Description: TODO
 * @author: 程远扬
 * @date: 2019年9月7日 上午11:02:52  
 */
public class Person {
	private String name;
	private Integer age;
	private String about;
	private Date regdate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public Person() {
		super();
	}
	public Person(String name, Integer age, String about, Date regdate) {
		super();
		this.name = name;
		this.age = age;
		this.about = about;
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", about=" + about + ", regdate=" + regdate + "]";
	}
	
	
	

}
