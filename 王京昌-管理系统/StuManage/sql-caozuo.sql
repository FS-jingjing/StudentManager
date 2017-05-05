create user stu_jing_1 identified by 123123;
grant connect to stu_jing_1;
grant resource to stu_jing_1;
grant unlimited tablespace to stu_jing_1;
conn stu_jing_1/123123;
--用户表
create table t_users(
u_stu_id varchar2(11) primary key,
u_stu_password varchar2(16)
);
--教师表
create table t_teacher(
t_tea_id number primary key,
t_tea_name varchar2(10) not null
);
--班级表
create table t_class(
c_class_id number primary key,
c_class_curr varchar2(20) not null,
t_tea_id number not null
);
--基本信息表
create table t_stu_basic(
u_stu_id varchar2(11) primary key,
s_stu_name varchar2(10) not null,
s_stu_age number not null check(s_stu_age>6),
s_stu_sex number(1) not null check(s_stu_sex=0 or s_stu_sex=1),
s_stu_call varchar2(11) not null check(LENGTH(s_stu_call)=11),
s_stu_emi varchar2(30) not null check(REGEXP_LIKE(s_stu_emi, '[^[:space:]]+@([^[:space:]]+[.])+')),
s_stu_add varchar2(50) not null 
);
--创建外键约束 t_users为主表 t_stu_basic为从表
alter table t_stu_basic add constraints users_basic_id foreign key(u_stu_id) references t_users(u_stu_id);
alter table t_stu_basic drop constraint users_basic_id;
alter table t_connection drop constraint users_con_stu_id;
alter table t_grade drop constraint users_grade_stu_id;
-- 中间表 学生班级教师表
create table t_connection(
u_stu_id varchar2(11) primary key,
c_class_id number not null,
t_tea_id number not null,
s_stu_course varchar2(10), 
--创建外键约束 t_users为主表 t_connection为从表
constraints users_con_stu_id foreign key(u_stu_id) references t_users(u_stu_id),
--创建外键约束 c_class_id为主表 t_connection为从表
constraints class_con_stu_id foreign key(c_class_id) references t_class(c_class_id),
--创建外键约束 t_tea_id为主表 t_connection为从表
constraints teacher_con_tea_id foreign key(t_tea_id) references t_teacher(t_tea_id)
);
alter table t_stu_basic modify s_stu_call varchar2(11);
--成绩表
create table t_grade(
u_stu_id varchar2(11) primary key,
g_grade number default 0,
--创建外键约束 t_users为主表 t_grade为从表
constraints users_grade_stu_id foreign key(u_stu_id) references t_users(u_stu_id)
);
commit;
delete from t_users where u_stu_id<>10000000001 and u_stu_id<>10000000002;

