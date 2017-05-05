/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stumanage.jingjing.dao;

import java.util.List;
import javax.swing.JLabel;
import stumanage.jingjing.entity.Student;
import stumanage.jingjing.entity.StudentAll;
import stumanage.jingjing.entity.User;

/**
 *
 * @author Administrator
 */
public interface Dao {

    /**
     *
     * @return
     */
    List<User> selectUser();
    int insertOne(String username,String password);
    boolean login(String username,String password);
    boolean selectOneU(String username);
    boolean insertBasic(String username,String name,int age,int sex,String call,String email,String add);
    boolean insertConnection(String username,int classnum);
    boolean insertCourse(String username,String course);
    StudentAll selectStudentAll(String username);
    boolean deleteOne(String username);
    boolean superInsert(String username,String password,int classnum,String name,int sex,int age,String call,String email,String add);
    List<Student>selectFive(int num,int Size);
    int selectRownum();
    boolean updateCall(String username,String call);
    boolean updateEmi(String username,String emi);
    boolean updateAdd(String username,String add);
    boolean updateCurr(int classid,String curr);
    boolean updateTea(int classid,int teaid);
    boolean selectClass(int classid);
    boolean selectpas(String use,String pas);
    boolean updatePass(String username,String password);
    int insertGrade(String username,String grade);
}
