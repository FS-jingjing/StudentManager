/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stumanage.jingjing.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import stumanage.jingjing.DBunit.DBunit;
import stumanage.jingjing.entity.Student;
import stumanage.jingjing.entity.StudentAll;
import stumanage.jingjing.entity.User;

/**
 *
 * @author Administrator
 */
public class DaoImpl implements Dao{
    Connection con=null;
    Statement stat=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    
   
    @Override
    //查询所有用户
    public List<User> selectUser() {
		List<User>list=new ArrayList<User>();
		con=DBunit.connect();
		String sql="select * from t_users";
		try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
				int num=rs.getInt(1);
				String str=rs.getString(2);
				User user=new User(num,str);
				list.add(user);
			}
		return list;
	}catch (SQLException e) {
		e.printStackTrace();
	}finally{
		DBunit.close(con, ps, rs);
	}
		return null;
}
    
    //主方法    
//    public static void main(String[] args) {
//		DaoImpl dao=new DaoImpl();
//                List<User>list=dao.selectUser();
//                for(User user:list){
//                    System.out.println(user);
//                }
//	}

    @Override
    //注册方法
    public int insertOne(String username,String password) {
        con=DBunit.connect();
	String sql="insert into t_users values(?,?)";
        int num=0;
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1,username);
            ps.setString(2, password);
            num=ps.executeUpdate();
            return num;
        } catch (SQLException ex) {
            Logger.getLogger(DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBunit.close(con, ps, null);
        }
        return 0;    
    }

    @Override
    //登陆方法
    public boolean login(String username, String password) {
        con=DBunit.connect();
        String sql="select * from t_users where u_stu_id=? and u_stu_password=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            rs=ps.executeQuery();
            if(!rs.next()){
                return false;
            }else{
                return true;
            }
        } catch (SQLException ex) {
            
        }finally{
		DBunit.close(con, ps, rs);
	} 
        return false;
    }

    @Override
    //查询用户是否存在
    public boolean selectOneU(String username) {
        
        
        try {
            con=DBunit.connect();
        String sql="select * from t_users where u_stu_id=?";
             ps=con.prepareStatement(sql);
            ps.setString(1, username);
            rs=ps.executeQuery();
            if(rs.next()){
                return true;
            }
            return false;
        } catch (SQLException ex) {
            
        }finally{
            DBunit.close(con, ps, rs);
        }
        return false;
    }

    @Override
    //插入基本表
    public boolean insertBasic(String username, String name, int age, int sex, String call, String email, String add) {
        con=DBunit.connect();
        int num=0;
        String sql="insert into t_stu_basic values(?,?,?,?,?,?,?)";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, name);
            ps.setInt(3, age);
            ps.setInt(4, sex);
            ps.setString(5, call);
            ps.setString(6, email);
            ps.setString(7, add);
            num=ps.executeUpdate();
            if(num==1){
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
           
        }finally{
            DBunit.close(con, ps, rs);
        }  
        return false;
    }

    @Override
    //插入中间表
    public boolean insertConnection(String username,int classnum) {
        con=DBunit.connect();
        int num=0;
        int t_id=0;
        String sql="select t_tea_id from t_class where c_class_id=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1, classnum);
            rs=ps.executeQuery();
            if(rs.next()){
                t_id=rs.getInt(1);
                String sql1="insert into t_connection(u_stu_id,c_class_id,t_tea_id) values(?,?,?)";
                ps=con.prepareStatement(sql1);
                ps.setString(1, username);
                ps.setInt(2, classnum);
                ps.setInt(3, t_id);
                num=ps.executeUpdate();
                if(num==1){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        } catch (SQLException ex) {
           
        }finally{
            DBunit.close(con, ps, rs);
        }
        
        return false;
    }

    @Override
    //插入选课
    public boolean insertCourse(String username,String course) {
        con=DBunit.connect();
        int num=0;
        String sql="update t_connection set s_stu_course=? where u_stu_id=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1,course);
            ps.setString(2,username);
            num=ps.executeUpdate();
            if(num==1){
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            
        }
        return false;
    }

    @Override
    //学生查询
    public StudentAll selectStudentAll(String username) {
        con = DBunit.connect();
        String sql="select b.c_class_id,a.u_stu_id,a.s_stu_name,a.s_stu_age,a.s_stu_sex,d.c_class_curr,c.t_tea_name,b.s_stu_course,a.s_stu_call,a.s_stu_emi,a.s_stu_add from t_stu_basic a,t_connection b,t_teacher c,t_class d where a.u_stu_id=b.u_stu_id and b.t_tea_id=c.t_tea_id and b.c_class_id=d.c_class_id and a.u_stu_id=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1, username);
            rs=ps.executeQuery();
            if(rs.next()){
                StudentAll sa=new StudentAll(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11));
                return sa;
            }
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBunit.close(con, ps, rs);
        }
        return null;
    }

    @Override
    //管理员删除
    public boolean deleteOne(String username) {
        con=DBunit.connect();
        int[] arr=new int[]{0,0,0,0};
        String str="";
        String sql1="delete from t_connection where u_stu_id=?";
        String sql2="delete from t_grade where u_stu_id=?";
        String sql3="delete from t_stu_basic where u_stu_id=?";
        String sql4="delete from t_users where u_stu_id=?";
        try {
            ps=con.prepareStatement(sql1);
            ps.setString(1, username);
            arr[0]=ps.executeUpdate();
            ps=con.prepareStatement(sql2);
            ps.setString(1, username);
            arr[1]=ps.executeUpdate();
            ps=con.prepareStatement(sql3);
            ps.setString(1, username);
            arr[2]=ps.executeUpdate();
            ps=con.prepareStatement(sql4);
            ps.setString(1, username);
            arr[3]=ps.executeUpdate();
            for(int i=0;i<arr.length;i++){
		str+=arr[i];
            }
            if(str.equals("1011")||str.equals("1111")){
                System.out.println(str);
                return true;
            }else{
                System.out.println(str);
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBunit.close(con, ps, rs);
        }
        return false;
    }

    @Override
    //管理员添加
    public boolean superInsert(String username, String password, int classnum, String name, int sex, int age, String call, String email, String add) {
        con=DBunit.connect();
        
        try {
            boolean flag=con.getAutoCommit();
            if(flag){
                con.setAutoCommit(false);
            }
            Savepoint save = con.setSavepoint();
            String sql1="insert into t_users values(?,?)";        
            ps=con.prepareStatement(sql1);
            ps.setString(1, username);
            ps.setString(2, password);
            if(ps.executeUpdate()==1){
                String sql2="insert into t_stu_basic values(?,?,?,?,?,?,?)";        
                ps=con.prepareStatement(sql2);
                ps.setString(1, username);
                ps.setString(2, name);
                ps.setInt(3, age);
                ps.setInt(4, sex);
                ps.setString(5, call);
                ps.setString(6, email);
                ps.setString(7, add);
                if(ps.executeUpdate()==1){
                    String sql3="select t_tea_id from t_class where c_class_id=?";
                    ps=con.prepareStatement(sql3);
                    ps.setInt(1, classnum);
                    rs=ps.executeQuery();
                        if(rs.next()){
                            String sql4="insert into t_connection(u_stu_id,c_class_id,t_tea_id) values(?,?,?)";
                            ps=con.prepareStatement(sql4);
                            ps.setString(1, username);
                            ps.setInt(2, classnum);
                            ps.setInt(3, rs.getInt(1));
                            if(ps.executeUpdate()==1){
                                con.commit();
                                return true;
                            }else{
                                con.rollback(save);
                                return false;
                            }
                        }else{
                            con.rollback(save);
                            return false;
                        }
                    
                }else{
                    con.rollback(save);
                    return false;
                }
            }else{
                con.rollback(save);
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    //管理员显示
    public List<Student> selectFive(int num, int size) {
        List<Student>list=new ArrayList<Student>();
        Student stu=null;
        con=DBunit.connect();
        
        String sql="select u_stu_id,s_stu_name from (select a.*,rownum r from t_stu_basic a) where r>? and r<?";
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1, num*size);
            ps.setInt(2,(num+1)*size+1);
            rs=ps.executeQuery();
            while(rs.next()){
                stu=new Student(rs.getString(1),rs.getString(2));
                list.add(stu);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    //获取条数
    public int selectRownum() {
        con=DBunit.connect();
        int rownum=0;
        String sql="select count(*) from t_users";
        try {
            stat=con.createStatement();
            rs=stat.executeQuery(sql);
            while(rs.next()){
                rownum=rs.getInt(1);
            }
            return rownum;
        } catch (SQLException ex) {
            Logger.getLogger(DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBunit.close(con, stat, rs);
        }
        return 0;
    }

    @Override
    //修改手机
    public boolean updateCall(String username, String call) {
        con=DBunit.connect();
        String sql="update t_stu_basic set s_stu_call=? where u_stu_id=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1, call);
            ps.setString(2, username);
            if(ps.executeUpdate()==1){
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBunit.close(con, ps, rs);
        }
        return false;
    }

    @Override
    //修改邮箱
    public boolean updateEmi(String username, String emi) {
        con=DBunit.connect();
        String sql="update t_stu_basic set s_stu_emi=? where u_stu_id=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1,emi);
            ps.setString(2, username);
            if(ps.executeUpdate()==1){
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBunit.close(con, ps, rs);
        }
        return false;
    }

    @Override
    //修改住址
    public boolean updateAdd(String username, String add) {
        con=DBunit.connect();
        String sql="update t_stu_basic set s_stu_add=? where u_stu_id=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1, add);
            ps.setString(2, username);
            if(ps.executeUpdate()==1){
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBunit.close(con, ps, rs);
        }
        return false;
    }

    @Override
    //修改课程
    public boolean updateCurr(int classid, String curr) {
        con=DBunit.connect();
        String sql="update t_class set t_class_curr=? where c_class_id=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1, curr);
            ps.setInt(2, classid);
            if(ps.executeUpdate()==1){
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBunit.close(con, ps, rs);
        }
        return false;
    }

    @Override
    //修改教师
    public boolean updateTea(int classid, int teaid) {
        con=DBunit.connect();
        String sql="update t_class set t_tea_id=? where c_class_id=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1, teaid);
            ps.setInt(2,classid);
            if(ps.executeUpdate()==1){
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBunit.close(con, ps, rs);
        }
        return false;
    }

    @Override
    public boolean selectClass(int classid) {
        con=DBunit.connect();
        String sql="select * from t_class where c_class_id=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1, classid);
            rs=ps.executeQuery();
            if(rs.next()){
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBunit.close(con, ps, rs);
        }
        return false;
    }

    @Override
    //判断密码
    public boolean selectpas(String use,String pas) {
        con=DBunit.connect();
        String pass=null;
        String sql="select u_stu_password from t_users where u_stu_id=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1, use);
            rs=ps.executeQuery();
            if(rs.next()){
                pass=rs.getString(1);
                if(pas.equals(pass)){
                    return true;
                }else{
                    return false;
                }
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBunit.close(con, ps, rs);
        }
        return false;
    }

    @Override
    public boolean updatePass(String username, String password) {
        con=DBunit.connect();
        String sql="update t_users set u_stu_password=? where u_stu_id=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1, password);
            ps.setString(2, username);
            if(ps.executeUpdate()==1){
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DBunit.close(con, ps, rs);
        }        
        return false;
    }

    @Override
    public int insertGrade(String username, String grade) {
        con=DBunit.connect();
        String sql="insert into t_grade values(?,?)";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1,username);
            ps.setString(2,grade);
            if(ps.executeUpdate()==1){
                return 1;
            }else{
                return 0;
            }
        } catch (SQLException ex) {
            
        }finally{
            DBunit.close(con, ps, rs);
        }
        return 1;
    }
    
}
