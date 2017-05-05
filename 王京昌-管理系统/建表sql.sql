create table t_users(
u_stu_id varchar2(11) primary key,
u_stu_password varchar2(16)
);
create table t_teacher(
t_tea_id number primary key,
t_tea_name varchar2(10) not null
);
create table t_class(
c_class_id number primary key,
c_class_curr varchar2(20) not null,
t_tea_id number not null
);
create table t_stu_basic(
u_stu_id varchar2(11) primary key,
s_stu_name varchar2(10) not null,
s_stu_age number not null check(s_stu_age>6),
s_stu_sex number(1) not null check(s_stu_sex=0 or s_stu_sex=1),
s_stu_call varchar2(11) not null check(LENGTH(s_stu_call)=11),
s_stu_emi varchar2(30) not null check(REGEXP_LIKE(s_stu_emi, '[^[:space:]]+@([^[:space:]]+[.])+')),
s_stu_add varchar2(50) not null 
);
create table t_connection(
u_stu_id varchar2(11) primary key,
c_class_id number not null,
t_tea_id number not null,
s_stu_course varchar2(10),
constraints users_con_stu_id foreign key(u_stu_id) references t_users(u_stu_id),
constraints class_con_stu_id foreign key(c_class_id) references t_class(c_class_id),
constraints teacher_con_tea_id foreign key(t_tea_id) references t_teacher(t_tea_id)
);
create table t_grade(
u_stu_id varchar2(11) primary key,
g_grade number default 0,
constraints users_grade_stu_id foreign key(u_stu_id) references t_users(u_stu_id)
);
alter table t_stu_basic add constraints users_basic_id foreign key(u_stu_id) references t_users(u_stu_id);
