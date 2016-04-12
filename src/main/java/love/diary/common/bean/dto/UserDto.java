package love.diary.common.bean.dto;

import love.diary.common.enums.Education;
import love.diary.common.enums.Sex;

public class UserDto extends Dto {

	private String name;
	
	private String nickName;
	
	private Sex sex;
	
	private int age;
	
	private String account;
	
	private String password;
	
	private Education education;
	
	private String email;
	
	private String mobilePhone;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Education getEducation() {
		return education;
	}

	public void setEducation(Education education) {
		this.education = education;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
