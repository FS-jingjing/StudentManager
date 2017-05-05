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
public class User {
    private int num;
	private String password;
	public User(int num, String password) {
		super();
		this.num = num;
		this.password = password;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "用户名---"+num+",密码---"+password;
	}
}
