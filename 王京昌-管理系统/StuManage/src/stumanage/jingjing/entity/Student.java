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
public class Student {
    private String username;
    private String name;
    
        public Student(String username, String name) {
		super();
		this.name = name;
		this.username = username;
                
	}
        public Student() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name +", username="
				+ username + "]";
	}
    
}
