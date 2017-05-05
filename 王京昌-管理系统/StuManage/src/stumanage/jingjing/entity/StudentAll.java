/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stumanage.jingjing.entity;

/**
 *
 * @author Administrator
 */
public class StudentAll {
        protected int class_id;
	protected String stu_id;
	protected String stu_name;
	protected int stu_age;
	protected int stu_sex;
	protected String class_curr;
	protected String tea_name;
	protected String class_course;
	protected String stu_call;
	protected String stu_emi;
	protected String stu_add;
        protected int stu_grade;
	public StudentAll(int class_id, String stu_id, String stu_name, int stu_age, int stu_sex, String class_curr,
			String tea_name, String class_course, String stu_call, String stu_emi, String stu_add) {
		super();
		this.class_id = class_id;
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.stu_age = stu_age;
		this.stu_sex = stu_sex;
		this.class_curr = class_curr;
		this.tea_name = tea_name;
		this.class_course = class_course;
		this.stu_call = stu_call;
		this.stu_emi = stu_emi;
		this.stu_add = stu_add;
	}
	public StudentAll() {
		super();
	}
	public int getClass_id() {
		return class_id;
	}
	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}
        public int getStu_grade() {
		return stu_grade;
	}
	public void setStu_grade(int stu_grade) {
		this.stu_grade = stu_grade;
	}
	public String getStu_id() {
		return stu_id;
	}
	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public int getStu_age() {
		return stu_age;
	}
	public void setStu_age(int stu_age) {
		this.stu_age = stu_age;
	}
	public int getStu_sex() {
		return stu_sex;
	}
	public void setStu_sex(int stu_sex) {
		this.stu_sex = stu_sex;
	}
	public String getClass_curr() {
		return class_curr;
	}
	public void setClass_curr(String class_curr) {
		this.class_curr = class_curr;
	}
	public String getTea_name() {
		return tea_name;
	}
	public void setTea_name(String tea_name) {
		this.tea_name = tea_name;
	}
	public String getClass_course() {
		return class_course;
	}
	public void setClass_course(String class_course) {
		this.class_course = class_course;
	}
	public String getStu_call() {
		return stu_call;
	}
	public void setStu_call(String stu_call) {
		this.stu_call = stu_call;
	}
	public String getStu_emi() {
		return stu_emi;
	}
	public void setStu_emi(String stu_emi) {
		this.stu_emi = stu_emi;
	}
	public String getStu_add() {
		return stu_add;
	}
	public void setStu_add(String stu_add) {
		this.stu_add = stu_add;
	}
	@Override
	public String toString() {
		return "StudentAll [class_id=" + class_id + ", stu_id=" + stu_id + ", stu_name=" + stu_name + ", stu_age="
				+ stu_age + ", stu_sex=" + stu_sex + ", class_curr=" + class_curr + ", tea_name=" + tea_name
				+ ", class_course=" + class_course + ", stu_call=" + stu_call + ", stu_emi=" + stu_emi + ", stu_add="
				+ stu_add + "]";
	}
}
