select b.c_class_id,a.u_stu_id,a.s_stu_name,a.s_stu_age,a.s_stu_sex,d.c_class_curr,c.t_tea_name,b.s_stu_course,a.s_stu_call,a.s_stu_emi,a.s_stu_add from t_stu_basic a,t_connection b,t_teacher c,t_class d where a.u_stu_id=b.u_stu_id and b.t_tea_id=c.t_tea_id and b.c_class_id=d.c_class_id and a.u_stu_id=20000000000;
commit;
delete from t_connection where u_stu_id="12345678912";
